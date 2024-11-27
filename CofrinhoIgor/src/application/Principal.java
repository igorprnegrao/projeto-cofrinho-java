package application;

public class Principal {

	public static void main(String[] args) {
		// calsse menu estanciar 
		//Opcoes menu = new Opcoes()
		//menu.exibirOpcoes()
		
		Moeda moedaReal = new Real(50);
		moedaReal.info();
		System.out.println(moedaReal.conveter());
		Moeda moedaDolar = new Dolar(5);
		moedaDolar.info();
		System.out.println(moedaDolar.conveter());
	
	}

}
