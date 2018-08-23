package senior.gep.componentNames;

import com.senior.framework.testes.SistemaSenior;
import com.senior.framework.testes.Tecla;

public class FRTRFCOLFormHandler {

    private FRTRFCOLFormHandler() {
    }

    private static final String FR_NOME = "FRTRFCOL";
    private static final String FD_DATA_ALTERACAO = "SE7DatAlt";
    private static final String FD_NOVA_EMPRESA = "SE7EmpAtu";
    private static final String FD_NOVA_FILIAL = "SE7CodFil";
    private static final String FD_NOVO_LOCAL = "SE7NumLoc";
    private static final String FD_NOVO_CENTRO_CUSTO = "SE7CodCcu";
    private static final String FD_NOVA_NATUREZA_DESPESA = "SE7NatDes";
    private static final String FD_CADASTRO_INICIAL = "SE7CadAtu";
    private static final String FD_TIPO_ADMISSAO_ESOCIAL = "SEAdmeSo7";
    private static final String FD_FICHA_REGISTRO = "SE7FicReg";
    private static final String FD_FICHA_MEDICA_INICIAL = "SE7CodFic";
    private static final String FD_TIPO_ATUACAO = "SE7CodTap";
    private static final String FD_POSTO_TRABALHO = "SE7PosTra";
    private static final String FD_MOTIVO_ALTERACAO_POSTO = "SE7MotPos";
    private static final String FD_NOVO_CARGO = "SE7CodCar";
    private static final String FD_MOTIVO_ALTERACAO_CARGO = "SE7CodMot";
    private static final String BT_INCLUIR = "BtnIncluir";
    private static final String BT_OK = "BtnOk";

    public static void abrirTela() {
        SistemaSenior.abrirTela(FR_NOME);
    }

    public static void fecharTela() {
        SistemaSenior.fecharTela(FR_NOME);
    }

    public static void setTipoAtuacao(final String valor) {
        SistemaSenior.preencherCampo(FD_TIPO_ATUACAO, valor, Tecla.TAB);
    }

    public static void setPostoTrabalho(final String valor) {
        SistemaSenior.preencherCampo(FD_POSTO_TRABALHO, valor, Tecla.TAB);
    }

    public static void setMotivoAlteracaoPosto(final String valor) {
        SistemaSenior.preencherCampo(FD_MOTIVO_ALTERACAO_POSTO, valor, Tecla.TAB);
    }

    public static void setNovoCargo(final String valor) {
        SistemaSenior.preencherCampo(FD_NOVO_CARGO, valor, Tecla.TAB);
    }

    public static void setMotivoAlteracaoCargo(final String valor) {
        SistemaSenior.preencherCampo(FD_MOTIVO_ALTERACAO_CARGO, valor, Tecla.TAB);
    }

    public static void setDataAlteracao(final String valor) {
        SistemaSenior.preencherCampo(FD_DATA_ALTERACAO, valor, Tecla.TAB);
    }

    public static void setNovaEmpresa(final String valor) {
        SistemaSenior.preencherCampo(FD_NOVA_EMPRESA, valor, Tecla.TAB);
    }

    public static void setNovaFilial(final String valor) {
        SistemaSenior.preencherCampo(FD_NOVA_FILIAL, valor, Tecla.TAB);
    }

    public static void setNovoLocal(final String valor) {
        SistemaSenior.preencherCampo(FD_NOVO_LOCAL, valor, Tecla.TAB);
    }

    public static void setNovoCentroCusto(final String valor) {
        SistemaSenior.preencherCampo(FD_NOVO_CENTRO_CUSTO, valor, Tecla.TAB);
    }

    public static void setNovaNaturezaDespesa(final String valor) {
        SistemaSenior.preencherCampo(FD_NOVA_NATUREZA_DESPESA, valor, Tecla.TAB);
    }

    public static void setCadastroInicial(final String valor) {
        SistemaSenior.preencherCampo(FD_CADASTRO_INICIAL, valor, Tecla.TAB);
    }

    public static void setTipoAdmissaoEsocial(final String valor) {
        SistemaSenior.preencherCampo(FD_TIPO_ADMISSAO_ESOCIAL, valor, Tecla.TAB);
    }

    public static void setFichaRegistro(final String valor) {
        SistemaSenior.preencherCampo(FD_FICHA_REGISTRO, valor, Tecla.TAB);
    }

    public static void setFichaMedicaInicial(final String valor) {
        SistemaSenior.preencherCampo(FD_FICHA_MEDICA_INICIAL, valor, Tecla.TAB);
    }

    public static void selecionaGuiaFilial() {
        SistemaSenior.selecionarGuia("STNTrfCol", "Filial");
    }

    public static void clickOk() {
        SistemaSenior.clicar(BT_OK);
    }

    public static void clickIncluir() {
        SistemaSenior.clicar(BT_INCLUIR);
    }
}
