package senior.gep.utils;

import com.senior.framework.testes.SistemaSenior;
import com.senior.framework.testes.SistemaSeniorComTransacao;
import com.senior.framework.testes.Tecla;

import br.com.senior.asas.testinterfaces.ITestButton;
import br.com.senior.asas.testinterfaces.ITestLabel;
import senior.gep.componentNames.FRSELCALFormHandler;
import senior.gep.componentNames.FRSELEMPFormHandler;

public class FacilitadoresGerarPessoas extends SistemaSeniorComTransacao {

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
	
}
