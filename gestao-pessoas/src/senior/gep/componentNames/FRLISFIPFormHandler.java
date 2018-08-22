package senior.gep.componentNames;

import com.senior.framework.testes.SistemaSenior;
import com.senior.framework.testes.Tecla;

public class FRLISFIPFormHandler {

    private FRLISFIPFormHandler() {
    }

    private static final String FR_NOME = "FRLISLIP";
    private static final String FD_SEPARAR_RATEIOS = "SESepRat";
    private static final String FD_RATEIOS_FILIAL = "SERatFil";
    private static final String FD_COMPETENCIA = "SECmpFgt";
    private static final String FD_INDICADOR_RECOLHIMENTO = "SECdrFgt";
    private static final String FD_COMPENSACAO = "SECmpFip";
    private static final String FD_DESONERACAO_FOLHA = "SEDesSef";
    private static final String BT_PROCESSAR = "BtnProcessar";

    public static void abrirTela() {
        SistemaSenior.abrirTela(FR_NOME);
    }

    public static void fecharTela() {
        SistemaSenior.fecharTela(FR_NOME);
    }

    public static void setSepararRateios(final String valor) {
        SistemaSenior.preencherCampo(FD_SEPARAR_RATEIOS, valor, Tecla.TAB);
    }

    public static void setRateiosFilial(final String valor) {
        SistemaSenior.preencherCampo(FD_RATEIOS_FILIAL, valor, Tecla.TAB);
    }

    public static void setCompetencia(final String valor) {
        SistemaSenior.preencherCampo(FD_COMPETENCIA, valor, Tecla.TAB);
    }

    public static void setIndicadorRecolhimento(final String valor) {
        SistemaSenior.preencherCampo(FD_INDICADOR_RECOLHIMENTO, valor, Tecla.TAB);
    }

    public static void setCompensacao(final String valor) {
        SistemaSenior.preencherCampo(FD_COMPENSACAO, valor, Tecla.TAB);
    }

    public static void setDesoneracaoFolha(final String valor) {
        SistemaSenior.preencherCampo(FD_DESONERACAO_FOLHA, valor, Tecla.TAB);
    }

    public static void clickProcessar() {
        SistemaSenior.clicar(BT_PROCESSAR);
    }

}
