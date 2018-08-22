package senior.gep.componentNames;

import com.senior.framework.testes.SistemaSenior;
import com.senior.framework.testes.Tecla;

public class FRGERDARFormHandler {

    private FRGERDARFormHandler() {
    }

    private static final String FR_NOME = "FRGERDAR";
    private static final String FD_DATA_INICIAL = "SEDatIni";
    private static final String FD_DATA_FINAL = "SEDatFim";
    private static final String FD_DATA_RECOLHIMENTO = "SEDatRec";
    private static final String FD_TIPO_IRF = "SETipIrf";
    private static final String FD_RECOLHIDO = "SESitRec";
    private static final String FD_COMPENSAR = "SECmpGrp";
    private static final String FD_GERAR_SEPARADOS = "SEGerSep";
    private static final String FD_JUNTAR_RECEITAS = "SEJunRec";
    private static final String FD_ORIGEM = "SEOriIrf";
    private static final String BT_PROCESSAR = "BtnProcessar";

    public static void abrirTela() {
        SistemaSenior.abrirTela(FR_NOME);
    }

    public static void fecharTela() {
        SistemaSenior.fecharTela(FR_NOME);
    }

    public static void setDataInicial(final String valor) {
        SistemaSenior.preencherCampo(FD_DATA_INICIAL, valor, Tecla.TAB);
    }

    public static void setDataFinal(final String valor) {
        SistemaSenior.preencherCampo(FD_DATA_FINAL, valor, Tecla.TAB);
    }

    public static void setDataRecolhimento(final String valor) {
        SistemaSenior.preencherCampo(FD_DATA_RECOLHIMENTO, valor, Tecla.TAB);
    }

    public static void setTipoIRF(final String valor) {
        SistemaSenior.preencherCampo(FD_TIPO_IRF, valor, Tecla.TAB);
    }

    public static void setRecolhido(final String valor) {
        SistemaSenior.preencherCampo(FD_RECOLHIDO, valor, Tecla.TAB);
    }

    public static void setCompensar(final String valor) {
        SistemaSenior.preencherCampo(FD_COMPENSAR, valor, Tecla.TAB);
    }

    public static void setGerarSeparados(final String valor) {
        SistemaSenior.preencherCampo(FD_GERAR_SEPARADOS, valor, Tecla.TAB);
    }

    public static void setJuntarReceitas(final String valor) {
        SistemaSenior.preencherCampo(FD_JUNTAR_RECEITAS, valor, Tecla.TAB);
    }

    public static void setOrigem(final String valor) {
        SistemaSenior.preencherCampo(FD_ORIGEM, valor, Tecla.TAB);
    }

    public static void clickProcessar() {
        SistemaSenior.clicar(BT_PROCESSAR);
    }
}
