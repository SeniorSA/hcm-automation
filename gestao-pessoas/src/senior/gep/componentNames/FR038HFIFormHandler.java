package senior.gep.componentNames;

import com.senior.framework.testes.SistemaSenior;
import com.senior.framework.testes.Tecla;

public final class FR038HFIFormHandler {

    private FR038HFIFormHandler() {

    }

    private static final String FR_NOME = "FR038HFI";
    private static final String FD_TIPO_COLABORADOR = "DETipCol1";
    private static final String FD_COLABORADOR = "DENumCad1";
    private static final String FD_DATA_ALTERACAO = "DEDatAlt1";
    private static final String FD_NOVA_EMPRESA = "DEEmpAtu1";
    private static final String FD_NOVO_CADASTRO = "DECadAtu1";
    private static final String FD_NOVA_FILIAL = "DECodFil1";
    private static final String FD_POSTO_TRABALHO = "DEPosTra1";
    private static final String FD_LOCAL = "DENumLoc1";
    private static final String FD_NOVO_CENTRO_DE_CUSTO = "DECodCcu1";
    private static final String FD_NOVA_NATUREZA_DESPESA = "DENatDes1";
    private static final String FD_TIPO_ADMISSAO = "DETipAdm1";
    private static final String FD_TIPO_ADMISSAO_ESOCIAL = "DEAdmEso1";
    private static final String FD_FICHA_REGISTRO = "DEFicReg1";
    private static final String FD_NOVO_CARGO = "DECodCar2";
    private static final String FD_MOTIVO_ALTERACAO = "DECodMot2";
    private static final String FD_NOVA_ESCALA = "DECodEsc2";
    private static final String FD_TURMA = "DECodTma2";
    private static final String FD_VINCULO = "DECodVin2";
    private static final String FD_MOTIVO = "DECodMts2";
    private static final String FD_TIPO_SALARIO = "DETipSal2";
    private static final String FD_VALOR_SALARIO = "DEValSal2";
    private static final String BT_INSERIR = "BtnAlterar";
    private static final String BT_CANCELAR = "BtnCancelar";
    private static final String BT_EXCLUIR = "BtnExcluir";
    private static final String FD_TIPO_ATUACAO = "DECodTap1";
    private static final String FD_MOTIVO_ALTERACAO_POSTO = "DEMotPos2";
    private static final String FD_VALOR_COMPLEMENTO = "DECplSal2";

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

    public static void setDataAlteracao(final String valor) {
        SistemaSenior.preencherCampo(FD_DATA_ALTERACAO, valor, Tecla.TAB);
    }

    public static void setNovaEmpresa(final String valor) {
        SistemaSenior.preencherCampo(FD_NOVA_EMPRESA, valor, Tecla.TAB);
    }

    public static void setNovoCadastro(final String valor) {
        SistemaSenior.preencherCampo(FD_NOVO_CADASTRO, valor, Tecla.TAB);
    }

    public static void setNovaFilial(final String valor) {
        SistemaSenior.preencherCampo(FD_NOVA_FILIAL, valor, Tecla.TAB);
    }

    public static void setPostoTrabalho(final String valor) {
        SistemaSenior.preencherCampo(FD_POSTO_TRABALHO, valor, Tecla.TAB);
    }

    public static void setLocal(final String valor) {
        SistemaSenior.preencherCampo(FD_LOCAL, valor, Tecla.TAB);
    }

    public static void setNovoCentroCusto(final String valor) {
        SistemaSenior.preencherCampo(FD_NOVO_CENTRO_DE_CUSTO, valor, Tecla.TAB);
    }

    public static void setNovaNaturezaDespesa(final String valor) {
        SistemaSenior.preencherCampo(FD_NOVA_NATUREZA_DESPESA, valor, Tecla.TAB);
    }

    public static void setTipoAdmissao(final String valor) {
        SistemaSenior.preencherCampo(FD_TIPO_ADMISSAO, valor, Tecla.TAB);
    }

    public static void setTipoAdmissaoEsocial(final String valor) {
        SistemaSenior.preencherCampo(FD_TIPO_ADMISSAO_ESOCIAL, valor, Tecla.TAB);
    }

    public static void setFichaRegistro(final String valor) {
        SistemaSenior.preencherCampo(FD_FICHA_REGISTRO, valor, Tecla.TAB);
    }

    public static void setNovoCargo(final String valor) {
        SistemaSenior.preencherCampo(FD_NOVO_CARGO, valor, Tecla.TAB);
    }

    public static void setMotivoAlteracao(final String valor) {
        SistemaSenior.preencherCampo(FD_MOTIVO_ALTERACAO, valor, Tecla.TAB);
    }

    public static void setNovaEscala(final String valor) {
        SistemaSenior.preencherCampo(FD_NOVA_ESCALA, valor, Tecla.TAB);
    }

    public static void setTurma(final String valor) {
        SistemaSenior.preencherCampo(FD_TURMA, valor, Tecla.TAB);
    }

    public static void setVinculo(final String valor) {
        SistemaSenior.preencherCampo(FD_VINCULO, valor, Tecla.TAB);
    }

    public static void setMotivo(final String valor) {
        SistemaSenior.preencherCampo(FD_MOTIVO, valor, Tecla.TAB);
    }

    public static void setTipoSalario(final String valor) {
        SistemaSenior.preencherCampo(FD_TIPO_SALARIO, valor, Tecla.TAB);
    }

    public static void setValorSalario(final String valor) {
        SistemaSenior.preencherCampo(FD_VALOR_SALARIO, valor, Tecla.TAB);
    }

    public static void setTipoAtuacao(final String valor) {
        SistemaSenior.preencherCampo(FD_TIPO_ATUACAO, valor, Tecla.TAB);
    }

    public static void setMotivoAlteracaoPosto(String valor) {
        SistemaSenior.preencherCampo(FD_MOTIVO_ALTERACAO_POSTO, valor, Tecla.TAB);
    }

    public static void setValorComplemento(final String valor) {
        SistemaSenior.preencherCampo(FD_VALOR_COMPLEMENTO, valor, Tecla.TAB);
    }

    public static void clickInserir() {
        SistemaSenior.clicar(BT_INSERIR);
    }

    public static void clickCancelar() {
        SistemaSenior.clicar(BT_CANCELAR);
    }

    public static void clickExcluir() {
        SistemaSenior.clicar(BT_EXCLUIR);
    }

    public static void excluirHistoricoFilial(String tipoColaborador, String codColaborador, String datAlteracao, boolean checkMensagemLog) {
        setTipoColaborador(tipoColaborador);
        setColaborador(codColaborador);
        setDataAlteracao(datAlteracao);

        SistemaSenior.conferirCaixaMensagem("Aviso", "Colaborador não está trabalhando nesta data. Verifique afastamentos. ", "Ok");

        clickExcluir();

        SistemaSenior.conferirCaixaMensagem("Confirmação", "Deseja excluir o registro? ", "Sim");

        if (checkMensagemLog) {
            SistemaSenior.conferirCaixaMensagem("Aviso", "Favor verificar mensagens no log. ", "Ok");
        }
    }
}
