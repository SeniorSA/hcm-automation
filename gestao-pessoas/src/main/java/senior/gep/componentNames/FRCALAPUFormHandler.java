package senior.gep.componentNames;

import com.senior.framework.testes.SistemaSenior;
import com.senior.framework.testes.Tecla;

/**
 * @author ramon.felizetti
 */
public class FRCALAPUFormHandler {


    public FRCALAPUFormHandler() {
    }
    
    private static final String FR_NOME = "FRCALAPU";
    private static final String FD_DATA_INICIO_PERIODO = "SEDatIni";
    private static final String FD_DATA_FIM_PERIODO = "SEDatFim";
    private static final String FD_TIPO_PROCESSAMENTO = "SEProApu";   
    private static final String FD_DESFAZER_ACERTO= "SEDesAce";
    private static final String FD_REALOCAR_MARCACOES = "SEReaMar";
    private static final String FD_DIAS_VERIFICADOS = "SEDiaVer";    
    private static final String FD_MANTER_MOTIVOS_DIAS_RECALCULADOS = "SEMotDRe";        
    private static final String BT_PROCESSAR = "BtnProcessar";
    private static final String BT_SAIR = "BtnSair";
    private static final String BT_AJUDA = "BtnAjuda";
    private static final String BT_CANCELAR = "BtnCancelar";
    private static final String BT_SELECAO = "BtnSelecao";
    private static final String BT_BANCO_HORAS = "BtnGerBHr";
    private static final String BT_ASSINCRONO = "BtnAssincrono";
    private static final String BT_AGENDAR = "BtnAgendar";
    
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
    
    public static void setTipoProcessamento(final String valor) {
        SistemaSenior.preencherCampo(FD_TIPO_PROCESSAMENTO, valor, Tecla.TAB);
    }
    
    public static void setDesfazerAcertosSituacoes(final String valor) {
        SistemaSenior.preencherCampo(FD_DESFAZER_ACERTO, valor, Tecla.TAB);
    }
    
    public static void setRealocarMarcacoes(final String valor) {
        SistemaSenior.preencherCampo(FD_REALOCAR_MARCACOES, valor, Tecla.TAB);
    }
    
    public static void setDesfazerDiasVerificados(final String valor) {
        SistemaSenior.preencherCampo(FD_DIAS_VERIFICADOS, valor, Tecla.TAB);
    }
    
    public static void setManterMotivosDiasRecalculados(final String valor) {
        SistemaSenior.preencherCampo(FD_MANTER_MOTIVOS_DIAS_RECALCULADOS, valor, Tecla.TAB);
    }    
    
    public static void clickProcessar() {
        SistemaSenior.clicar(BT_PROCESSAR);
        SistemaSenior.conferirCaixaMensagem("Confirmação", "Confirma o Cálculo de Apuração ?", "Sim");
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

}
