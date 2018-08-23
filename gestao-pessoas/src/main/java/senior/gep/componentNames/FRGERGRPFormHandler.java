package senior.gep.componentNames;

import com.senior.framework.testes.SistemaSenior;
import com.senior.framework.testes.Tecla;

public class FRGERGRPFormHandler {

    private FRGERGRPFormHandler() {
    }

    private static final String FR_NOME = "FRGERGRP";
    private static final String FD_DATA_RECOLIMENTO = "SEDatGrp";
    private static final String FD_TIPO_GPS = "SETipGrp";
    private static final String FD_RETENCAO_NF = "SEGrpTom";
    private static final String BT_PROCESSAR = "BtnProcessar";
    private static final String BT_SELECAO = "BtnSelecao";

    public static void abrirTela() {
        SistemaSenior.abrirTela(FR_NOME);
    }

    public static void fecharTela() {
        SistemaSenior.fecharTela(FR_NOME);
    }

    public static void setDataRecolimento(final String valor) {
        SistemaSenior.preencherCampo(FD_DATA_RECOLIMENTO, valor, Tecla.TAB);
    }

    public static void setTipoGPS(final String valor) {
        SistemaSenior.preencherCampo(FD_TIPO_GPS, valor, Tecla.TAB);
    }

    public static void setRetencaoNF(final String valor) {
        SistemaSenior.preencherCampo(FD_RETENCAO_NF, valor, Tecla.TAB);
    }

    public static void clickProcessar() {
        SistemaSenior.clicar(BT_PROCESSAR);
    }

    public static void clickSelecao() {
        SistemaSenior.clicar(BT_SELECAO);
    }
}
