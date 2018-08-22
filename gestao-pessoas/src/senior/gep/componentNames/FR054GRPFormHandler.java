package senior.gep.componentNames;

import com.senior.framework.testes.SistemaSenior;
import com.senior.framework.testes.Tecla;

public class FR054GRPFormHandler {

    private FR054GRPFormHandler() {
    }

    private static final String FR_NOME = "FR054GRP";
    private static final String FD_FILIAL = "CodFil";
    private static final String FD_COMPETENCIA = "ComGrp";

    public static void abrirTela() {
        SistemaSenior.abrirTela(FR_NOME);
    }

    public static void fecharTela() {
        SistemaSenior.fecharTela(FR_NOME);
    }

    public static void setFilial(final String valor) {
        SistemaSenior.preencherCampo(FD_FILIAL, valor, Tecla.TAB);
    }

    public static void setCompetencia(final String valor) {
        SistemaSenior.preencherCampo(FD_COMPETENCIA, valor, Tecla.TAB);
    }

}
