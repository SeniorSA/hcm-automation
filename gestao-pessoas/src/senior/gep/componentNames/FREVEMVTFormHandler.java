package senior.gep.componentNames;

import com.senior.framework.testes.SistemaSenior;

public class FREVEMVTFormHandler {

    private FREVEMVTFormHandler() {
    }

    private static final String FR_NOME = "FREVEMVT";
    private static final String GD_MOVIMENTO_RESCISAO = "WGDEVEMVT";
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

    public static void addMovimentoRescisao(String... parametros) {
        SistemaSenior.preencherNovaLinhaGrade(GD_MOVIMENTO_RESCISAO, parametros);
    }

    public static void clickAvancar(int clickCount) {
        for (int i = 0; i < clickCount; i++) {
            SistemaSenior.clicar(BT_AVANCAR);
        }
    }
}
