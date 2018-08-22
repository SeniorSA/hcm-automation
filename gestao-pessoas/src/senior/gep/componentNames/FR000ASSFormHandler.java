package senior.gep.componentNames;

import com.senior.framework.testes.SistemaSenior;
import com.senior.framework.testes.Tecla;

public final class FR000ASSFormHandler {

    private FR000ASSFormHandler() {
    }

    private static final String FR_NOME = "FR000ASS";
    private static final String FD_HORAS_CENTESIMAIS = "HorCen";

    public static void abrirTela() {
        SistemaSenior.abrirTela(FR_NOME);
    }

    public static void fecharTela() {
        SistemaSenior.fecharTela(FR_NOME);
    }

    public static void setHorasCentesimais(final String valor) {
        SistemaSenior.preencherCampo(FD_HORAS_CENTESIMAIS, valor, Tecla.TAB);
    }

}
