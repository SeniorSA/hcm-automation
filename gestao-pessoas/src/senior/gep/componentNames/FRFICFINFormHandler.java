package senior.gep.componentNames;

import com.senior.framework.testes.SistemaSenior;
import com.senior.framework.testes.Tecla;

public final class FRFICFINFormHandler {

    private FRFICFINFormHandler() {
    }

    private static final String FR_NOME = "FRFICFIN";
    private static final String FD_COLABORADOR = "SENumCad";
    private static final String BT_RECALCULAR = "BtnRecalcular";

    public static void setColaborador(final String valor) {
        SistemaSenior.preencherCampo(FD_COLABORADOR, valor, Tecla.TAB);
    }

    public static void abrirTela() {
        SistemaSenior.abrirTela(FR_NOME);
    }

    public static void fecharTela() {
        SistemaSenior.fecharTela(FR_NOME);
    }

    public static void clickRecalcular() {
        SistemaSenior.clicar(BT_RECALCULAR);
    }

}
