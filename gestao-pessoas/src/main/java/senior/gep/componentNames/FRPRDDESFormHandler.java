package senior.gep.componentNames;

import com.senior.framework.testes.SistemaSenior;
import com.senior.framework.testes.Tecla;

public class FRPRDDESFormHandler {

    private FRPRDDESFormHandler() {
    }

    private static final String FR_NOME = "FRPRDDES";
    private static final String FD_FILIAL = "DECodFil1";
    private static final String FD_COMPETENCIA = "DECmpPrd1";
    private static final String FD_SEQUENCIA = "DESeqPrd1";
    private static final String FD_RECEITA_BRUTA = "DERecBru1";
    private static final String FD_RECEITA_ATIVIDADE = "DERecSer1";
    private static final String BT_ALTERAR = "BtnAlterar";

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

    public static void setSequencia(final String valor) {
        SistemaSenior.preencherCampo(FD_SEQUENCIA, valor, Tecla.TAB);
    }

    public static void setReceitaBruta(final String valor) {
        SistemaSenior.preencherCampo(FD_RECEITA_BRUTA, valor, Tecla.TAB);
    }

    public static void setReceitaAtividade(final String valor) {
        SistemaSenior.preencherCampo(FD_RECEITA_ATIVIDADE, valor, Tecla.TAB);
    }

    public static void clickAlterar() {
        SistemaSenior.clicar(BT_ALTERAR);
    }
}
