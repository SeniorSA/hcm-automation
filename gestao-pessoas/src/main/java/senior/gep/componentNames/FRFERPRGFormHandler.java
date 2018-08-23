package senior.gep.componentNames;

import com.senior.framework.testes.SistemaSenior;
import com.senior.framework.testes.Tecla;

public class FRFERPRGFormHandler {

    private FRFERPRGFormHandler() {
    }

    private static final String FR_NOME = "FRFERPRG";
    private static final String FD_PERIODO_INICIO = "SEIniFer";
    private static final String FD_PERIODO_FIM = "SEFimFer";
    private static final String GD_DESCONSIDERAR = "WGDFERPRG";
    private static final String FD_GERAR_ADIANTAMENTO = "SEGerAdt";
    private static final String FD_ADIANTAMENTO_13SALARIO = "SEGer13s";
    private static final String BT_CALCULAR = "BtnCalcular";

    public static void abrirTela() {
        SistemaSenior.abrirTela(FR_NOME);
    }

    public static void fecharTela() {
        SistemaSenior.fecharTela(FR_NOME);
    }

    public static void setPeriodoInicio(final String valor) {
        SistemaSenior.preencherCampo(FD_PERIODO_INICIO, valor, Tecla.TAB);
    }

    public static void setPeriodoFim(final String valor) {
        SistemaSenior.preencherCampo(FD_PERIODO_FIM, valor, Tecla.TAB);
    }

    public static void addGridDesconsiderar(final String... valores) {
        for (String valor : valores) {
            SistemaSenior.preencherNovaLinhaGrade(GD_DESCONSIDERAR, "Inválidos", valor);
        }
    }

    public static void setGerarAdiantamento(final String valor) {
        SistemaSenior.preencherCampo(FD_GERAR_ADIANTAMENTO, valor, Tecla.TAB);
    }

    public static void setAdiantamento13Salario(final String valor) {
        SistemaSenior.preencherCampo(FD_ADIANTAMENTO_13SALARIO, valor, Tecla.TAB);
    }

    public static void clickCalcular() {
        SistemaSenior.clicar(BT_CALCULAR);
    }
}
