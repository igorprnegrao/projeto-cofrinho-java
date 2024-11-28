package application;

import java.util.Locale;
import java.util.Scanner;

public class Opcoes {
	
	private Scanner sc;
	private Cofrinho cofrinho;
	
	
	public Opcoes() {
		Locale.setDefault(Locale.US);
		sc = new Scanner(System.in);
		cofrinho = new Cofrinho();
		
	}
	
	public void exibirOpcoes() {
		
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
				Real moeda = new Real(valorMoeda);
				cofrinho.adcionar(moeda);
				System.out.println("Adicionado !!!");
			} else if(selecionarMoeda == 2){
				Dolar moeda = new Dolar(valorMoeda);
				cofrinho.adcionar(moeda);
				System.out.println("Adicionado !!!");
			} else if(selecionarMoeda == 3){
				Euro moeda = new Euro(valorMoeda);
				cofrinho.adcionar(moeda);
				System.out.println("Adicionado !!!");
			} else {
				System.out.println("Não existe essa moeda");
			}
			
			exibirOpcoes();
			break;
		default:
			System.out.println("OPÇÃO INVÁLIDA!");
			exibirOpcoes();
			break;
		}
		
		
	}
}
