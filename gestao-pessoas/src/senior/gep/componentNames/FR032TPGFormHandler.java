package senior.gep.componentNames;

import com.senior.framework.testes.SistemaSenior;
import com.senior.framework.testes.Tecla;

public final class FR032TPGFormHandler {

    private FR032TPGFormHandler() {
    }

    private static final String FR_NOME = "DEFR032TPG1";
    private static final String FD_FILIAL = "DECodFil1";
    private static final String FD_COMPETENCIA = "DECmpPte1";
    private static final String FD_TERCEIRO = "DENumCad1";
    private static final String FD_SEQUENCIA = "DESeqPte1";
    private static final String FD_DATA_PAGAMENTO = "DEDatPag1";
    private static final String FD_RENDIMENTO_BRUTO = "DERenBru1";
    private static final String FD_CODIGO_RETENCAO = "DECodRet1";
    private static final String FD_GPS = "DEPerGrp1";
    private static final String FD_BASE_CALCULO_IR = "DEBasIrf1";
    private static final String FD_BASE_CALCULO_INSS = "DEBasIns1";
    private static final String FD_CONTRIBUICAO_INSS = "DEConIns1";
    private static final String FD_DEDUCOES_INSS = "DEDedIns1";
    private static final String FD_IMPOSTO_RENDA = "DEIrfRet1";
    private static final String FD_VALOR_LIQUIDO = "DEValLiq1";
    private static final String BT_ALTERAR = "BtnAltarar";

    public static void abrirTela() {
        SistemaSenior.abrirTela(FR_NOME);
    }

    public static void fecharTela() {
        SistemaSenior.fecharTela(FR_NOME);
    }

    public static void setFilial(final String valor) {
        SistemaSenior.preencherCampo(FD_FILIAL, valor, Tecla.TAB);
    }

    public static void setCompetencia(final String valor) {
        SistemaSenior.preencherCampo(FD_COMPETENCIA, valor, Tecla.TAB);
    }

    public static void setTerceiro(final String valor) {
        SistemaSenior.preencherCampo(FD_TERCEIRO, valor, Tecla.TAB);
    }

    public static void setSequencia(final String valor) {
        SistemaSenior.preencherCampo(FD_SEQUENCIA, valor, Tecla.TAB);
    }

    public static void setDataPagamento(final String valor) {
        SistemaSenior.preencherCampo(FD_DATA_PAGAMENTO, valor, Tecla.TAB);
    }

    public static void setRendimentoBruto(final String valor) {
        SistemaSenior.preencherCampo(FD_RENDIMENTO_BRUTO, valor, Tecla.TAB);
    }

    public static void setCodigoRetencao(final String valor) {
        SistemaSenior.preencherCampo(FD_CODIGO_RETENCAO, valor, Tecla.TAB);
    }

    public static void clickAlterar() {
        SistemaSenior.clicar(BT_ALTERAR);
    }

    public static void setGPS(final String valor) {
        SistemaSenior.preencherCampo(FD_GPS, valor, Tecla.TAB);
    }

    public static void setBaseCalculoIR(final String valor) {
        SistemaSenior.preencherCampo(FD_BASE_CALCULO_IR, valor, Tecla.TAB);
    }

    public static void setBaseCalculoINSS(final String valor) {
        SistemaSenior.preencherCampo(FD_BASE_CALCULO_INSS, valor, Tecla.TAB);
    }

    public static void setContribuicaoINSS(final String valor) {
        SistemaSenior.preencherCampo(FD_CONTRIBUICAO_INSS, valor, Tecla.TAB);
    }

    public static void setDeducoesINSS(final String valor) {
        SistemaSenior.preencherCampo(FD_DEDUCOES_INSS, valor, Tecla.TAB);
    }

    public static void setImpostoRenda(final String valor) {
        SistemaSenior.preencherCampo(FD_IMPOSTO_RENDA, valor, Tecla.TAB);
    }

    public static void setValorLiquido(final String valor) {
        SistemaSenior.preencherCampo(FD_VALOR_LIQUIDO, valor, Tecla.TAB);
    }

}
