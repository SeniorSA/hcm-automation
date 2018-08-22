package senior.gep.componentNames;

import com.senior.framework.testes.SistemaSenior;
import com.senior.framework.testes.Tecla;

public class FR038HSAFormHandler {

    private FR038HSAFormHandler() {
        //Form handler class.
    }

    private static final String FR_NOME = "FR038HSA";
    private static final String FD_TIPO_COLABORADOR = "DETipCol1";
    private static final String FD_COLABORADOR = "DENumCad1";
    private static final String FD_ALTERACAO = "DEDatAlt1";
    private static final String FD_SEQUENCIA = "DESeqAlt1";
    private static final String FD_MOTIVO = "DECodMot1";
    private static final String FD_DATA_FECHAMENTO_DISSIDIO = "DEDatDis1";
    private static final String FD_TIPO_SALARIO = "DETipSal1";
    private static final String FD_ESTRUTURA = "DECodEst1";
    private static final String FD_CLASSE_SALARIAL = "DEClaSal1";
    private static final String FD_NIVEL_SALARIAL = "DENivSal1";
    private static final String FD_SALARIO = "DEValSal1";
    private static final String FD_COMPLEMENTO = "DECplSal1";
    private static final String BT_ALTERAR = "BtnAlterar";

    public static void abrirTela() {
        SistemaSenior.abrirTela(FR_NOME);
    }

    public static void fecharTela() {
        SistemaSenior.abrirTela(FR_NOME);
    }

    public static void setTipoColaborador(final String valor) {
        SistemaSenior.preencherCampo(FD_TIPO_COLABORADOR, valor, Tecla.TAB);
    }

    public static void setColaborador(final String valor) {
        SistemaSenior.preencherCampo(FD_COLABORADOR, valor, Tecla.TAB);
    }

    public static void setAlteracao(final String valor) {
        SistemaSenior.preencherCampo(FD_ALTERACAO, valor, Tecla.TAB);
    }

    public static void setSequencia(final String valor) {
        SistemaSenior.preencherCampo(FD_SEQUENCIA, valor, Tecla.TAB);
    }

    public static void setMotivo(final String valor) {
        SistemaSenior.preencherCampo(FD_MOTIVO, valor, Tecla.TAB);
    }

    public static void setDataFechamentoDissidio(final String valor) {
        SistemaSenior.preencherCampo(FD_DATA_FECHAMENTO_DISSIDIO, valor, Tecla.TAB);
    }

    public static void setTipoSalario(final String valor) {
        SistemaSenior.preencherCampo(FD_TIPO_SALARIO, valor, Tecla.TAB);
    }

    public static void setEstrutura(final String valor) {
        SistemaSenior.preencherCampo(FD_ESTRUTURA, valor, Tecla.TAB);
    }

    public static void setClasseSalarial(final String valor) {
        SistemaSenior.preencherCampo(FD_CLASSE_SALARIAL, valor, Tecla.TAB);
    }

    public static void setNivelSalarial(final String valor) {
        SistemaSenior.preencherCampo(FD_NIVEL_SALARIAL, valor, Tecla.TAB);
    }

    public static void setSalario(final String valor) {
        SistemaSenior.preencherCampo(FD_SALARIO, valor, Tecla.TAB);
    }

    public static void setComplemento(final String valor) {
        SistemaSenior.preencherCampo(FD_COMPLEMENTO, valor, Tecla.TAB);
    }

    public static void clickAlterar() {
        SistemaSenior.clicar(BT_ALTERAR);
    }

}
