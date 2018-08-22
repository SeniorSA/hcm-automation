package senior.gep.componentNames;

import com.senior.framework.testes.SistemaSenior;

public final class FRLISINSFormHandler {

    private FRLISINSFormHandler() {
    }

    private static final String FR_NOME = "FRLISINS";
    private static final String BT_SELECAO = "BtnSelecao";
    private static final String BT_PROCESSAR = "BtnProcessar";

    public static void abrirTela() {
        SistemaSenior.abrirTela(FR_NOME);
    }

    public static void fecharTela() {
        SistemaSenior.fecharTela(FR_NOME);
    }

    public static void clickSelecao() {
        SistemaSenior.clicar(BT_SELECAO);
    }

    public static void clickProcessar() {
        SistemaSenior.clicar(BT_PROCESSAR);
    }

}
