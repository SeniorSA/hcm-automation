package senior.gep.componentNames;

import com.senior.framework.testes.SistemaSenior;

public class FREVERCSFormHandler {

    private FREVERCSFormHandler() {
    }

    private static final String FR_NOME = "FREVERCS";
    private static final String BT_AVANCAR = "BtnAvancar";

    public static void abrirTela() {
        SistemaSenior.abrirTela(FR_NOME);
    }

    public static void fecharTela() {
        SistemaSenior.fecharTela(FR_NOME);
    }

    public static void clickAvancar() {
        clickAvancar(1);
    }

    public static void clickAvancar(int clickCount) {
        for (int i = 0; i < clickCount; i++) {
            SistemaSenior.clicar(BT_AVANCAR);
        }
    }

}
