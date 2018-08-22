package senior.gep.componentNames;

import com.senior.framework.testes.SistemaSenior;

public class FROPTFERFormHandler {

    private FROPTFERFormHandler() {
    }

    private static final String CB_HORAS_FERIAS = "CBCalHfe";
    private static final String CB_ADICIONAL_FERIAS = "CBCalAdf";
    private static final String CB_UM_TERCO_FERIAS = "CBCalTfe";
    private static final String BT_OK = "BtnOk";

    public static void uncheckHorasFerias() {
        SistemaSenior.desmarcarCaixaAtribuicao(CB_HORAS_FERIAS);
    }

    public static void checkAdicionaisFerias() {
        SistemaSenior.marcarCaixaAtribuicao(CB_ADICIONAL_FERIAS);
    }

    public static void checkUmTercoFerias() {
        SistemaSenior.marcarCaixaAtribuicao(CB_UM_TERCO_FERIAS);
    }

    public static void clickOk() {
        SistemaSenior.clicar(BT_OK);
    }

}
