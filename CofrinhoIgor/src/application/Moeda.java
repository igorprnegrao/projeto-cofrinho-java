package application;

// classe abstrata Moeda

public abstract class Moeda {
	
	
	 protected double value;
	 
	 protected double valor; //classes filhas vão poder acessar
	 
	 public abstract void info();
	 
	 public abstract double conveter();
	
}
