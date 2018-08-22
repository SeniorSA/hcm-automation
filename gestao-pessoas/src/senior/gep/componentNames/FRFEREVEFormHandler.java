package senior.gep.componentNames;

import com.senior.framework.testes.SistemaSenior;

public class FRFEREVEFormHandler {

    private static final String BT_GRAVAR = "btnGravar";
    private static final String FD_PROVENTOS = "SEProFer";
    private static final String FD_DESCONTOS = "SEDesFer";

    public static void clickGravar() {
        SistemaSenior.clicar(BT_GRAVAR);
    }

    public static void assertProventos(String proventos) {
        SistemaSenior.conferirCampo(FD_PROVENTOS, proventos);
    }

    public static void assertDescontos(String descontos) {
        SistemaSenior.conferirCampo(FD_DESCONTOS, descontos);

    }
}
