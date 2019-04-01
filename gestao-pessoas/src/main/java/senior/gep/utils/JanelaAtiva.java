package senior.gep.utils;

import com.senior.framework.testes.executor.CommandManager;

import br.com.senior.asas.testinterfaces.ITestApplication;
import br.com.senior.asas.testinterfaces.ITestComponent;
import br.com.senior.asas.testinterfaces.ITestContainer;
import br.com.senior.asas.testinterfaces.ITestWindow;

/**
 * Representa��o da janela ativa no momento em que � instanciado
 * 
 * @author Marlo.back
 * 
 */
public class JanelaAtiva {

	ITestContainer container;
	ITestApplication app;

	String nome;
	String titulo;
	String descricao;

	/**
	 * 
	 */
	public JanelaAtiva() {

		CommandManager commandManager = Facilitadores.getManipuladorDeComandos();
		container = commandManager.getActiveContainer();
		app = commandManager.getApplication();

		nome = container.getName();

		titulo = (container instanceof ITestWindow) ? ((ITestWindow) container)
				.getWindowTitle() : commandManager.getActiveSheet().getTitle();
		descricao = app.hasMessage() ? app.getMessage().getDescription() : "";
	}

	/**
	 * Nome da janela (formname)
	 * 
	 * @return nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * T�tulo da janela (caption)
	 * 
	 * @return t�tulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Descri��o/mensagem no corpo do di�logo (somente para derivados de messageBox)
	 * 
	 * @return descri��o
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * Retorna o componente do controle
	 * 
	 * @param nome1 nome1
	 * @return container.getChild(nome1);
	 */
	public ITestComponent getFilho(String nome1) {
		return container.getChild(nome1);
	}

	/**
	 * Retorna se � um di�logo de confirma��o de s�ida da tela
	 * 
	 * @return confirmacao
	 */
	public boolean isJanelaConfirmacaoSair() {
		boolean confirmacao = nome.equals("FrmMessage") && titulo.equals("Confirma��o");

		confirmacao = confirmacao && (descricao.startsWith("Deseja") || // "Deseja (realmente|abandonar) (fechar|sair)"
				descricao.startsWith("Abandonar") // "Abondonar altera��es...
				);

		return confirmacao;

	}

	@Override
    public String toString() {
		return String.format("Janela ativa: '%s' - '%s'\nDescri��o: '%s'", nome, titulo, descricao);
	}

}
