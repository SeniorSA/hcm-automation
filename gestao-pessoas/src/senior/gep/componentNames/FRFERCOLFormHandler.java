package senior.gep.componentNames;

import com.senior.framework.testes.SistemaSenior;
import com.senior.framework.testes.Tecla;

public class FRFERCOLFormHandler {

    private FRFERCOLFormHandler() {
    }

    private static final String FR_NOME = "FRFERCOL";
    private static final String FD_CONSIDERAR_PROGRAMACAO = "SEConPro";
    private static final String FD_PERIODO_FERIAS_INICIO = "SEIniFer";
    private static final String FD_PERIODO_FERIAS_FIM = "SEFimFer";
    private static final String GD_DESCONSIDERAR = "WGDFERCOL";
    private static final String FD_DIAS_FERIAS = "SEDiaFer";
    private static final String FD_DIAS_ABONO = "SEDiaAbo";
    private static final String FD_ADIANTAMENTO_13SALARIO = "SEOpc13s";
    private static final String FD_GERAR_ADIANTAMENTO = "SEGerAdt";
    private static final String FD_MULTA_DOBRO = "SEMulDob";
    private static final String FD_SOBREPOR_DATA_PAGAMENTO = "SESobDat";
    private static final String FD_DATA_PAGAMENTO = "SEDatPag";
    private static final String FD_ADIANTAMENTO_FERIAS = "SEPctAdt";
    private static final String FD_PROVISAO_DESCONTO = "SEPrvDes";
    private static final String FD_GERAR_NEGATIVA = "SEGerNeg";
    private static final String FD_ADMITIDOS_ANO = "SEAdmSsd";
    private static final String BT_CALCULAR = "BtnCalcular";
    private static final String BT_ADIANTAMENTO = "BtnAdt";
    private static final String BT_OK = "BtnOk";

    public static void abrirTela() {
        SistemaSenior.abrirTela(FR_NOME);
    }

    public static void fecharTela() {
        SistemaSenior.fecharTela(FR_NOME);
    }

    public static void setConsiderarProgramacao(final String valor) {
        SistemaSenior.preencherCampo(FD_CONSIDERAR_PROGRAMACAO, valor, Tecla.TAB);
    }

    public static void setPeriodoFeriasInicio(final String valor) {
        SistemaSenior.preencherCampo(FD_PERIODO_FERIAS_INICIO, valor, Tecla.TAB);
    }

    public static void setPeriodoFeriasFim(final String valor) {
        SistemaSenior.preencherCampo(FD_PERIODO_FERIAS_FIM, valor, Tecla.TAB);
    }

    public static void addGridDesconsiderar(final String... valores) {
        for (String valor : valores) {
            SistemaSenior.preencherNovaLinhaGrade(GD_DESCONSIDERAR, "Inválidos", valor);
        }
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

    public static void setMultaDobro(final String valor) {
        SistemaSenior.preencherCampo(FD_MULTA_DOBRO, valor, Tecla.TAB);
    }

    public static void assertSobreporDataPagamento(final String valor) {
        SistemaSenior.conferirCampo(FD_SOBREPOR_DATA_PAGAMENTO, valor);
    }

    public static void setSobreporDataPagamento(final String valor) {
        SistemaSenior.preencherCampo(FD_SOBREPOR_DATA_PAGAMENTO, valor, Tecla.TAB);
    }

    public static void setDataPagamento(final String valor) {
        SistemaSenior.preencherCampo(FD_DATA_PAGAMENTO, valor, Tecla.TAB);
    }

    public static void assertDataPagamento(final String valor) {
        SistemaSenior.conferirCampo(FD_DATA_PAGAMENTO, valor);
    }

    public static void setAdiantamentoFerias(final String valor) {
        SistemaSenior.preencherCampo(FD_ADIANTAMENTO_FERIAS, valor, Tecla.TAB);
    }

    public static void assertAdiantamentoFerias(final String valor) {
        SistemaSenior.conferirCampo(FD_ADIANTAMENTO_FERIAS, valor);
    }

    public static void setProvisaoDesconto(final String valor) {
        SistemaSenior.preencherCampo(FD_PROVISAO_DESCONTO, valor, Tecla.TAB);
    }

    public static void assertProvisaoDesconto(final String valor) {
        SistemaSenior.conferirCampo(FD_PROVISAO_DESCONTO, valor);
    }

    public static void setGerarNegativa(final String valor) {
        SistemaSenior.preencherCampo(FD_GERAR_NEGATIVA, valor, Tecla.TAB);
    }

    public static void setAdmitidosAno(final String valor) {
        SistemaSenior.preencherCampo(FD_ADMITIDOS_ANO, valor, Tecla.TAB);
    }

    public static void clickCalcular() {
        SistemaSenior.clicar(BT_CALCULAR);
    }

    public static void clickAdiantamento() {
        SistemaSenior.clicar(BT_ADIANTAMENTO);
    }

    public static void clickOK() {
        SistemaSenior.clicar(BT_OK);
    }

    public static void assertCampoDiasFerias(final String valor) {
        SistemaSenior.conferirCampo(FD_DIAS_FERIAS, valor);
    }

    public static void gerarAdiantamento(final String codigoGerarAdiantamento, final String codigoDataPagamento, final String codigoAdiantamentoFerias, final String codigoProvisaoDesconto) {
        if (codigoGerarAdiantamento.equalsIgnoreCase("N")) {
            FRFERCOLFormHandler.assertDataPagamento(codigoDataPagamento);
        } else {
            FRFERCOLFormHandler.setDataPagamento(codigoDataPagamento);
            FRFERCOLFormHandler.setAdiantamentoFerias(codigoAdiantamentoFerias);
            FRFERCOLFormHandler.setProvisaoDesconto(codigoProvisaoDesconto);
        }
    }

}
