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
		return this.valor * 5.25;
	}
	
	@Override
	public boolean equals(Object object) {
		if(this.getClass() != object.getClass()) {
			return false;
		}
		
		Dolar realObject = (Dolar) object;
		
		
		if(this.value != realObject.value) {
			return false;
		}
		
		return true;

	}

}
