package senior.gep.componentNames;

import com.senior.framework.testes.SistemaSenior;
import com.senior.framework.testes.Tecla;

public class FRSELCALFormHandler {

    private FRSELCALFormHandler() {
    }

    private static final String FD_CODIGO = "SEPesCal";
    private static final String BT_OK = "BtnOk";

    public static void setCodigo(final String valor) {
        SistemaSenior.preencherCampo(FD_CODIGO, valor);
    }

    public static void abrirTela() {
        SistemaSenior.teclar(Tecla.F6);
    }

    public static void clickOk() {
        SistemaSenior.clicar(BT_OK);
    }
}
