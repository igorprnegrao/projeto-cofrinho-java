package application;

import java.util.Locale;

public class Principal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // usei o locale para evitar problemas com ponto flutuate
		//classe opcao estanciada
		Opcoes menu = new Opcoes();
		menu.exibirOpcoes();// chamar método para exibir o menu de navegação 
		
		
	
	}

}
