package senior.gep.componentNames;

import com.senior.framework.testes.SistemaSenior;
import com.senior.framework.testes.Tecla;

public final class FR008EVCFormHandler {

    private FR008EVCFormHandler() {
    }

    private static final String FR_NOME = "FR008EVC";
    private static final String FD_TABELA_EVENTOS = "DECodTab1";
    private static final String FD_EVENTO = "DECodEve1";
    private static final String FD_VALOR_CALCULO = "DEValCal1";
    private static final String BT_ALTERAR = "BtnAlterar";
    private static final String FD_INICIO_VALIDADE = "DEIniVal1";
    private static final String FD_FIM_VALIDADE= "DEFimVal1";

    public static void abrirTela() {
        SistemaSenior.abrirTela(FR_NOME);
    }

    public static void fecharTela() {
        SistemaSenior.fecharTela(FR_NOME);
    }

    public static void setTabelaEventos(final String valor) {
        SistemaSenior.preencherCampo(FD_TABELA_EVENTOS, valor, Tecla.TAB);
    }

    public static void setEvento(final String valor) {
        SistemaSenior.preencherCampo(FD_EVENTO, valor, Tecla.TAB);
    }
    
    public static void setInicioValidade(final String valor) {
        SistemaSenior.preencherCampo(FD_INICIO_VALIDADE, valor, Tecla.TAB);
    }

    public static void setFimValidade(final String valor) {
        SistemaSenior.preencherCampo(FD_FIM_VALIDADE, valor, Tecla.TAB);
    }

    public static void setValorCalculo(final String valor) {
        SistemaSenior.preencherCampo(FD_VALOR_CALCULO, valor, Tecla.TAB);
    }

    public static void clickAlterar() {
        SistemaSenior.clicar(BT_ALTERAR);
    }

}