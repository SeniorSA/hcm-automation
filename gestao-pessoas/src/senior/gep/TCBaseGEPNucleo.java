package senior.gep;

import java.io.BufferedWriter;
import java.io.FileWriter;

import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

import com.senior.framework.testes.SistemaSenior;
import com.senior.framework.testes.SistemaSeniorComTransacao;
import com.senior.framework.testes.executor.CommandManager;

import br.com.senior.asas.testinterfaces.ITestButton;
import br.com.senior.asas.testinterfaces.ITestLabel;

/**
 * Classe base para testes no GEP com implementa��es de apoio e utilit�rios
 * 
 * @author Marlo.back
 * 
 */

public class TCBaseGEPNucleo extends SistemaSeniorComTransacao {

    protected static Description dadosInstanciaClasseTeste;
    protected static String nomeSistemaUTI;
    protected static String parametrosSistemaUTI;
    protected static int empresaSelecionada;
    protected static int filialSelecionada;
    private static boolean modoMapeamentoAQTIME = false;

    /**
     * 
     */
    @Rule
    public TestRule watcher = new TestWatcher() {

        @Override
        protected void starting(Description description) {
            dadosInstanciaClasseTeste = description;
            System.out.println("Starting test: " + dadosInstanciaClasseTeste.getDisplayName());
        }
    };

    /**
     * Inicializa o sistema e abre uma transa��o global
     * 
     * @param nomeSistema Nome do sistema configurado no arquivo de propriedades
     * @param parametroAdicional Par�metros de inicializa��o da linha de comando
     */
    public static void iniciarSistema(String nomeSistema, String parametroAdicional) {

        if (!modoMapeamentoAQTIME) {
            SistemaSenior.iniciarSistema(nomeSistema, parametroAdicional);
            executarSQL("update r999pos set postop=0, poslef=0, sitfrm = 2");
            iniciarTransacao();
        } else {
            TCBaseGEPNucleo.nomeSistemaUTI = nomeSistema;
            TCBaseGEPNucleo.parametrosSistemaUTI = parametroAdicional;
        }
    }

    /**
     * Finaliza o sistema ap�s fechar a transa��o global
     * 
     */
    public static void finalizarSistema() {

        if (!modoMapeamentoAQTIME) {
            SistemaSeniorComTransacao.finalizarSistema();
        }
    }

    public static void reverterTransacao() {
        reverterTransacao("", "");
    }

    /**
     * Reverte a transa��o (rollback) e garante o fechamento de eventuais telas
     * pendentes
     */
    public static void reverterTransacao(String nomeSistema, String parametroAdicional) {
        String errorFocusReadTimeout = "";
        try {
            fecharJanelasPendentes();
        } catch (Exception e) {
            errorFocusReadTimeout = e.getMessage();
            bypassTimeout(nomeSistema, parametroAdicional, e.getMessage());
            if (errorFocusReadTimeout.contains("N�mero excessivo de janelas pendentes a fechar")) {
                throw new RuntimeException(e.getMessage());
            }
            if (e.getMessage().contains("Access ")) {
                throw new RuntimeException(e.getMessage());
            }
            
        } finally {
            if (!modoMapeamentoAQTIME) {
                //Quando ocorrer o erro de foco no sistema n�o deve reverter a transa��o j� que o sistema recebe um kill
                if (errorFocusReadTimeout.equals("")) {
                    try {
                        SistemaSeniorComTransacao.reverterTransacao();
                    } catch (Exception e) {
                        if (e.getMessage().contains("There is no active transaction")) {} else {
                            e.printStackTrace();
                        }
                    }
                }
            } else {
                String telas[][] = recuperaValoresBaseDados("SELECT itemnam FROM R975PRP");
                try {
                    BufferedWriter outputWriter = new BufferedWriter(new FileWriter("w:/telas.txt"));

                    for (int i = 0; i < telas.length; i++) {
                        outputWriter.write(telas[i][0] + "\r\n");
                    }

                    outputWriter.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                SistemaSeniorComTransacao.finalizarSistema();
            }
        }
    }

    /**
     * Criado m�todo para finalizar e iniciar o sistema com os par�metros que
     * foram passados no teste para evitar que o timeout quebre todos os
     * cen�rios seguintes
     * 
     * @param nomeSistema
     * @param parametroAdicional
     */
    private static void bypassTimeout(String nomeSistema, String parametroAdicional, String erro) {
        try {
            SistemaSeniorComTransacao.reverterTransacao();
        } catch (Exception e) {
            if (e.getMessage().contains("There is no active transaction")) {
            }
        } 
        if (erro.contains("Read timed out") || erro.contains("NullPointerException") || erro.contains("Access ") || erro.contains("Time out") || erro.contains("Aplica��o n�o est� conectada.")) {
            SistemaSenior.finalizarSistema();
            SistemaSenior.iniciarSistema(nomeSistema, parametroAdicional);
        }
    }

    /**
     * Script para trocar a empresa ativa (otimizado para trocar empresa/filial
     * apenas se houver necessidade)
     * 
     * @param empresa C�digo da empresa
     * @param filial C�digo da filial
     */
    public static void selecionarEmpresaFilial(int empresa, int filial) {

        TCBaseGEPNucleo.empresaSelecionada = empresa;
        TCBaseGEPNucleo.filialSelecionada = filial;

        if (modoMapeamentoAQTIME) return;

        if (empresa == 0) {
            throw new RuntimeException("� requerido o c�digo da empresa no m�todo 'selecionarEmpresaFilial'");
        }

        if (filial == 0) {
            throw new RuntimeException("� requerido o c�digo da filial no m�todo 'selecionarEmpresaFilial'");
        }

        // Expandir painel de navega��o, se necess�rio
        ITestButton btExpandirPainelNavegacao = (ITestButton) commandManager.getChild("SBMax");
        if (btExpandirPainelNavegacao.isVisible()) {
            btExpandirPainelNavegacao.click();
        }

        // Expandir painel de informa��o, se necess�rio
        ITestButton btExpandirPainelInfo = (ITestButton) commandManager.getChild("sbInfoPaneMinMax");
        ITestLabel labelEmpresa = (ITestLabel) commandManager.getChild("InfoPanelLabel2");
        ITestLabel labelFilial = (ITestLabel) commandManager.getChild("InfoPanelLabel3");
        if (!labelEmpresa.isVisible()) {
            btExpandirPainelInfo.click();
        }

        // Descobrir se j� est� posicionado na empresa correta
        String[] codEmp = labelEmpresa.getText().split(" ");

        // Trocar empresa
        if (Integer.valueOf(codEmp[0]) != empresa) {
            abrirTela("FSELEMP");
            if (empresa > 40) {
                clicar("BtnPesquisar"); // Abre tela "Pesquisa de registro";
                selecionarGuia("PCPsqReg", "Filtro Avan�ado"); // Seleciona guia "Filtro Avan�ado"
                preencherCampo("mmAdvFlt", "CODEMP = " + Integer.toString(empresa)); // Informa a empresa no Filtro
                marcarCaixaAtribuicao("ckApplyAdvFlt"); //Marca checkbox "Aplicar filtro"
                clicar("BtnOK"); //Clica no Ok da tela "Pesquisa de registro"
                clicar("BtnOK"); //Clica no Ok da tela FRSELEMP
            } else {
                posicionarLinhaGradePorValor("GridE070EMP", "Empresa", Integer.toString(empresa));
                clicar("BtnOk");
            }
        }

        // Descobrir se j� est� posicionado na filial correta
        String[] codFil = labelFilial.getText().split(" ");

        // Trocar filial
        if (Integer.valueOf(codFil[0]) != filial) {
            abrirTela("FSELFIL");
            if (filial > 10) {
                clicar("BtnPesquisar"); // Abre tela "Pesquisa de registro";
                selecionarGuia("PCPsqReg", "Filtro Avan�ado"); // Seleciona guia "Filtro Avan�ado"
                preencherCampo("mmAdvFlt", "CODFIL = " + Integer.toString(filial)); // Informa a filial no Filtro
                marcarCaixaAtribuicao("ckApplyAdvFlt"); //Marca checkbox "Aplicar filtro"
                clicar("BtnOK"); //Clica no Ok da tela "Pesquisa de registro"
                clicar("BtnOK"); //Clica no Ok da tela FRSELFIL
            } else {
                posicionarLinhaGradePorValor("GridE070FIL", "Filial", Integer.toString(filial));
                clicar("BtnOk");
            }
        }
    }

    /**
     * Retorna a inst�ncia do manipulador de comandos para programa��o avan�ada
     * 
     * @return manipulador
     */
    public static CommandManager getManipuladorDeComandos() {

        return commandManager;
    }

    /**
     * Fechar todas as janelas abertas at� encontrar o menu principal
     * 
     */
    public static void fecharJanelasPendentes() {

        byte max = 0;
        JanelaAtiva j = new JanelaAtiva();

        while (!j.getNome().equalsIgnoreCase("FRMENPRI")) {
            if (j.getNome().equals("FrmMessage")) {
                TCBaseGEP.fecharTela(j.getNome());
            }
            else if (j.getDescricao().contains("Access ")) {
                throw new RuntimeException("Tentou fechar a tela ativa, mas encontrou a tela com a seguinte descri��o: " + j.getDescricao());
            } else {
                fecharTela(j.getNome());
            }
            j = new JanelaAtiva();
            if (max++ > 10) {
                throw new RuntimeException("N�mero excessivo de janelas pendentes a fechar: " + new JanelaAtiva());
            }
        }
    }
}
