package senior.gep.componentNames;

import com.senior.framework.testes.SistemaSenior;
import com.senior.framework.testes.Tecla;

public class FR056SEFFormHandler {

    private FR056SEFFormHandler() {
    }

    private static final String FR_NOME = "FR056SEF";
    private static final String FD_TIPO_COLABORADOR = "TipCol";
    private static final String FD_COLABORADOR = "NumCad";
    private static final String FD_FILIAL = "CodFil";
    private static final String FD_CODIGO_RECOLHIMENTO = "CdrFgt";
    private static final String FD_COMPETENCIA = "CmpSef";
    private static final String FD_TIPO_FOLHA = "TipSef";

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

    public static void setFilial(final String valor) {
        SistemaSenior.preencherCampo(FD_FILIAL, valor, Tecla.TAB);
    }

    public static void setCodigoRecolhimento(final String valor) {
        SistemaSenior.preencherCampo(FD_CODIGO_RECOLHIMENTO, valor, Tecla.TAB);
    }

    public static void setCompetencia(final String valor) {
        SistemaSenior.preencherCampo(FD_COMPETENCIA, valor, Tecla.TAB);
    }

    public static void setTipoFolha(final String valor) {
        SistemaSenior.preencherCampo(FD_TIPO_FOLHA, valor, Tecla.TAB);
    }
}
