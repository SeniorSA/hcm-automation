package senior.gep.utils;

import static org.junit.Assert.fail;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.senior.framework.testes.SistemaSenior;
import com.senior.framework.testes.SistemaSeniorComTransacao;
import com.senior.framework.testes.Tecla;
import com.senior.framework.testes.executor.CommandManager;
import com.senior.framework.testes.smoking.AccessibleSystem;

import br.com.senior.asas.testinterfaces.ITestButton;
import br.com.senior.asas.testinterfaces.ITestLabel;
import br.com.senior.asas.testinterfaces.ITestMessage;
import br.com.senior.qa.logger.LoggerFramework;
import br.com.senior.qa.properties.ApplicationProperties;
import junit.framework.Assert;
import senior.gep.JanelaAtiva;
import senior.gep.componentNames.FRSELCALFormHandler;
import senior.gep.componentNames.FRSELEMPFormHandler;

public class Facilitadores extends SistemaSeniorComTransacao {

    /**
     * Script para trocar a empresa ativa (otimizado para trocar empresa apenas se
     * houver necessidade)
     * <p>
     * <b>ATENÇÃO</b>: O número da empresa deve ser passado sem os zeros na frente do número da empresa.
     * Exemplo: Empresa 0016, utiliza-se <b>selecionarEmpresaFilial(16)</b>.
     * 
     * @param empresa
     *            Código da empresa
     */
    public static void selecionarEmpresa(int empresa) {
        if (empresa == 0) {
            throw new RuntimeException("É requerido o código da empresa no método 'selecionarEmpresa'");
        }

        // Expandir painel de navegação, se necessário
        ITestButton btExpandirPainelNavegacao = (ITestButton) commandManager.getChild("SBMax");
        if (btExpandirPainelNavegacao.isVisible()) {
            btExpandirPainelNavegacao.click();
        }

        // Expandir painel de informação, se necessário
        ITestButton btExpandirPainelInfo = (ITestButton) commandManager.getChild("sbInfoPaneMinMax");
        ITestLabel labelEmpresa = (ITestLabel) commandManager.getChild("InfoPanelLabel3");
        if (!labelEmpresa.isVisible()) {
            btExpandirPainelInfo.click();
        }

        // Descobrir se já está posicionado na empresa correta
        String[] codEmp = labelEmpresa.getText().split(" ");

        // Trocar empresa
        if (Integer.valueOf(codEmp[0]) != empresa) {
            FRSELEMPFormHandler.abrirTela();
            FRSELEMPFormHandler.setCodigo(Integer.toString(empresa));
            SistemaSenior.clicar("BtnPesquisa");
            FRSELEMPFormHandler.clickOk();
        }
    }

	public static void selecionarCalculo(String codigoCalculo) {
		FRSELCALFormHandler.abrirTela();
		FRSELCALFormHandler.setCodigo(codigoCalculo);
		SistemaSenior.teclarCombinacao(Tecla.ALT, Tecla.Q);
		FRSELCALFormHandler.clickOk();
	}

	public static void trocaUsuario(String NomUsuario, String SenUsuario) {
		SistemaSenior.teclar(Tecla.F7);
		SistemaSenior.preencherCampo("SENomUsu", NomUsuario, Tecla.TAB);
		SistemaSenior.preencherCampo("SESenUsu", SenUsuario, Tecla.TAB);
		SistemaSenior.clicar("BtnOk");
	}
	
    /**
     * Fecha a tela de notas da versão, caso ela apareça.
     */
    public static void fecharTelaNotasVersao() {
        String TELA_NOTAS_VERSAO = "FR000DUS";
        if (commandManager.getApplication().getActiveForm().getName().equals(TELA_NOTAS_VERSAO)) {
            SistemaSenior.marcarCaixaAtribuicao("CBVerNov");
            SistemaSenior.clicar("BtnNao");
        }
    }

    /**
     * Salvar um arquivo XML na pasta <relatoriosGerados>
     * 
     * @param NOME_ARQUIVO_XML
     */
    public static void salvarArquivoXML(String NOME_ARQUIVO_XML) {
        SistemaSenior.teclar(Tecla.POPUPMENU);
        SistemaSenior.teclar(Tecla.S);
        SistemaSenior.teclar(Tecla.END);
        SistemaSenior.salvarArquivo(SistemaSenior.obterCaminhoRelGerado(true) + NOME_ARQUIVO_XML);
    }
    
    /**
     * Valida se existe uma mensagem sendo exibida em tela, utilizar para tratar exceções (como mensagens de pedido
     * bloqueado, por exemplo)
     * 
     * @param mensagemEsperada
     * @return
     */
    public static String validarSeExisteMensagem(String mensagemEsperada) {
        if (AccessibleSystem.getCommandManager().getApplication().hasMessage()) {
            final ITestMessage existeMensagem = AccessibleSystem.getCommandManager().getApplication().getMessage();
            if (existeMensagem.getDescription().equals(mensagemEsperada)) {
                getManipuladorDeComandos().getApplication().getMessage().click("&Ok");
            }
        }
        return mensagemEsperada;
    }

    /**
     * Fecha a tela de informações do eSocial, caso ela apareça.
     */
    public static void fecharTelaInfosESocial() {
        String TELA_INFORMACOES_ESOCIAL = "FR000FLU";
        if (commandManager.getApplication().getActiveForm().getName().equals(TELA_INFORMACOES_ESOCIAL)) {
            SistemaSenior.fecharTela(TELA_INFORMACOES_ESOCIAL);
        }
    }

    /**
     * Fecha a tela de comunicados, caso ela apareça.
     */
    public static void fecharTelaComunicados() {
        String TELA_COMUNICADOS = "FR000WSM";
        if (commandManager.getApplication().getActiveForm().getName().equals(TELA_COMUNICADOS)) {
            SistemaSenior.marcarCaixaAtribuicao("SCBMostrar");
            SistemaSenior.clicar("BtnOk");
        }
    }
    
    /**
     * Retorna a instância do manipulador de comandos para programação avançada
     * 
     * @return manipulador
     */
    public static CommandManager getManipuladorDeComandos() {

        return commandManager;
    }
    
    /**
     * Fechar todas as janelas abertas até encontrar o menu principal
     * 
     */
    public static void fecharJanelasPendentes() {

        byte max = 0;
        JanelaAtiva j = new JanelaAtiva();

        while (!j.getNome().equalsIgnoreCase("FRMENPRI")) {
            if (j.getNome().equals("FrmMessage")) {
                fecharTela(j.getNome());
            } else if (j.getDescricao().contains("Access ")) {
                throw new RuntimeException("Tentou fechar a tela ativa, mas encontrou a tela com a seguinte descrição: " + j.getDescricao());
            } else {
                fecharTela(j.getNome());
            }
            j = new JanelaAtiva();
            if (max++ > 10) {
                throw new RuntimeException("Número excessivo de janelas pendentes a fechar: " + new JanelaAtiva());
            }
        }
    }
    
    /**
     * Salva arquivos de logs exibidos na tela F000EDI.<br>
     * <p>
     * O nome do arquivo será salvo no diretório de relatórios gerados, conforme "caminho.relatorios.gerados" definido
     * no framework.properties.<br>
     * <p>
     * O nome do arquivo será salvo com o nome padrão sugerido pelo sistema.
     * Posteriormente é possível conferir este relatório gerado, comparando-o com um arquivo gabarito.
     */
    public static void salvarArquivoTelaLog() {
        SistemaSenior.clicarMenu("Arquivo", "Salvar Como");
        SistemaSenior.salvarArquivo(SistemaSenior.obterCaminhoRelGerado(true));
        SistemaSenior.teclar(Tecla.ENTER);
        SistemaSenior.clicarMenu("Arquivo", "Salvar Como");
        SistemaSenior.salvarArquivo(SistemaSenior.obterCaminhoRelGerado(true) + "\\log.LOG");
        fecharTela("F000EDI");
    }
    
    /**
     * Confere o valor inexistente da TAG de um arquivo XML.<br>
     * <b>Exemplo:</b><br>
     * <code>conferirTagArquivoXmlInexistente("arquivo.xml",  "tag1", "tag2");</code>
     * 
     * @param arquivoXml Caminho do arquivo XML para conferir.
     * @param tags Caminho das TAGs com valor para conferir.
     */
    public static void conferirTagArquivoXmlInexistente(final String arquivoXml, final String... tags) {
        File arquivo = new File(ApplicationProperties.getReportGeneratedPath() + File.separator + arquivoXml);

        try {
            final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            final DocumentBuilder builder = factory.newDocumentBuilder();
            final org.w3c.dom.Document document = builder.parse(arquivo);

            final XPathFactory xPathfactory = XPathFactory.newInstance();
            final XPath xpath = xPathfactory.newXPath();

            final XPathExpression xPathExpression = xpath.compile(mountXPathExpression(tags));

            final NodeList nodeListResult = (NodeList) xPathExpression.evaluate(document, XPathConstants.NODESET);

            if (nodeListResult.getLength() >= 1) {
                Assert.fail("O caminho de TAGs informado foi encontrado");
            }

        } catch (SAXException | ParserConfigurationException | XPathExpressionException e) {
            e.printStackTrace();
        } catch (final IOException fnf) {
            Assert.fail("O arquivo informado não foi encontrado: " + arquivoXml);
        }
    }
    
    /**
     * Retorna a hora atual no formato do banco de dados.
     * 
     * @return data no formato do banco de dados.
     */
    public static int retornarHoraAtual() {
        String horaAtual = SistemaSenior.horaAtual();
        String horas = horaAtual.substring(0, 2);
        String minutos = horaAtual.substring(3, 5);
        return Integer.parseInt(horas) * 60 + Integer.parseInt(minutos);
    }

    /**
     * Gera um número aleatório para utilizar dinamicamente em testes automatizados.
     * 
     * @return
     */
    public static int gerarNumeroAleatorio() {
        int numeroAleatorio = (int) (3500 + Math.random() * 1000);
        return numeroAleatorio;
    }

    /**
     * Gera um número de CNPJ aleatoriamente.
     * 
     * @return
     */
    public static String gerarCNPJ() {
        int digito1 = 0, digito2 = 0, resto = 0;
        String nDigResult;
        String numerosContatenados;
        String numeroGerado;
        Random numeroAleatorio = new Random();
        //numeros gerados
        int n1 = numeroAleatorio.nextInt(10);
        int n2 = numeroAleatorio.nextInt(10);
        int n3 = numeroAleatorio.nextInt(10);
        int n4 = numeroAleatorio.nextInt(10);
        int n5 = numeroAleatorio.nextInt(10);
        int n6 = numeroAleatorio.nextInt(10);
        int n7 = numeroAleatorio.nextInt(10);
        int n8 = numeroAleatorio.nextInt(10);
        int n9 = numeroAleatorio.nextInt(10);
        int n10 = numeroAleatorio.nextInt(10);
        int n11 = numeroAleatorio.nextInt(10);
        int n12 = numeroAleatorio.nextInt(10);
        int soma = n12 * 2 + n11 * 3 + n10 * 4 + n9 * 5 + n8 * 6 + n7 * 7 + n6 * 8 + n5 * 9 + n4 * 2 + n3 * 3 + n2 * 4 + n1 * 5;
        int valor = (soma / 11) * 11;
        digito1 = soma - valor;
        //Primeiro resto da divisão por 11.
        resto = (digito1 % 11);
        if (digito1 < 2) {
            digito1 = 0;
        } else {
            digito1 = 11 - resto;
        }
        int soma2 = digito1 * 2 + n12 * 3 + n11 * 4 + n10 * 5 + n9 * 6 + n8 * 7 + n7 * 8 + n6 * 9 + n5 * 2 + n4 * 3 + n3 * 4 + n2 * 5 + n1 * 6;
        int valor2 = (soma2 / 11) * 11;
        digito2 = soma2 - valor2;
        //Primeiro resto da divisão por 11.
        resto = (digito2 % 11);
        if (digito2 < 2) {
            digito2 = 0;
        } else {
            digito2 = 11 - resto;
        }
        //Conctenando os numeros
        numerosContatenados = String.valueOf(n1) + String.valueOf(n2) + "." + String.valueOf(n3) + String.valueOf(n4) + String.valueOf(n5) + "." + String.valueOf(n6) + String.valueOf(n7) + String.valueOf(n8) + "/" + String.valueOf(n9) + String.valueOf(n10) + String.valueOf(n11) + String.valueOf(n12) + "-";
        //Concatenando o primeiro resto com o segundo.
        nDigResult = String.valueOf(digito1) + String.valueOf(digito2);
        numeroGerado = numerosContatenados + nDigResult;
        return numeroGerado;
    }
    
    private static StringBuilder mountNodeElement(final String[] splittedTag) {
        final int TAG_NAME_INDEX = 0;
        final StringBuilder xPathElement = new StringBuilder(splittedTag[TAG_NAME_INDEX]);
        for (int tagAttributeIndex = 1; tagAttributeIndex < splittedTag.length; tagAttributeIndex++) {
            xPathElement.append("[@").append(splittedTag[tagAttributeIndex]);
            if (tagAttributeIndex < splittedTag.length - 1) {
                xPathElement.append(" and ");
            }

            xPathElement.append("]");
        }
        return xPathElement;
    }
    
    private static String mountXPathExpression(final String[] tags) {
        final StringBuilder xPathExpression = new StringBuilder("/");
        for (final String tag : tags) {
            final String[] splittedTag = splitTag(tag);
            final StringBuilder xPathElement = mountNodeElement(splittedTag);

            xPathExpression.append("/").append(xPathElement);
        }

        return xPathExpression.append("/text()").toString();
    }

    private static String[] splitTag(final String tagElement) {
        String[] tag;
        if ((tag = tagElement.trim().split(" ")).length > 1) {
            return tag;
        }

        return new String[] { tagElement };
    }
    
    /**
     * Verifica se existe arquivos no caminho informado
     * 
     * @param caminho dos arquivos
     */
    public static void existeAquivosDiretorio(String caminhoDosArquivos) {
        File pasta = new File(caminhoDosArquivos);
        if (pasta.isDirectory()) {
            if (pasta.listFiles().length > 0) LoggerFramework.addDebug("Arquivos removidos no caminho: " + caminhoDosArquivos);
            else Assert.fail("Diretório de arquivos " + caminhoDosArquivos + ", não possui nenhum arquivo.");
        } else Assert.fail("O caminho dos arquivos não foi encontrado.");
    }
    
    /**
     * Exclui todos os arquivos no caminho informado
     * 
     * @param caminho dos arquivos
     */
    public static void removerTodosArquivos(String caminhoDosArquivos) {
        File pasta = new File(caminhoDosArquivos);
        if (pasta.isDirectory()) {
            File[] listaAquivos = pasta.listFiles();
            for (File aquivo : listaAquivos) {
                aquivo.delete();
            }
            LoggerFramework.addDebug("Arquivos removidos no caminho: " + caminhoDosArquivos);
        } else Assert.fail("O caminho dos arquivos não foi encontrado.");
    }
    
    private static boolean isJanelaAvisoOuConfirmacao(JanelaAtiva j) {
        if (j.getTitulo().equals("Aviso") || j.getTitulo().equals("Confirmação")) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Retorna o caminho das massas de dados (framework.properties).
     * 
     * @param caminhoAbsoluto caminhoAbsoluto
     * 
     * @return ApplicationProperties.getDataMassPath();
     */
    public static String obterCaminhoMassa(boolean caminhoAbsoluto) {
        if (caminhoAbsoluto) {
            File f = new File(ApplicationProperties.getFrameworkTestesDir() + File.separator + ApplicationProperties.getDataMassPath());
            return f.getAbsolutePath();
        }
        return ApplicationProperties.getDataMassPath();
    }

    /**
     * Retorna o caminho dos relatórios/arquivos esperados (framework.properties).
     * 
     * @return ApplicationProperties.getReportExpectedPath();
     */
    public static String obterCaminhoRelEsperado() {
        return ApplicationProperties.getReportExpectedPath();
    }

    /**
     * Verifica se um determinado caractere ou um conjunto de caracteres existem em um arquivo texto.<br>
     * Se não existir, o teste irá falhar.<br>
     * 
     * <p>
     * <b>Exemplo:</b>
     * </p>
     * <p>
     * <code>conferirSeExisteEmRelatorioTxt("c:/sped.txt", "|0400|1101|Compra para Industrialização|");</code>
     * </p>
     * 
     * @param relatorioGerado
     *            caminho e nome do relatório que deve ser utilizado na pesquisa
     * @param termo
     *            caractere ou conjunto de caracteres que serão pesquisados no relatório
     */
    public static void conferirSeExisteEmRelatorioTxt(String relatorioGerado, String termo) {

        LoggerFramework.addDebug("Executando o comando: conferirSeExisteEmRelatorioTxt(relatório = " + relatorioGerado + ", termo = " + termo + ")");

        int resultado = 0;
        int numeroLinhas = 0;

        File arq = new File(relatorioGerado);

        if (arq.exists()) {
            LoggerFramework.addDebug("Arquivo encontrado: '" + relatorioGerado + "'");
            LoggerFramework.addDebug("Procurando pelo termo: '" + termo + "'");
            try {
                FileReader reader = new FileReader(relatorioGerado);
                BufferedReader leitor = new BufferedReader(reader);

                while (leitor.ready()) {
                    String linha = leitor.readLine();
                    numeroLinhas++;

                    if (linha.contains(termo)) {
                        LoggerFramework.addDebug("Encontrou: linha [" + numeroLinhas + "] Conteúdo: " + linha);
                        resultado++;
                    }
                }

                leitor.close();
                reader.close();

            } catch (Exception erro) {
                LoggerFramework.addDebug("Ocorreu um erro ao ler o arquivo");
                erro.printStackTrace();
            }

            if (resultado != 0) {
                LoggerFramework.addDebug("Encontrados " + resultado + " resultados");
            } else {
                LoggerFramework.addDebug("O termo '" + termo + "' não foi encontrado no arquivo: '" + relatorioGerado + "'");
                fail("O termo '" + termo + "' não foi encontrado no arquivo: '" + relatorioGerado + "'");
            }

        } else {
            LoggerFramework.addDebug("O arquivo não foi encontrado: " + relatorioGerado);
            fail("O arquivo não foi encontrado: " + relatorioGerado);
        }

    }
    
    /**
     * Criado método para finalizar e iniciar o sistema com os parâmetros que foram
     * passados no teste para evitar que o timeout quebre todos os cenários
     * seguintes
     * 
     * @param nomeSistema
     * @param parametroAdicional
     */
    private static void bypassTimeout(String nomeSistema, String parametroAdicional, String erro) {
        try {
            SistemaSeniorComTransacao.reverterTransacao();
        } catch (Exception e) {
            if (e.getMessage().contains("There is no active transaction")) {}
        }
        if (erro.contains("Read timed out") || erro.contains("NullPointerException") || erro.contains("Access ") || erro.contains("Time out") || erro.contains("Aplicação não está conectada.")) {
            SistemaSenior.finalizarSistema();
            SistemaSenior.iniciarSistema(nomeSistema, parametroAdicional);
        }
    }
    
    /**
     * Reverte a transação (rollback) e garante o fechamento de eventuais telas
     * pendentes
     */
    public static void reverterTransacao(String nomeSistema, String parametroAdicional) {
        String errorFocusReadTimeout = "";
        try {
            fecharJanelasPendentes();
        } catch (Exception e) {
            errorFocusReadTimeout = e.getMessage();
            bypassTimeout(nomeSistema, parametroAdicional, e.getMessage());
            if (errorFocusReadTimeout.contains("Número excessivo de janelas pendentes a fechar")) {
                throw new RuntimeException(e.getMessage());
            }
            if (e.getMessage().contains("Access ")) {
                throw new RuntimeException(e.getMessage());
            }

        } finally {
            // Quando ocorrer o erro de foco no sistema não deve reverter a transação já que
            // o sistema recebe um kill
            if (errorFocusReadTimeout.equals("")) {
                try {
                    SistemaSeniorComTransacao.reverterTransacao();
                } catch (Exception e) {
                    if (e.getMessage().contains("There is no active transaction")) {} else {
                        e.printStackTrace();
                    }
                }
            } else {
                SistemaSenior.finalizarSistema();
                SistemaSenior.iniciarSistema(NomeSistema.HCM, NomeUsuarios.ESOCIAL);
            }
        }
    }
	
}
