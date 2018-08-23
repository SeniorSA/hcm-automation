package senior.gep.componentNames;

import com.senior.framework.testes.SistemaSenior;
import com.senior.framework.testes.Tecla;

public class FR040FEGFormHandler {

    private static final String BT_ALTERAR = "BtnAlterar";
    private static final String FD_DATA_INICIO_FERIAS = "SEIniFer";
    private static final String FD_DATA_INICIO_PERIODO = "SEIniPer";
    private static final String FD_NUMERO_COLABORADOR = "SENumCad";
    private static final String FD_TIPO_COLABORADOR = "SETipCol";
    private static final String FR_NOME = "FR040FEG";
    private static final String GD_AFASTAMENTOS = "WGD040FEG";

    public static void abrirTela() {
        SistemaSenior.abrirTela(FR_NOME);
    }

    public static void setTipoColaborador(String tipoColaborador) {
        SistemaSenior.preencherCampo(FD_TIPO_COLABORADOR, tipoColaborador, Tecla.TAB);
    }

    public static void setColaborador(String colaborador) {
        SistemaSenior.preencherCampo(FD_NUMERO_COLABORADOR, colaborador, Tecla.TAB);
    }

    public static void setInicioPeriodo(String dataInicio) {
        SistemaSenior.preencherCampo(FD_DATA_INICIO_PERIODO, dataInicio, Tecla.TAB);
    }

    public static void setInicioFerias(String dataInicioFerias) {
        SistemaSenior.preencherCampo(FD_DATA_INICIO_FERIAS, dataInicioFerias, Tecla.TAB);
    }

    public static void alteraGridAfastamento(int linha, String inicioAfastamento, String terminoAfastamento) {
        SistemaSenior.preencherCampoGrade(GD_AFASTAMENTOS, "Início Afastamento", linha, inicioAfastamento);
        SistemaSenior.preencherCampoGrade(GD_AFASTAMENTOS, "Término Afastamento", linha, terminoAfastamento, Tecla.TAB, Tecla.TAB);
    }

    public static void insereGridAfastamento(String inicioAfastamento, String terminoAfastamento) {
        SistemaSenior.preencherNovaLinhaGrade(GD_AFASTAMENTOS, "Início Afastamento", inicioAfastamento, "Término Afastamento", terminoAfastamento);
    }

    public static void clickAlterar() {
        SistemaSenior.clicar(BT_ALTERAR);
    }

    public static void fecharTela() {
        SistemaSenior.fecharTela(FR_NOME);
    }
}
