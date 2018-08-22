package senior.gep.componentNames;

import com.senior.framework.testes.SistemaSenior;
import com.senior.framework.testes.Tecla;

public final class FR032RCBFormHandler {

    private FR032RCBFormHandler() {
    }

    private static final String FR_NOME = "FR032RCB";
    private static final String FD_FILIAL = "CodFil";
    private static final String FD_RATEIO = "CodRat";
    private static final String FD_COMPETENCIA = "CmpRcb";
    private static final String FD_SEQUENCIA = "SeqRcb";
    private static final String FD_SERVICO_PRESTADO = "SerPre";
    private static final String FD_DATA_EMISSAO = "DatRcb";
    private static final String FD_VALOR_BRUTO = "ValBru";
    private static final String FD_VALOR_SERVICO = "ValSer";
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

    public static void setRateio(final String valor) {
        SistemaSenior.preencherCampo(FD_RATEIO, valor, Tecla.TAB);
    }

    public static void setCompetencia(final String valor) {
        SistemaSenior.preencherCampo(FD_COMPETENCIA, valor, Tecla.TAB);
    }

    public static void setSequencia(final String valor) {
        SistemaSenior.preencherCampo(FD_SEQUENCIA, valor, Tecla.TAB);
    }

    public static void setServicoPrestado(final String valor) {
        SistemaSenior.preencherCampo(FD_SERVICO_PRESTADO, valor, Tecla.TAB);
    }

    public static void setDataEmissao(final String valor) {
        SistemaSenior.preencherCampo(FD_DATA_EMISSAO, valor, Tecla.TAB);
    }

    public static void setValorBruto(final String valor) {
        SistemaSenior.preencherCampo(FD_VALOR_BRUTO, valor, Tecla.TAB);
    }

    public static void setValorServico(final String valor) {
        SistemaSenior.preencherCampo(FD_VALOR_SERVICO, valor, Tecla.TAB);
    }

    public static void clickAlterar() {
        SistemaSenior.clicar(BT_ALTERAR);
    }

}
