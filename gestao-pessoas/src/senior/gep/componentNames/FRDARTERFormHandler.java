package senior.gep.componentNames;

import com.senior.framework.testes.SistemaSenior;
import com.senior.framework.testes.Tecla;

public class FRDARTERFormHandler {

    private FRDARTERFormHandler() {
    }

    private static final String FR_NOME = "FRDARTER";
    private static final String FD_PERIODO_PAGTO_INICIO = "SEMesIni";
    private static final String FD_PERIODO_PAGTO_FIM = "SEMesFim";
    private static final String FD_COMPETENCIA = "SEDatCom";
    private static final String FD_TIPO_PERIODO = "SETipPer";
    private static final String FD_DATA_RECOLHIMENTO = "SEDatPag";
    private static final String FD_EMITIR_CORRIDO = "SEEmiCor";
    private static final String FD_ASSINALAR_RECOLHIMENTO = "SECtrPag";
    private static final String FD_RECEITA = "SECodRec";
    private static final String FD_COMPENSAR = "SECmpGrp";
    private static final String FD_GERAR_SEPARADO = "SEGerSep";
    private static final String BT_PROCESSAR = "BtnProcessar";

    public static void abrirTela() {
        SistemaSenior.abrirTela(FR_NOME);
    }

    public static void fecharTela() {
        SistemaSenior.fecharTela(FR_NOME);
    }

    public static void setCompetencia(final String valor) {
        SistemaSenior.preencherCampo(FD_COMPETENCIA, valor, Tecla.TAB);
    }

    public static void setTipoPeriodo(final String valor) {
        SistemaSenior.preencherCampo(FD_TIPO_PERIODO, valor, Tecla.TAB);
    }

    public static void setDataRecolhimento(final String valor) {
        SistemaSenior.preencherCampo(FD_DATA_RECOLHIMENTO, valor, Tecla.TAB);
    }

    public static void setReceita(final String valor) {
        SistemaSenior.preencherCampo(FD_RECEITA, valor, Tecla.TAB);
    }

    public static void setCompensar(final String valor) {
        SistemaSenior.preencherCampo(FD_COMPENSAR, valor, Tecla.TAB);
    }

    public static void setGerarSeparado(final String valor) {
        SistemaSenior.preencherCampo(FD_GERAR_SEPARADO, valor, Tecla.TAB);
    }

    public static void clickProcessar() {
        SistemaSenior.clicar(BT_PROCESSAR);
    }

    public static void setPeriodoPagtoInicio(final String valor) {
        SistemaSenior.preencherCampo(FD_PERIODO_PAGTO_INICIO, valor, Tecla.TAB);
    }

    public static void setPeriodoPagtoFim(final String valor) {
        SistemaSenior.preencherCampo(FD_PERIODO_PAGTO_FIM, valor, Tecla.TAB);
    }

    public static void setEmitirCorrido(final String valor) {
        SistemaSenior.preencherCampo(FD_EMITIR_CORRIDO, valor, Tecla.TAB);
    }

    public static void setAssinalarRecolhimento(final String valor) {
        SistemaSenior.preencherCampo(FD_ASSINALAR_RECOLHIMENTO, valor, Tecla.TAB);
    }

}
