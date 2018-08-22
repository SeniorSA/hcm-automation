package senior.gep.componentNames;

import com.senior.framework.testes.SistemaSenior;

public class FREVEIMPFormHandler {

    private FREVEIMPFormHandler() {
    }

    private static final String FR_NOME = "FREVEIMP";
    private static final String BT_AVANCAR = "BtnAvancar";

    public static void abrirTela() {
        SistemaSenior.abrirTela(FR_NOME);
    }

    public static void fecharTela() {
        SistemaSenior.fecharTela(FR_NOME);
    }

    public static void clickAvancar() {
        SistemaSenior.clicar(BT_AVANCAR);
    }

}
