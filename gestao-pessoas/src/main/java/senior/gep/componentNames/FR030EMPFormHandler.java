package senior.gep.componentNames;

import com.senior.framework.testes.SistemaSenior;
import com.senior.framework.testes.Tecla;

public class FR030EMPFormHandler {

    private FR030EMPFormHandler() {
    }

    private static final String FR_NOME = "FR030EMP";
    private static final String FD_EMPRESA = "NumEmp";
    private static final String FD_FERIAS_INTERROMPIDAS = "UsaFIn";
    private static final String BT_ALTERAR = "BtnAlterar";

    public static void abrirTela() {
        SistemaSenior.abrirTela(FR_NOME);
    }

    public static void fecharTela() {
        SistemaSenior.fecharTela(FR_NOME);
    }

    public static void setEmpresa(final String valor) {
        SistemaSenior.preencherCampo(FD_EMPRESA, valor, Tecla.TAB);
    }

    public static void setFeriasInterrompidas(final String valor) {
        SistemaSenior.preencherCampo(FD_FERIAS_INTERROMPIDAS, valor, Tecla.TAB);
    }

    public static void clickAlterar() {
        SistemaSenior.clicar(BT_ALTERAR);
    }

}
