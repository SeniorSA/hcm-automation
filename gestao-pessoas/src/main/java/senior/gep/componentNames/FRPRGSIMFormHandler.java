package senior.gep.componentNames;

import com.senior.framework.testes.SistemaSenior;
import com.senior.framework.testes.Tecla;

public class FRPRGSIMFormHandler {

    private FRPRGSIMFormHandler() {
    }

    private static final String FR_NOME = "FRPRGSIM";
    private static final String FD_PERIODO_INICIO = "SEPerIni";
    private static final String FD_PERIODO_FIM = "SEPerFim";
    private static final String FD_MULTA_FERIAS_DOBRO = "SEMultaDob";
    private static final String BT_CALCULAR = "BtnCalcular";

    public static void abrirTela() {
        SistemaSenior.abrirTela(FR_NOME);
    }

    public static void fecharTela() {
        SistemaSenior.fecharTela(FR_NOME);
    }

    public static void setPeriodoInicio(final String valor) {
        SistemaSenior.preencherCampo(FD_PERIODO_INICIO, valor, Tecla.TAB);
    }

    public static void setPeriodoFim(final String valor) {
        SistemaSenior.preencherCampo(FD_PERIODO_FIM, valor, Tecla.TAB);
    }

    public static void setMultaFeriasDobro(final String valor) {
        SistemaSenior.preencherCampo(FD_MULTA_FERIAS_DOBRO, valor, Tecla.TAB);
    }

    public static void clickCalcular() {
        SistemaSenior.clicar(BT_CALCULAR);
    }

}
