package senior.gep.componentNames;

import com.senior.framework.testes.SistemaSenior;
import com.senior.framework.testes.Tecla;

public class FR010SITFormHandler {

    private FR010SITFormHandler() {
    }

    private static final String FR_NOME = "FR010SIT";
    private static final String FD_SITUACAO = "CodSit";
    private static final String BT_ALTERAR = "BtnAlterar";

    public static void abrirTela() {
        SistemaSenior.abrirTela(FR_NOME);
    }

    public static void fecharTela() {
        SistemaSenior.fecharTela(FR_NOME);
    }

    public static void setSituacao(final String valor) {
        SistemaSenior.preencherCampo(FD_SITUACAO, valor, Tecla.TAB);
    }

    public static void clickAlterar() {
        SistemaSenior.clicar(BT_ALTERAR);
    }

}
