package entities;

public abstract class Moeda extends Cofrinho {
	
	private double valor;

	public Moeda () {
		
	}

	public Moeda(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public abstract void info();
	
	public abstract double converter();	
}
