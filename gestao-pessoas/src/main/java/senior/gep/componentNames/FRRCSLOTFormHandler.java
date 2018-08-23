package senior.gep.componentNames;

import com.senior.framework.testes.SistemaSenior;
import com.senior.framework.testes.Tecla;

public class FRRCSLOTFormHandler {

    private FRRCSLOTFormHandler() {
    }

    private static final String FR_NOME = "FRRCSLOT";
    private static final String FD_LOTE = "SECodLot";
    private static final String FD_CAUSA_DEMISSAO = "SECauDem";
    private static final String FD_DIAS_AVISO_PREVIO = "SEConAav";
    private static final String FD_DATA_DEMISSAO = "SEDatDem";
    private static final String FD_DATA_AVISO = "SEDatAvi";
    private static final String FD_DATA_PAGAMENTO = "SEDatPag";
    private static final String FD_DATA_FIM_CONTRATO = "SEFimCtt";
    private static final String FD_AVISO_INDENIZADO = "SEQtdInd";
    private static final String FD_REPOSICAO_VAGA = "SeRepVag";
    private static final String FD_AVISO_GRRF = "SEAviPre";
    private static final String BT_SELECAO = "BtnSelecao";
    private static final String BT_CALCULAR = "BtnCalcular";

    public static void abrirTela() {
        SistemaSenior.abrirTela(FR_NOME);
    }

    public static void fecharTela() {
        SistemaSenior.fecharTela(FR_NOME);
    }

    public static void setLote(final String valor) {
        SistemaSenior.preencherCampo(FD_LOTE, valor, Tecla.TAB);
    }

    public static void setCausaDemissao(final String valor) {
        SistemaSenior.preencherCampo(FD_CAUSA_DEMISSAO, valor, Tecla.TAB);
    }

    public static void setDiasAvisoPrevio(final String valor) {
        SistemaSenior.preencherCampo(FD_DIAS_AVISO_PREVIO, valor, Tecla.TAB);
    }

    public static void setDataDemissao(final String valor) {
        SistemaSenior.preencherCampo(FD_DATA_DEMISSAO, valor, Tecla.TAB);
    }

    public static void setDataAviso(final String valor) {
        SistemaSenior.preencherCampo(FD_DATA_AVISO, valor, Tecla.TAB);
    }

    public static void setDataPagamento(final String valor) {
        SistemaSenior.preencherCampo(FD_DATA_PAGAMENTO, valor, Tecla.TAB);
    }

    public static void setDataFimContrato(final String valor) {
        SistemaSenior.preencherCampo(FD_DATA_FIM_CONTRATO, valor, Tecla.TAB);
    }

    public static void setAvisoIndenizado(final String valor) {
        SistemaSenior.preencherCampo(FD_AVISO_INDENIZADO, valor, Tecla.TAB);
    }

    public static void setReposicaoVaga(final String valor) {
        SistemaSenior.preencherCampo(FD_REPOSICAO_VAGA, valor, Tecla.TAB);
    }

    public static void setAvisoGRRF(final String valor) {
        SistemaSenior.preencherCampo(FD_AVISO_GRRF, valor, Tecla.TAB);
    }

    public static void conferirMensagemAvisoLoteNaoInformado() {
        SistemaSenior.conferirCaixaMensagem("Aviso", "Quando o lote não é informado deve-se tratar a abrangência pelo botão seleção, caso contrário todos os colaboradores da empresa ativa serão demitidos.", "Ok");
    }

    public static void clickSelecao() {
        SistemaSenior.clicar(BT_SELECAO);
    }

    public static void clickCalcular() {
        SistemaSenior.clicar(BT_CALCULAR);
    }
}
