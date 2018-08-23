package senior.gep.componentNames;

import com.senior.framework.testes.SistemaSenior;
import com.senior.framework.testes.Tecla;

public class FR040PRGFormHandler {

    private FR040PRGFormHandler() {
    }

    private static final String FR_NOME = "FR040PRG";
    private static final String FD_TIPO_COLABORADOR = "SETipCol";
    private static final String FD_COLABORADOR = "SENumCad";
    private static final String FD_INICIO_PERIODO = "SEIniPer";

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

    public static void setInicioPeriodo(final String valor) {
        SistemaSenior.preencherCampo(FD_INICIO_PERIODO, valor, Tecla.TAB);
    }

}
