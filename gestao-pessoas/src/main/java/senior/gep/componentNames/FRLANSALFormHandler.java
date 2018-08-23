package senior.gep.componentNames;

import com.senior.framework.testes.SistemaSenior;
import com.senior.framework.testes.Tecla;

public class FRLANSALFormHandler {

    private FRLANSALFormHandler() {
        //Form handler class.
    }

    private static final String FR_NOME = "FRLANSAL";
    private static final String FD_DATA_ALTERACAO = "SEDATALT";
    private static final String GD_LANCAMENTO_SALARIAL = "WGDLANSAL";
    private static final String BT_PROCESSAR = "BTNPROCESSAR";

    public static void abrirTela() {
        SistemaSenior.abrirTela(FR_NOME);
    }

    public static void setDataAlteracao(final String valorDoCampo) {
        SistemaSenior.preencherCampo(FD_DATA_ALTERACAO, valorDoCampo, Tecla.TAB);
    }

    public static void setLancamentoSalarial(final String... parametros) {
        SistemaSenior.preencherNovaLinhaGrade(GD_LANCAMENTO_SALARIAL, parametros);
    }

    public static void clickProcessar() {
        SistemaSenior.clicar(BT_PROCESSAR);
    }
}
