package senior.gep.componentNames;

import com.senior.framework.testes.SistemaSenior;
import com.senior.framework.testes.Tecla;

public final class FR032OPGFormHandler {

    private FR032OPGFormHandler() {
    }

    private static final String FR_NOME = "FR032OPG";
    private static final String FD_FILIAL = "CodFil";
    private static final String FD_COMPETENCIA = "CmpPoe";
    private static final String FD_OUTRA_EMPRESA = "CodOem";
    private static final String FD_SEQUENCIA = "SeqPoe";
    private static final String FD_ORIGEM_SERVICO = "RetGrp";
    private static final String FD_DATA_EMISSAO = "DatEmi";
    private static final String FD_LOCAL = "NumLoc";
    private static final String FD_VALOR_BRUTO = "DERenBru2";
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

    public static void setOutraEmpresa(final String valor) {
        SistemaSenior.preencherCampo(FD_OUTRA_EMPRESA, valor, Tecla.TAB);
    }

    public static void setSequencia(final String valor) {
        SistemaSenior.preencherCampo(FD_SEQUENCIA, valor, Tecla.TAB);
    }

    public static void setOrigemServico(final String valor) {
        SistemaSenior.preencherCampo(FD_ORIGEM_SERVICO, valor, Tecla.TAB);
    }

    public static void setDataEmissao(final String valor) {
        SistemaSenior.preencherCampo(FD_DATA_EMISSAO, valor, Tecla.TAB);
    }

    public static void setLocal(final String valor) {
        SistemaSenior.preencherCampo(FD_LOCAL, valor, Tecla.TAB);
    }

    public static void setValorBruto(final String valor) {
        SistemaSenior.preencherCampo(FD_VALOR_BRUTO, valor, Tecla.TAB);
    }

    public static void clickAlterar() {
        SistemaSenior.clicar(BT_ALTERAR);
    }
}
