package senior.gep.componentNames;

import com.senior.framework.testes.SistemaSenior;
import com.senior.framework.testes.Tecla;

public final class FRFERINDFormHandler {

    private FRFERINDFormHandler() {
    }

    private static final String FR_NOME = "FRFERIND";
    private static final String FD_TIPO_COLABORADOR = "SETipCol";
    private static final String FD_COLABORADOR = "SENumCad";
    private static final String FD_PERIODO = "SEIniPer";
    private static final String FD_DATA_INICIO = "SEIniFer";
    private static final String FD_DIAS_FERIAS = "SEDiaFer";
    private static final String FD_DIAS_ABONO = "SEDiaAbo";
    private static final String FD_ADIANTAMENTO_13SALARIO = "SEOpc13s";
    private static final String FD_GERAR_ADIANTAMENTO = "SEGerAdt";
    private static final String FD_DATA_PAGAMENTO = "SEDatPag";
    private static final String FD_ADIANTAMENTO_FERIAS = "SEPctAtd";
    private static final String FD_PROVISAO_DESCONTO = "SEPrvDes";
    private static final String FD_REAJUSTE_SALARIO = "SEReaSal";
    private static final String FD_PARCELAS_DESCONTO = "SEQtdpar";
    private static final String BT_CALCULAR = "BtnCalcular";
    private static final String BT_GRAVAR = "btnGravar";

    public static void abrirTela() {
        SistemaSenior.abrirTela(FR_NOME);
    }

    public static void fecharTela() {
        SistemaSenior.fecharTela(FR_NOME);
    }

    public static void setTipoColaborador(final String valor) {
        SistemaSenior.preencherCampo(FD_TIPO_COLABORADOR, valor, Tecla.TAB);
    }

    public static void setColaborador(final String valor) {
        SistemaSenior.preencherCampo(FD_COLABORADOR, valor, Tecla.TAB);
    }

    public static void setPeriodo(final String valor) {
        SistemaSenior.preencherCampo(FD_PERIODO, valor, Tecla.TAB);
    }

    public static void setDataInicio(final String valor) {
        SistemaSenior.preencherCampo(FD_DATA_INICIO, valor, Tecla.TAB);
    }

    public static void setDiasFerias(final String valor) {
        SistemaSenior.preencherCampo(FD_DIAS_FERIAS, valor, Tecla.TAB);
    }

    public static void setDiasAbono(final String valor) {
        SistemaSenior.preencherCampo(FD_DIAS_ABONO, valor, Tecla.TAB);
    }

    public static void setAdiantamento13Salario(final String valor) {
        SistemaSenior.preencherCampo(FD_ADIANTAMENTO_13SALARIO, valor, Tecla.TAB);
    }

    public static void setGerarAdiantamento(final String valor) {
        SistemaSenior.preencherCampo(FD_GERAR_ADIANTAMENTO, valor, Tecla.TAB);
    }

    public static void setDataPagamento(final String valor) {
        SistemaSenior.preencherCampo(FD_DATA_PAGAMENTO, valor, Tecla.TAB);
    }

    public static void setAdiantamentoFerias(final String valor) {
        SistemaSenior.preencherCampo(FD_ADIANTAMENTO_FERIAS, valor, Tecla.TAB);
    }

    public static void setProvisaoDesconto(final String valor) {
        SistemaSenior.preencherCampo(FD_PROVISAO_DESCONTO, valor, Tecla.TAB);
    }

    public static void setReajusteSalario(final String valor) {
        SistemaSenior.preencherCampo(FD_REAJUSTE_SALARIO, valor, Tecla.TAB);
    }

    public static void setParcelasDescontos(final String valor) {
        SistemaSenior.preencherCampo(FD_PARCELAS_DESCONTO, valor, Tecla.TAB);
    }

    public static void clickCalcular() {
        SistemaSenior.clicar(BT_CALCULAR);
    }

    public static void assertCampoFimPeriodo(final String valor) {
        SistemaSenior.conferirCampo("SEFimPer", valor);
    }

    public static void assertCampoAvosFerias(final String valor) {
        SistemaSenior.conferirCampo("SEAvoFer", valor);
    }

    public static void assertCampoDiasDireito(final String valor) {
        SistemaSenior.conferirCampo("SEQtdDir", valor);
    }

    public static void assertCampoFaltas(final String valor) {
        SistemaSenior.conferirCampo("SEQtdFal", valor);
    }

    public static void assertCampoSituacao(final String situacao) {
        SistemaSenior.conferirCampo("SESitPer", situacao);
    }

    public static void assertCampoDiasLicenca(final String dias) {
        SistemaSenior.conferirCampo("SEDiaLic", dias);
    }

    public static void assertCampoLicenca(String licenca) {
        SistemaSenior.conferirCampo("SEQtdLir", licenca);
    }

    public static void clickGravar() {
        SistemaSenior.clicar(BT_GRAVAR);

    }

}
