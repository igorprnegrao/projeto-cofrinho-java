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
	
	public void listagemMoedas() {
		for (Moeda moeda : listaMoedas) {
			moeda.info();
		}
	}
	
	
}
