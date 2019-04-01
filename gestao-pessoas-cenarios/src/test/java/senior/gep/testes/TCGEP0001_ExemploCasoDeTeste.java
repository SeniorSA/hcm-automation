package senior.gep.testes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;

import com.senior.framework.testes.SistemaSenior;
import com.senior.framework.testes.SistemaSeniorComTransacao;
import com.senior.framework.testes.Tecla;
import com.senior.framework.testes.TipoParametroSQL;

import senior.gep.AssertivaGEP;
import senior.gep.ReexecutarTeste.Reexecutar;
import senior.gep.TCBaseGEPNucleo;
import senior.gep.utils.Facilitadores;
import senior.gep.utils.NomeSistema;
import senior.gep.utils.NomeUsuarios;

/**
 * Cenário que trata o assunto XYZ.
 * 
 * Pré-condições: XYZ.
 *
 */
public class TCGEP0001_ExemploCasoDeTeste {

    @Rule
    public Reexecutar reexecutar = new Reexecutar(3);

    /**
     * Inicializa sistema.
     */
    @BeforeClass
    public static void setUpClass() {
        try {
            SistemaSenior.iniciarSistema(NomeSistema.HCM, NomeUsuarios.HCM);
            SistemaSenior.conferirCaixaMensagem("*", "O Sistema está sendo executado", "OK");
        } catch (Exception e) {
            if (e.getMessage().contains("Timeout")) {
                SistemaSenior.finalizarSistema();
                SistemaSenior.iniciarSistema(NomeSistema.HCM, NomeUsuarios.HCM);
            }
        }
    }

    /**
     * Finaliza sistema.
     */
    @AfterClass
    public static void tearDownClass() {
        SistemaSenior.finalizarSistema();
    }

    /**
     * Inicializa transação dos cenários.
     */
    @Before
    public void setUp() {
        SistemaSeniorComTransacao.iniciarTransacao();
    }

    /**
     * Reverte transação dos cenários.
     */
    @After
    public void tearDown() {
        TCBaseGEPNucleo.reverterTransacao(NomeSistema.HCM, NomeUsuarios.HCM);
    }

    /**
     * Cenário destinado ao assunto XYZ.
     */
    @Test
    public void testScenario0001_ExemploTeste() {
        Facilitadores.selecionarEmpresa(2);

        SistemaSenior.abrirTela("NFR034FUN");
        SistemaSenior.preencherCampo("DENumCad1", "89890");
        SistemaSenior.teclar(Tecla.TAB);
        SistemaSenior.preencherCampo("DENomFun1", "898777");
        SistemaSenior.teclar(Tecla.TAB);
        SistemaSenior.preencherCampo("DEApeFun1", "Testa transação");
        SistemaSenior.teclar(Tecla.TAB);
        SistemaSenior.preencherCampo("DEDatAdm1", "08/08/2018");
        SistemaSenior.teclar(Tecla.TAB);
        SistemaSenior.preencherCampo("SEApuPon", "1");
        SistemaSenior.teclar(2, Tecla.TAB);
        SistemaSenior.clicar("BtnOk");//&Ok
        SistemaSenior.preencherCampo("SECodVin", "01");
        SistemaSenior.teclar(Tecla.TAB);
        SistemaSenior.clicar("btCustom_1");//OK
        SistemaSenior.preencherCampo("SECodVin", "02");
        SistemaSenior.teclar(Tecla.TAB);
        SistemaSenior.clicar("btCustom_1");//OK
        SistemaSenior.preencherCampo("SECodVin", "10");
        SistemaSenior.teclar(Tecla.TAB);
        SistemaSenior.clicar("BtnOk");//&Ok
        SistemaSenior.preencherCampo("SECodSin", "0001");
        SistemaSenior.teclar(2, Tecla.TAB);
        SistemaSenior.preencherCampo("SESocSin", "S");
        SistemaSenior.teclar(Tecla.TAB);
        SistemaSenior.clicar("BtnOk");//&Ok
        SistemaSenior.teclar(Tecla.TAB);
        SistemaSenior.preencherCampo("SESocSin", "S");
        SistemaSenior.clicar("BtnOk");//&Ok
        SistemaSenior.preencherCampo("DECateSo1", "102");
        SistemaSenior.teclar(Tecla.TAB);
        SistemaSenior.clicar("button1");//Este e um campo de mensagem que foi clicado em 'Sim' ou 'Nao'.
        SistemaSenior.preencherCampo("DECateSo1", "101");
        SistemaSenior.teclar(4, Tecla.TAB);
        SistemaSenior.clicar("btCustom_1");//OK
        SistemaSenior.preencherCampo("DECodCar1", "1");
        SistemaSenior.teclar(Tecla.TAB);
        SistemaSenior.preencherCampo("SECodMot", "001");
        SistemaSenior.teclar(2, Tecla.TAB);
        SistemaSenior.clicar("BtnOk");//&Ok
        SistemaSenior.teclar(Tecla.TAB);
        SistemaSenior.clicar("btCustom_1");//OK
        SistemaSenior.preencherCampo("DECodEsc1", "0002");
        SistemaSenior.teclar(Tecla.TAB);
        SistemaSenior.preencherCampo("SECodTma", "1");
        SistemaSenior.teclar(Tecla.TAB);
        SistemaSenior.clicar("BtnOk");//&Ok
        SistemaSenior.teclar(2, Tecla.TAB);
        SistemaSenior.preencherCampo("DETipCon1", "01");
        SistemaSenior.teclar(2, Tecla.TAB);
        SistemaSenior.clicar("btCustom_1");//OK
        SistemaSenior.preencherCampo("DECodFil1", "0001");
        SistemaSenior.teclar(Tecla.TAB);
        SistemaSenior.preencherCampo("SETipAdm", "1");
        SistemaSenior.clicar("BtnOk");//&Ok
        SistemaSenior.preencherCampo("SECodMot", "001");
        SistemaSenior.teclar(Tecla.TAB);
        SistemaSenior.preencherCampo("SETipSal", "1");
        SistemaSenior.teclar(4, Tecla.TAB);
        SistemaSenior.clicar("BtnOk");//&Ok
        SistemaSenior.preencherCampo("SEIndAdm", "1");
        SistemaSenior.teclar(Tecla.TAB);
        SistemaSenior.preencherCampo("SEAdmeSo", "2");
        SistemaSenior.teclar(Tecla.TAB);
		SistemaSenior.preencherCampo("SESegDes", "2");
        SistemaSenior.teclar(Tecla.TAB);
        SistemaSenior.preencherCampo("SETInAnt", "2");
        SistemaSenior.teclar(Tecla.TAB);
        SistemaSenior.preencherCampo("SECnpjAn", "075.616.539.30");
        SistemaSenior.teclar(2, Tecla.TAB);
        SistemaSenior.clicar("button1");//Este e um campo de mensagem que foi clicado em 'Sim' ou 'Nao'.
        SistemaSenior.preencherCampo("SEAdmAnt", "08/08/2018");
        SistemaSenior.teclar(2, Tecla.TAB);
        SistemaSenior.clicar("BtnOk");//&Ok
        SistemaSenior.teclar(Tecla.TAB);
        SistemaSenior.clicar("btCustom_1");//OK
        SistemaSenior.preencherCampo("DENumLoc1", "11");
        SistemaSenior.teclar(Tecla.TAB);
        SistemaSenior.clicar("btCustom_1");//OK
        SistemaSenior.preencherCampo("DENumLoc1", "1");
        SistemaSenior.teclar(Tecla.TAB);
        SistemaSenior.clicar("BtnOk");//&Ok
        SistemaSenior.teclar(Tecla.TAB);
        SistemaSenior.preencherCampo("DETipSex1", "M");
        SistemaSenior.teclar(2, Tecla.TAB);
        SistemaSenior.preencherCampo("DETipSex1", "M");
        SistemaSenior.preencherCampo("DEEstCiv1", "1");
        SistemaSenior.teclar(2, Tecla.TAB);
        SistemaSenior.clicar("btCustom_1");//OK
        SistemaSenior.preencherCampo("DEGraIns1", "10");
        SistemaSenior.teclar(Tecla.TAB);
        SistemaSenior.preencherCampo("DEEstCiv1", "9");
        SistemaSenior.teclar(4, Tecla.TAB);
        SistemaSenior.clicar("btCustom_1");//OK
        SistemaSenior.preencherCampo("DECodNac1", "001");
        SistemaSenior.teclar(2, Tecla.TAB);
        SistemaSenior.clicar("button2");//Este e um campo de mensagem que foi clicado em 'Sim' ou 'Nao'.
        SistemaSenior.preencherCampo("DECodNac1", "010");
        SistemaSenior.teclar(Tecla.TAB);
        SistemaSenior.teclar(12, Tecla.TAB);
        SistemaSenior.preencherCampo("DEModPag1", "C");
        SistemaSenior.teclar(9, Tecla.TAB);
        SistemaSenior.preencherCampo("DERecAdi1", "S");
        SistemaSenior.teclar(12, Tecla.TAB);
        SistemaSenior.clicar("button1");//Este e um campo de mensagem que foi clicado em 'Sim' ou 'Nao'.
        SistemaSenior.preencherCampo("DECatSef1", "02");
        SistemaSenior.teclar(Tecla.TAB);
        SistemaSenior.preencherCampo("DEDatInc1", "08/08/2018");
        SistemaSenior.teclar(Tecla.TAB);
        SistemaSenior.preencherCampo("DEHorInc1", "16:15");
        SistemaSenior.teclar(Tecla.TAB);
        SistemaSenior.preencherCampo("DECodCha1", "959595");
        SistemaSenior.clicar("BtnAlterar");//&Inserir
        SistemaSenior.teclar(Tecla.TAB);
        SistemaSenior.clicar("button1");//Este e um campo de mensagem que foi clicado em 'Sim' ou 'Nao'.
        SistemaSenior.clicar("button1");//Este e um campo de mensagem que foi clicado em 'Sim' ou 'Nao'.
        SistemaSenior.fecharTela("FR034FUN");
        
        AssertivaGEP.executaValidacao("select1", "R034FUN", "numemp=2, tipcol=1, numcad=89890, datadm=?", "tipadm=1, sitafa=1, codetb=0, apefun='Testa transação'", 1, SistemaSenior.parametroSql(TipoParametroSQL.DATE, "08/08/2018"));
		
    }

}
