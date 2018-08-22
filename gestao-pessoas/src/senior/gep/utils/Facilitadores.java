package senior.gep.utils;

import com.senior.framework.testes.SistemaSenior;
import com.senior.framework.testes.Tecla;

import senior.gep.componentNames.FRSELCALFormHandler;
import senior.gep.componentNames.FRSELEMPFormHandler;

public class Facilitadores {

	public static void selecionarEmpresa(int codigoEmpresa) {
		FRSELEMPFormHandler.abrirTela();
		FRSELEMPFormHandler.setCodigo(Integer.toString(codigoEmpresa));
		SistemaSenior.teclarCombinacao(Tecla.ALT, Tecla.Q);
		FRSELEMPFormHandler.clickOk();
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
