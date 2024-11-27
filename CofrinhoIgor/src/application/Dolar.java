package application;

public class Dolar extends Moeda {

	
	
	public Dolar(double valor){
		this.valor = valor;
	}
	
	
	
	@Override
	public void info() {
		System.out.println("Dolar - " + valor);
		
	}

	@Override
	public double conveter() {
		// TODO Auto-generated method stub
		return this.valor * 5.25;
	}

}
