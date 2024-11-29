package application;

import java.util.Locale;
import java.util.Scanner;

public class Opcoes {
	// declares as classes scanner e cofrinho e estanciei as mesmas
	private Scanner sc;
	private Cofrinho cofrinho;
	
	
	public Opcoes() {
		
		Locale.setDefault(Locale.US);
		sc = new Scanner(System.in);
		cofrinho = new Cofrinho();
		
	}
	//método para exibir o menu de navegação
	public void exibirOpcoes() {
		// método switch e if/else para auxiliar no fluxo do menu de navegação
		System.out.println("==========================");
		System.out.println("     COFRINHO DO IGOR");
		System.out.println("==========================");
		System.out.println("1 - ADICIONAR MOEDA: ");
		System.out.println("2 - REMOVER MOEDA: ");
		System.out.println("3 - LISTAR MOEDAS: ");
		System.out.println("4 - CONVERTER PARA REAL: ");
		System.out.println("0 - ENCERRAR");
		
		System.out.println();
		System.out.println("==========================");
		System.out.print("SELECIONE A OPÇÃO: ");
		String selecionarOpcao = sc.next();
		
		switch (selecionarOpcao) {
		case "0":
			
			System.out.println("PROGRAMA ENCERRADO...");
			break;
			
		case "1":
			
			System.out.println("==========================");
			System.out.println();
			System.out.println("ESCOLHA A MOEDA: ");
			System.out.println("==========================");
			System.out.println("1 - REAL:");
			System.out.println("2 - DOLAR:");
			System.out.println("3 - EURO:");
			System.out.println("==========================");
			
			System.out.print("SELECIONE A OPÇÃO: ");
			int selecionarMoeda = sc.nextInt();
			System.out.println("==========================");
			
			System.out.print("DIGITE O VALOR: ");
			double valorMoeda = sc.nextDouble();
			
			if (selecionarMoeda == 1){
				
				Real moeda = new Real(valorMoeda); // objeto moeda específica estanciada passando
												//o argumento valorMoeda
				cofrinho.adcionar(moeda); // método add a moeda ao cofrinho
				msgValorAdd();
				
			} else if(selecionarMoeda == 2){
				
				Dolar moeda = new Dolar(valorMoeda);
				cofrinho.adcionar(moeda);
				msgValorAdd();
				
			} else if(selecionarMoeda == 3){
				
				Euro moeda = new Euro(valorMoeda);
				cofrinho.adcionar(moeda);
				msgValorAdd();
				
			} else {
				msgOpcaoInvalida();
			}
			
			exibirOpcoes(); // CHAMA O PRÓPRIO MÉTODO DE OPÇÕES
			break;
			
		case "2":
			
			System.out.println("==========================");
			System.out.println();
			System.out.println("QUAL MOEDA DESEJA REMOVER?");
			System.out.println();
			
			System.out.println("==========================");
			System.out.println();
			System.out.println("1 - Real");
			System.out.println("2 - Dolar");
			System.out.println("3 - Euro");
			System.out.println("==========================");
			
			System.out.print("SELECIONE A OPÇÃO: ");
			int selecionarMoedaRemover = sc.nextInt();
			
			System.out.println("==========================");
			System.out.print("DIGITE O VALOR: ");
			double valorMoedaRemove = sc.nextDouble();
			
			if (selecionarMoedaRemover == 1){
				
				Real moeda = new Real(valorMoedaRemove);
				cofrinho.remover(moeda);
				msgValorDel();
				
			} else if(selecionarMoedaRemover == 2){
					
				Dolar moeda = new Dolar(valorMoedaRemove);
				cofrinho.remover(moeda);
				msgValorDel();
					
			} else if(selecionarMoedaRemover == 3){
					
				Euro moeda = new Euro(valorMoedaRemove);
				cofrinho.remover(moeda);
				msgValorDel();
				
			} else {
				msgOpcaoInvalida();
			}
			exibirOpcoes();
			break;
			
		case "3":
			
			cofrinho.listagemMoedas();
			exibirOpcoes();
			break;
			
		case "4":
			
			double valorConvertido = cofrinho.converter();
			System.out.println("==========================");
			if (valorConvertido == 0) {
				System.out.println("IMPOSSÍVEL CONVERTER");
			} else {
				System.out.println("Total convertido para reais: " + valorConvertido);
			}
			
			exibirOpcoes();
			break;
		
		default:
			
			msgOpcaoInvalida();
			exibirOpcoes(); 
			break;
		}
		
		
	}
	
	// MÉTODOS AUXILIARES DE MENSAGENS 
	public void msgValorAdd() {
		System.out.println("VALOR ADICIONADO!");
	}
	
	public void msgValorDel() {
		System.out.println("VALOR REMOVIDO!");
	}
	
	public void msgOpcaoInvalida() {
		System.out.println("OPÇÃO INVÁLIDA!");
	}
	
	
}
