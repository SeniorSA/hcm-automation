package senior.gep.componentNames;

import com.senior.framework.testes.SistemaSenior;
import com.senior.framework.testes.Tecla;

public class FRLOTSIMFormHandler {

    private FRLOTSIMFormHandler() {
    }

    private static final String FR_NOME = "FRLOTSIM";
    private static final String FD_LOTE = "SECodLot";
    private static final String FD_CAUSA_DEMISSAO = "SECauDem";
    private static final String FD_DIAS_AVISO_PREVIO = "SEConAav";
    private static final String FD_DATA_DEMISSAO = "SEDatDem";
    private static final String FD_DATA_PAGAMENTO = "SEDatPag";
    private static final String FD_DATA_AVISO = "SEDatAvi";
    private static final String BT_CALCULAR = "BtnCalcular";

    public static void abrirTela() {
        SistemaSenior.abrirTela(FR_NOME);
    }

    public static void fecharTela() {
        SistemaSenior.fecharTela(FR_NOME);
    }

    public static void setLote(String valor) {
        SistemaSenior.preencherCampo(FD_LOTE, valor, Tecla.TAB);
    }

    public static void setCausaDemissao(String valor) {
        SistemaSenior.preencherCampo(FD_CAUSA_DEMISSAO, valor, Tecla.TAB);
    }

    public static void setDiasAvisoPrevio(String valor) {
        SistemaSenior.preencherCampo(FD_DIAS_AVISO_PREVIO, valor, Tecla.TAB);
    }

    public static void setDataDemissao(String valor) {
        SistemaSenior.preencherCampo(FD_DATA_DEMISSAO, valor, Tecla.TAB);
    }

    public static void setDataPagamento(String valor) {
        SistemaSenior.preencherCampo(FD_DATA_PAGAMENTO, valor, Tecla.TAB);
    }

    public static void setDataAviso(String valor) {
        SistemaSenior.preencherCampo(FD_DATA_AVISO, valor, Tecla.TAB);
    }

    public static void clickCalcular() {
        SistemaSenior.clicar(BT_CALCULAR);
    }
}
