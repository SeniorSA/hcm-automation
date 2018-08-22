package senior.gep.componentNames;

import com.senior.framework.testes.SistemaSenior;
import com.senior.framework.testes.Tecla;

public class FRSIMINDFormHandler {

    private FRSIMINDFormHandler() {

    }

    private static final String FR_NOME = "FRSIMIND";
    private static final String FD_DATA_ALTERACAO = "SEDatAlt";
    private static final String GD_RELACAO_SIMULACOES = "WGDSIMIND";
    private static final String BT_PROCESSAR = "BtnProcessar";

    public static void abrirTela() {
        SistemaSenior.abrirTela(FR_NOME);
    }

    public static void fecharTela() {
        SistemaSenior.fecharTela(FR_NOME);
    }

    public static void setDataAlteracao(String valor) {
        SistemaSenior.preencherCampo(FD_DATA_ALTERACAO, valor, Tecla.TAB);
    }

    public static void insereGridCadastro(String cadastro, String salario) {
        SistemaSenior.preencherNovaLinhaGrade(GD_RELACAO_SIMULACOES, "Cadastro", cadastro, "Salário", salario);
        SistemaSenior.teclar(Tecla.TAB);
    }

    public static void clickProcessar() {
        SistemaSenior.clicar(BT_PROCESSAR);
    }
}
