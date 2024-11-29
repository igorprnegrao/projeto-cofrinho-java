package application;


public class Real extends Moeda {
	
	

	public Real(double valor){
		this.valor = valor;
	}
	
	
	
	@Override
	public void info() {
		System.out.println("Real - " + valor);
		
	}

	@Override
	public double conveter() {
		return this.valor * 1;
		
	}
	
	
	
	@Override
	public boolean equals(Object object) {
		if(this.getClass() != object.getClass()) {
			return false;
		}
		
		Real realObject = (Real) object;
		
		
		if(this.value != realObject.value) {
			return false;
		}
		
		return true;

	}

	
}
