package senior.gep.componentNames;

import com.senior.framework.testes.SistemaSenior;
import com.senior.framework.testes.Tecla;

public final class FRREAESTFormHandler {

    private FRREAESTFormHandler() {
    }

    private static final String FR_NOME = "FRREAEST";
    private static final String FD_ESTRUTURA_BASE = "SECODEST";
    private static final String FD_TIPO_BASE = "SETIPEST";
    private static final String FD_DATA_BASE = "SEDATALT";
    private static final String FD_ESTRUTURA_REAJUSTADA = "SECODEST2";
    private static final String FD_TIPO_REAJUSTADA = "SETIPEST2";
    private static final String FD_DATA_REAJUSTADA = "SEDATALT2";
    private static final String FD_AJUSTAR_ESTRUTURA = "SEAJUEST";
    private static final String FD_MOTIVO = "SECODMOT";
    private static final String FD_BASE_CALCULO = "SEBASCAL";
    private static final String FD_INTEGRAR = "SEINTBAS";
    private static final String FD_ARREDONDAMENTO = "SEREAEST";
    private static final String GD_FAIXAS = "WGDREAEST";
    private static final String BT_SELECAO = "BTNSELECAO";
    private static final String BT_PROCESSAR = "BTNPROCESSAR";

    public static void abrirTela() {
        SistemaSenior.abrirTela(FR_NOME);
    }

    public static void fecharTela() {
        SistemaSenior.fecharTela(FR_NOME);
    }

    public static void setEstruturaBase(final String valor) {
        SistemaSenior.preencherCampo(FD_ESTRUTURA_BASE, valor, Tecla.TAB);
    }

    public static void setTipoBase(final String valor) {
        SistemaSenior.preencherCampo(FD_TIPO_BASE, valor, Tecla.TAB);
    }

    public static void setDataBase(final String valor) {
        SistemaSenior.preencherCampo(FD_DATA_BASE, valor, Tecla.TAB);
    }

    public static void setEstruturaReajustada(final String valor) {
        SistemaSenior.preencherCampo(FD_ESTRUTURA_REAJUSTADA, valor, Tecla.TAB);
    }

    public static void setTipoReajustada(final String valor) {
        SistemaSenior.preencherCampo(FD_TIPO_REAJUSTADA, valor, Tecla.TAB);
    }

    public static void setDataReajustada(final String valor) {
        SistemaSenior.preencherCampo(FD_DATA_REAJUSTADA, valor, Tecla.TAB);
    }

    public static void setAjustarEstrutura(final String valor) {
        SistemaSenior.preencherCampo(FD_AJUSTAR_ESTRUTURA, valor, Tecla.TAB);
    }

    public static void setMotivo(final String valor) {
        SistemaSenior.preencherCampo(FD_MOTIVO, valor, Tecla.TAB);
    }

    public static void setBaseCalculo(final String valor) {
        SistemaSenior.preencherCampo(FD_BASE_CALCULO, valor, Tecla.TAB);
    }

    public static void setIntegrar(final String valor) {
        SistemaSenior.preencherCampo(FD_INTEGRAR, valor, Tecla.TAB);
    }

    public static void setArredondamento(final String valor) {
        SistemaSenior.preencherCampo(FD_ARREDONDAMENTO, valor, Tecla.TAB);
    }

    public static void addFaixas(final String... valores) {
        SistemaSenior.preencherNovaLinhaGrade(GD_FAIXAS, valores);
    }

    public static void clickSelecao() {
        SistemaSenior.clicar(BT_SELECAO);
    }

    public static void clickProcessar() {
        SistemaSenior.clicar(BT_PROCESSAR);
    }

}
