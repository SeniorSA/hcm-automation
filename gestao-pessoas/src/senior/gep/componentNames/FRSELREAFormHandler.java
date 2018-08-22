package senior.gep.componentNames;

import com.senior.framework.testes.SistemaSenior;

public class FRSELREAFormHandler {

    private FRSELREAFormHandler() {
        //Form Handler class.
    }

    private static final String FR_NOME = "FRSELREA";
    private static final String BT_PROCESSAR = "BTNPROCESSAR";

    public static void fecharTela() {
        SistemaSenior.fecharTela(FR_NOME);
    }

    public static void clickProcessar() {
        SistemaSenior.clicar(BT_PROCESSAR);
    }

}
