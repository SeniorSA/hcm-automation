package senior.gep.componentNames;

import com.senior.framework.testes.SistemaSenior;
import com.senior.framework.testes.Tecla;

public final class FR044CALFormHandler {

    private FR044CALFormHandler() {
    }

    private static final String FR_NOME = "FR044CAL";

    private static final String FD_CODIGO_CALCULO = "DECodCal1";
    private static final String FD_TIPO_CALCULO = "DETipCal1";
    private static final String FD_PERIODO_INICIO_FOLHA = "DEIniCmp1";
    private static final String FD_PERIODO_FIM_FOLHA = "DEFimCmp1";
    private static final String FD_PERIODO_INICIO_APURACAO = "DEIniApu1";
    private static final String FD_PERIODO_FIM_APURACAO = "DEFimApu1";
    private static final String FD_COMPETENCIA = "DEPerRef1";
    private static final String BT_ALTERAR = "BtnAltarar";

    public static void abrirTela() {
        SistemaSenior.abrirTela(FR_NOME);
    }

    public static void fecharTela() {
        SistemaSenior.fecharTela(FR_NOME);
    }

    public static void setCodigoCalculo(final String valor) {
        SistemaSenior.preencherCampo(FD_CODIGO_CALCULO, valor, Tecla.TAB);
    }

    public static void setTipoCalculo(final String valor) {
        SistemaSenior.preencherCampo(FD_TIPO_CALCULO, valor, Tecla.TAB);
    }

    public static void setCompetencia(final String valor) {
        SistemaSenior.preencherCampo(FD_COMPETENCIA, valor, Tecla.TAB);
    }

    public static void setPeriodoInicioFolha(final String valor) {
        SistemaSenior.preencherCampo(FD_PERIODO_INICIO_FOLHA, valor, Tecla.TAB);
    }

    public static void setPeriodoFimFolha(final String valor) {
        SistemaSenior.preencherCampo(FD_PERIODO_FIM_FOLHA, valor, Tecla.TAB);
    }

    public static void setPeriodoInicioApuracao(final String valor) {
        SistemaSenior.preencherCampo(FD_PERIODO_INICIO_APURACAO, valor, Tecla.TAB);
    }

    public static void setPeriodoFimApuracao(final String valor) {
        SistemaSenior.preencherCampo(FD_PERIODO_FIM_APURACAO, valor, Tecla.TAB);
    }

    public static void clickAlterar() {
        SistemaSenior.clicar(BT_ALTERAR);
    }

}
