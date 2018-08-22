package senior.gep.componentNames;

import com.senior.framework.testes.SistemaSenior;
import com.senior.framework.testes.Tecla;

public class FRCALRCSFormHandler {

    private FRCALRCSFormHandler() {
    }

    private static final String FR_NOME = "FRCALRCS";
    private static final String FD_TIPO_COLABORADOR = "SETipCol";
    private static final String FD_CADASTRO = "SENumCad";
    private static final String FD_DATA_DEMISSAO = "SEDatDem";
    private static final String FD_CAUSA_DEMISSAO = "SECauDem";
    private static final String FD_DATA_AVISO = "SEDatAvi";
    private static final String FD_DATA_PAGAMENTO = "SEDatPag";
    private static final String FD_DATA_FIM_CONTRATO = "SEFimCtt";
    private static final String FD_FINAL_ANTECIPADO = "SEQtdFca";
    private static final String FD_SALDO_FGTS = "SESldFgt";
    private static final String FD_REPOSICAO_VAGA = "SeRepVag";
    private static final String FD_AVISO_GRRF = "SEAviPre";
    private static final String FD_PENSAO_FGTS = "SEPenFGT";
    private static final String FD_JORNADA_SEMANA = "SEJorSem";
    private static final String FD_ATESTADO_OBITO = "SEAteObi";
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

    public static void setAtestadoObito(String valor) {
        SistemaSenior.preencherCampo(FD_ATESTADO_OBITO, valor, Tecla.TAB);
    }

    public static void setCadastro(final String valor) {
        SistemaSenior.preencherCampo(FD_CADASTRO, valor, Tecla.TAB);
    }

    public static void setDataDemissao(final String valor) {
        SistemaSenior.preencherCampo(FD_DATA_DEMISSAO, valor, Tecla.TAB);
    }

    public static void setCausaDemissao(final String valor) {
        SistemaSenior.preencherCampo(FD_CAUSA_DEMISSAO, valor, Tecla.TAB);
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

    public static void setFinalAntecipado(final String valor) {
        SistemaSenior.preencherCampo(FD_FINAL_ANTECIPADO, valor, Tecla.TAB);
    }

    public static void setSaldoFGTS(final String valor) {
        SistemaSenior.preencherCampo(FD_SALDO_FGTS, valor, Tecla.TAB);
    }

    public static void setReposicaoVaga(final String valor) {
        SistemaSenior.preencherCampo(FD_REPOSICAO_VAGA, valor, Tecla.TAB);
    }

    public static void setAvisoPrevioGRRF(final String valor) {
        SistemaSenior.preencherCampo(FD_AVISO_GRRF, valor, Tecla.TAB);
    }

    public static void setPensaoFGTS(final String valor) {
        SistemaSenior.preencherCampo(FD_PENSAO_FGTS, valor, Tecla.TAB);
    }

    public static void setJornadaSemana(final String valor) {
        SistemaSenior.preencherCampo(FD_JORNADA_SEMANA, valor, Tecla.TAB);
    }

    public static void clickCalcular() {
        SistemaSenior.clicar(BT_CALCULAR);
    }

}
