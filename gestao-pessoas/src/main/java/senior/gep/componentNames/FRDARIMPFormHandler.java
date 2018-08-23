package senior.gep.componentNames;

import com.senior.framework.testes.SistemaSenior;
import com.senior.framework.testes.Tecla;

public class FRDARIMPFormHandler {

    private FRDARIMPFormHandler() {
    }

    private static final String FR_NOME = "FRDARIMP";
    private static final String FD_COMPETENCIA = "SEDatCom";
    private static final String FD_TIPO_PERIODO = "SETipPer";
    private static final String FD_DATA_RECOLHIMENTO = "SEDatPag";
    private static final String FD_RECEITA = "SECodRec";
    private static final String FD_COMPENSAR = "SECmpGrp";
    private static final String FD_GERAR_SEPARADO = "SEGerSep";
    private static final String BT_PROCESSAR = "BtnProcessar";

    public static void abrirTela() {
        SistemaSenior.abrirTela(FR_NOME);
    }

    public static void fecharTela() {
        SistemaSenior.fecharTela(FR_NOME);
    }

    public static void setCompetencia(final String valor) {
        SistemaSenior.preencherCampo(FD_COMPETENCIA, valor, Tecla.TAB);
    }

    public static void setTipoPeriodo(final String valor) {
        SistemaSenior.preencherCampo(FD_TIPO_PERIODO, valor, Tecla.TAB);
    }

    public static void setDataRecolhimento(final String valor) {
        SistemaSenior.preencherCampo(FD_DATA_RECOLHIMENTO, valor, Tecla.TAB);
    }

    public static void setReceita(final String valor) {
        SistemaSenior.preencherCampo(FD_RECEITA, valor, Tecla.TAB);
    }

    public static void setCompensar(final String valor) {
        SistemaSenior.preencherCampo(FD_COMPENSAR, valor, Tecla.TAB);
    }

    public static void setGerarSeparado(final String valor) {
        SistemaSenior.preencherCampo(FD_GERAR_SEPARADO, valor, Tecla.TAB);
    }

    public static void clickProcessar() {
        SistemaSenior.clicar(BT_PROCESSAR);
    }

}
