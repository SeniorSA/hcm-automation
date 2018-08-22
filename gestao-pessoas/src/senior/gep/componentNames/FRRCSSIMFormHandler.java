package senior.gep.componentNames;

import com.senior.framework.testes.SistemaSenior;
import com.senior.framework.testes.Tecla;

public class FRRCSSIMFormHandler {

    private static final String FR_NOME = "FRRCSSIM";
    private static final String FD_TIPO_COLABORADOR = "SETipCol";
    private static final String FD_CADASTRO = "SENumCad";
    private static final String FD_DATA_DEMISSAO = "SEDatDem";
    private static final String FD_CAUSA_DEMISSAO = "SECauDem";
    private static final String FD_DATA_AVISO = "SEDatAvi";
    private static final String FD_SALDO_CONTA_FGTS = "SESldFgt";
    private static final String BT_CALCULAR = "BtnCalcular";

    public static void abrirTela() {
        SistemaSenior.abrirTela(FR_NOME);
    }

    public static void setTipoColaborador(String tipoColaborador) {
        SistemaSenior.preencherCampo(FD_TIPO_COLABORADOR, tipoColaborador, Tecla.TAB);
    }

    public static void setCadastro(String cadastro) {
        SistemaSenior.preencherCampo(FD_CADASTRO, cadastro, Tecla.TAB);
    }

    public static void setDataDemissao(String dataDemissao) {
        SistemaSenior.preencherCampo(FD_DATA_DEMISSAO, dataDemissao, Tecla.TAB);
    }

    public static void setCausaDemissao(String causaDemissao) {
        SistemaSenior.preencherCampo(FD_CAUSA_DEMISSAO, causaDemissao, Tecla.TAB);
    }

    public static void setDataAviso(String dataAviso) {
        SistemaSenior.preencherCampo(FD_DATA_AVISO, dataAviso, Tecla.TAB);
    }

    public static void setSaldoContaFGTS(String saldo) {
        SistemaSenior.preencherCampo(FD_SALDO_CONTA_FGTS, saldo, Tecla.TAB);
    }

    public static void clickCalcular() {
        SistemaSenior.clicar(BT_CALCULAR);
    }

    public static void fecharTela() {
        SistemaSenior.fecharTela(FR_NOME);
    }
}
