package senior.gep.componentNames;

import com.senior.framework.testes.SistemaSenior;
import com.senior.framework.testes.Tecla;

public class FRREAEFEFormHandler {

    private FRREAEFEFormHandler() {
        //Form handler class.
    }

    private static final String TS_SALARIOS = "pcTipRej";
    private static final String FR_NOME = "FRREAEFE";
    private static final String FD_DATA_ALTERACAO = "SEDATALT";
    private static final String FD_MOTIVO = "SECODMOT";
    private static final String FD_TIPO_SISTEMA = "SETIPSIS";
    private static final String FD_SALARIO_NORMATIVO = "SENOR";
    private static final String FD_ADMITIDOS_MES = "SEADMMES";
    private static final String FD_DEMITIDOS = "SEDEMMES";
    private static final String FD_DEMITIDOS_APARTIR = "SEDATDEM";
    private static final String FD_ARREDONDAR_MENSALISTA = "SEARRMEN";
    private static final String FD_ARREDONDAR_HORISTA = "SEARRHOR";
    private static final String FD_SALARIO_ANTERIOR = "SEValSal";
    private static final String FD_NOVO_SALARIO = "SENovSal";
    private static final String GD_FAIXAS_SALARIAIS = "WGDFAISAL";
    private static final String CB_SALARIO_NORMAL = "CBSALNOR";
    private static final String CB_COMPLEMENTO = "CBCOM";
    private static final String CB_HISTORICOS_SALARIAIS_FUTUROS = "SCBHISSALFUT";
    private static final String CB_TRANSFERENCIA_FILIAL = "SCBTRFFILFUT";
    private static final String CB_PROPOSTAS_SALARIAIS_FILIAL = "SCBPROSALFUT";
    private static final String RG_INTEGRAR = "RGTipInt";
    private static final String RG_REAJUSTES_FUTUROS = "SRGMANTERHISTFUTUROS";
    private static final String RG_REAJUSTAR = "SRGREAJUSTAR";
    private static final String RG_SINAL = "RGSin";
    private static final String BT_MOSTRAR = "BTNMOSTRAR";
    private static final String BT_PROCESSAR = "BTNPROCESSAR";
    private static final String FD_DATA_FECHAMENTO_DISSIDIO = "SEDatDis";

    public static void abrirTela() {
        SistemaSenior.abrirTela(FR_NOME);
    }

    public static void fecharTela() {
        SistemaSenior.fecharTela(FR_NOME);
    }

    public static void selecionarGuiaSubstituir() {
        SistemaSenior.selecionarGuia(TS_SALARIOS, "Substituir");
    }

    public static void setDataAlteracao(final String valor) {
        SistemaSenior.preencherCampo(FD_DATA_ALTERACAO, valor, Tecla.TAB);
    }

    public static void setMotivo(final String valor) {
        SistemaSenior.preencherCampo(FD_MOTIVO, valor, Tecla.TAB);
    }

    public static void setTipoSistema(final String valor) {
        SistemaSenior.preencherCampo(FD_TIPO_SISTEMA, valor, Tecla.TAB);
    }

    public static void setSalarioNormativo(final String valor) {
        SistemaSenior.preencherCampo(FD_SALARIO_NORMATIVO, valor, Tecla.TAB);
    }

    public static void setAdmitidosMes(final String valor) {
        SistemaSenior.preencherCampo(FD_ADMITIDOS_MES, valor, Tecla.TAB);
    }

    public static void setDemitidos(final String valor) {
        SistemaSenior.preencherCampo(FD_DEMITIDOS, valor, Tecla.TAB);
    }

    public static void setDemitidosApartir(final String valor) {
        SistemaSenior.preencherCampo(FD_DEMITIDOS_APARTIR, valor, Tecla.TAB);
    }

    public static void setArredondarMensalista(final String valor) {
        SistemaSenior.preencherCampo(FD_ARREDONDAR_MENSALISTA, valor, Tecla.TAB);
    }

    public static void setArredondarHorista(final String valor) {
        SistemaSenior.preencherCampo(FD_ARREDONDAR_HORISTA, valor, Tecla.TAB);
    }

    public static void setFaixasSalariais(final String... parametros) {
        SistemaSenior.preencherNovaLinhaGrade(GD_FAIXAS_SALARIAIS, parametros);
    }

    public static void setSalarioAnterior(String salarioAnterior) {
        SistemaSenior.preencherCampo(FD_SALARIO_ANTERIOR, salarioAnterior, Tecla.TAB);
    }

    public static void setNovoSalario(String novoSalario) {
        SistemaSenior.preencherCampo(FD_NOVO_SALARIO, novoSalario, Tecla.TAB);
    }

    public static void selectSinal(String item) {
        SistemaSenior.selecionarItem(RG_SINAL, item);
    }

    public static void checkSalarioNormal(boolean marcar) {
        if (marcar) {
            SistemaSenior.marcarCaixaAtribuicao(CB_SALARIO_NORMAL);
        } else {
            SistemaSenior.desmarcarCaixaAtribuicao(CB_SALARIO_NORMAL);
        }
    }

    public static void checkComplemento(boolean marcar) {
        if (marcar) {
            SistemaSenior.marcarCaixaAtribuicao(CB_COMPLEMENTO);
        } else {
            SistemaSenior.desmarcarCaixaAtribuicao(CB_COMPLEMENTO);
        }
    }

    public static void checkHistoricosSalariaisFuturos() {
        SistemaSenior.marcarCaixaAtribuicao(CB_HISTORICOS_SALARIAIS_FUTUROS);
    }

    public static void checkTransferenciaFilial() {
        SistemaSenior.marcarCaixaAtribuicao(CB_TRANSFERENCIA_FILIAL);
    }

    public static void checkPropostasSalariaisFuturas() {
        SistemaSenior.marcarCaixaAtribuicao(CB_PROPOSTAS_SALARIAIS_FILIAL);
    }

    public static void checkIntegrar(final String item) {
        SistemaSenior.selecionarItem(RG_INTEGRAR, item);
    }

    public static void checkReajustesFuturos(final String item) {
        SistemaSenior.selecionarItem(RG_REAJUSTES_FUTUROS, item);
    }

    public static void checkReajustar(final String item) {
        SistemaSenior.selecionarItem(RG_REAJUSTAR, item);
    }

    public static void conferirMensagem() {
        SistemaSenior.conferirCaixaMensagem("Advertência", "Processo finalizado!", "OK");
    }

    public static void clickMostrar() {
        SistemaSenior.clicar(BT_MOSTRAR);
    }

    public static void clickProcessar() {
        SistemaSenior.clicar(BT_PROCESSAR);
    }

    public static void setDataFechamentoDissidio(final String valor) {
        SistemaSenior.preencherCampo(FD_DATA_FECHAMENTO_DISSIDIO, valor, Tecla.TAB);
    }

}
