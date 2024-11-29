package application;

import java.util.ArrayList;


public class Cofrinho {
	
	private ArrayList<Moeda> listaMoedas;
	
	public Cofrinho() {
		this.listaMoedas = new ArrayList<>();
	}
	
	
	public void adcionar(Moeda moeda) {
		this.listaMoedas.add(moeda);
	}
	
	public void remover(Moeda moeda) {
		this.listaMoedas.remove(moeda);
	}
	
	public void listagemMoedas() {
		if (this.listaMoedas.isEmpty()) {
			System.out.println("COFRINHO SEM MOEDAS!");
			
		} else {
			for (Moeda moeda : listaMoedas) {
				moeda.info();
			}
		}
		
	}
	
	public double converter() {
		
		double valorAcumulado = 0;
		
		if (this.listaMoedas.isEmpty()) {
			System.out.println("COFRINHO SEM MOEDAS!");
		}
		
		
		for (Moeda moeda : this.listaMoedas) {
			valorAcumulado += moeda.conveter();
		}
		
		return valorAcumulado;
	}
	
}
