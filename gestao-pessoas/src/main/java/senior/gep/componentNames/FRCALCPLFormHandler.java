package senior.gep.componentNames;

import com.senior.framework.testes.SistemaSenior;
import com.senior.framework.testes.Tecla;

public class FRCALCPLFormHandler {

    private FRCALCPLFormHandler() {
    }

    private static final String FR_NOME = "FRCALCPL";
    private static final String FD_TIPO_COLABORADOR = "SETipCol";
    private static final String FD_CADASTRO = "SENumCad";
    private static final String FD_DATA_PAGAMENTO = "SEDatPag";
    private static final String FD_MOTIVO_COMPLEMENTAR = "SETemDis";
    private static final String FD_INTEGRAR_RESCISAO = "SECalRcs";
    private static final String FD_HOM_DISSIDIO_COLETIVO = "SEDisCol";
    private static final String FD_SALDO_CONTA_FGTS = "SESldFgt";
    private static final String BT_CALCULAR = "BtnCalcular";

    public static void abrirTela() {
        SistemaSenior.abrirTela(FR_NOME);
    }

    public static void fecharTela() {
        SistemaSenior.fecharTela(FR_NOME);
    }

    public static void setTipoColaborador(final String valor) {
        SistemaSenior.preencherCampo(FD_TIPO_COLABORADOR, valor, Tecla.TAB);
    }

    public static void setCadastro(final String valor) {
        SistemaSenior.preencherCampo(FD_CADASTRO, valor, Tecla.TAB);
    }

    public static void setDataPagamento(final String valor) {
        SistemaSenior.preencherCampo(FD_DATA_PAGAMENTO, valor, Tecla.TAB);
    }

    public static void setMotivoComplementar(final String valor) {
        SistemaSenior.preencherCampo(FD_MOTIVO_COMPLEMENTAR, valor, Tecla.TAB);
    }

    public static void setIntegrarRescisao(final String valor) {
        SistemaSenior.preencherCampo(FD_INTEGRAR_RESCISAO, valor, Tecla.TAB);
    }

    public static void setHomDissidioColetivo(final String valor) {
        SistemaSenior.preencherCampo(FD_HOM_DISSIDIO_COLETIVO, valor, Tecla.TAB);
    }

    public static void setSaldoFGTS(final String valor) {
        SistemaSenior.preencherCampo(FD_SALDO_CONTA_FGTS, valor, Tecla.TAB);
    }

    public static void clickCalcular() {
        SistemaSenior.clicar(BT_CALCULAR);
    }
}
