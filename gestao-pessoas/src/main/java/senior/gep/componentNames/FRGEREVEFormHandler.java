package senior.gep.componentNames;

import com.senior.framework.testes.SistemaSenior;
import com.senior.framework.testes.Tecla;

/**
 * @author ramon.felizetti
 */
public class FRGEREVEFormHandler {

    public FRGEREVEFormHandler() {
    }
    
    private static final String FR_NOME = "FRGEREVE";
    private static final String FD_DATA_INICIO_PERIODO = "SEIniGer";
    private static final String FD_DATA_FIM_PERIODO = "SEFimGer";
    private static final String FD_DATA_PROJETAR = "SEFimPrj";
    private static final String FD_DATA_DEMISSAO = "SEDatDem";
    private static final String FD_PERIODO_PAGAMENTO = "SEPerPag";
    private static final String FD_GERAR_RELATÓRIO = "SEGerRel";
    private static final String FD_EVENTOS_DUPLOS = "SEEveDup";
    private static final String FD_GERAR_TERMINO_ULTIMA_SEMANA = "SETerSem";    
    private static final String FD_CALCULA_RESCISAO = "SECalRes";        
    private static final String BT_PROCESSAR = "BtnProcessar";
    private static final String BT_SAIR = "BtnSair";
    private static final String BT_AJUDA = "BtnAjuda";
    private static final String BT_CANCELAR = "BtnCancelar";
    private static final String BT_SELECAO = "BtnSelecao";
    private static final String BT_BANCO_HORAS = "BtnGerBHr";
    private static final String BT_ASSINCRONO = "BtnAssincrono";
    private static final String BT_AGENDAR = "BtnAgendar";
    
    private static final String RT_STATUS = "SLBStaPro";
    public static final String STATUS_ERROR = "Geração de Eventos Com Erro. Verifique o Log.";    
    public static final String STATUS_OK = "Geração de Eventos Ok.";
    public static final String STATUS_NENHUM_COLABORADOR_PROCESSADO = "Nenhum Colaborador Processado.";
    public static final String STATUS_NENHUM_COLABORADOR_PROCESSADO_CON_LOG = "Nenhum Colaborador Processado. Verifique o Log.";
    
    public static void abrirTela() {
        SistemaSenior.abrirTela(FR_NOME);
    }

    public static void fecharTela() {
        SistemaSenior.fecharTela(FR_NOME);
    }

    public static void setInicioPeriodo(final String valor) {
        SistemaSenior.preencherCampo(FD_DATA_INICIO_PERIODO, valor, Tecla.TAB);
    }
    
    public static void setFimPeriodo(final String valor) {
        SistemaSenior.preencherCampo(FD_DATA_FIM_PERIODO, valor, Tecla.TAB);
    }
    
    public static void setProjetarAte(final String valor) {
        SistemaSenior.preencherCampo(FD_DATA_PROJETAR, valor, Tecla.TAB);
    }
    
    public static void setDataDemissao(final String valor) {
        SistemaSenior.preencherCampo(FD_DATA_DEMISSAO, valor, Tecla.TAB);
    }
    
    public static void setPeriodoPagamento(final String valor) {
        SistemaSenior.preencherCampo(FD_PERIODO_PAGAMENTO, valor, Tecla.TAB);
    }
    
    public static void setGerarRelatorio(final String valor) {
        SistemaSenior.preencherCampo(FD_GERAR_RELATÓRIO, valor, Tecla.TAB);
    }
    
    public static void setEventosDuplos(final String valor) {
        SistemaSenior.preencherCampo(FD_EVENTOS_DUPLOS, valor, Tecla.TAB);
    }
    
    public static void setGerarAteTerminoUltimaSemana(final String valor) {
        SistemaSenior.preencherCampo(FD_GERAR_TERMINO_ULTIMA_SEMANA, valor, Tecla.TAB);
    }
    
    public static void setCalcularRescisaoAdmPessoal(final String valor) {
        SistemaSenior.preencherCampo(FD_CALCULA_RESCISAO, valor, Tecla.TAB);
    }
    
    public static void clickProcessar() {
        SistemaSenior.clicar(BT_PROCESSAR);
        SistemaSenior.conferirCaixaMensagem("Confirmação", "Confirma Geração de Eventos?", "Sim");
        SistemaSenior.clicar("BtnOk");
    }
    
    public static void clickSair() {
        SistemaSenior.clicar(BT_SAIR);
    }
    
    public static void clickAjuda() {
        SistemaSenior.clicar(BT_AJUDA);
    }
    
    public static void clickCancelar() {
        SistemaSenior.clicar(BT_CANCELAR);
    }
    
    public static void clickSelecao() {
        SistemaSenior.clicar(BT_SELECAO);
    }
    
    public static void clickBancoHoras() {
        SistemaSenior.clicar(BT_BANCO_HORAS);
    }
    
    public static void clickAssincrono() {
        SistemaSenior.clicar(BT_ASSINCRONO);
    }
    
    public static void clickAgendar() {
        SistemaSenior.clicar(BT_AGENDAR);
    }
    
    public static void clickProcessarVerificarStatus(String aStatusOK, String aStatusFalha) {
        SistemaSenior.clicar(BT_PROCESSAR);
        SistemaSenior.conferirCaixaMensagem("Confirmação", "Confirma Geração de Eventos?", "Sim");
        conferirStatus(false, aStatusOK,aStatusFalha );
        SistemaSenior.clicar("BtnOk");
    }
    
    public static void conferirStatus(boolean isSucessful, String aStatusOK, String aStatusFalha) {
        SistemaSenior.conferirRotulo(RT_STATUS, isSucessful ? aStatusOK : aStatusFalha);
    }
}
