package application;

public class Euro extends Moeda {

	public Euro(double valor){
		this.valor = valor;
	}
	
	
	
	@Override
	public void info() {
		System.out.println("Euro - " + valor);
		
	}

	@Override
	public double conveter() {
		return this.valor * 6.37;
		
	}
	
	@Override
	public boolean equals(Object object) {
		
		Euro realObject = (Euro) object;
		if(this.getClass() != object.getClass()) {
			return false;
		} else if (this.value != realObject.value) {
			return false;
		}
		
		return true;

	}
}
