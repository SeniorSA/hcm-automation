package senior.gep.componentNames;

import com.senior.framework.testes.SistemaSenior;
import com.senior.framework.testes.Tecla;

public final class FR034FUNFormHandler {

    private FR034FUNFormHandler() {
    }

    private static final String FR_NOME = "FR034FUN";
    private static final String FD_COLABORADOR = "NumCad";
    private static final String FD_DATA_ADMISSAO = "DatAdm";
    private static final String BT_ALTERAR = "BtnAlterar";

    public static void abrirTela() {
        SistemaSenior.abrirTela(FR_NOME);
    }

    public static void fecharTela() {
        SistemaSenior.fecharTela(FR_NOME);
    }

    public static void setColaborador(final String valor) {
        SistemaSenior.preencherCampo(FD_COLABORADOR, valor, Tecla.TAB);
    }

    public static void setDataAdmissao(final String valor) {
        SistemaSenior.preencherCampo(FD_DATA_ADMISSAO, valor, Tecla.TAB);
    }

    public static void clickAlterar() {
        SistemaSenior.clicar(BT_ALTERAR);
    }

}
