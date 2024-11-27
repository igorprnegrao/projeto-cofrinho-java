package application;

import java.util.Scanner;

public class Opcoes {
	
	private Scanner sc;
	
	public Opcoes() {
		sc = new Scanner(System.in);
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
			break;
		

		default:
			System.out.println("OPÇÃO INVÁLIDA!");
			break;
		}
		
		
	}
}
