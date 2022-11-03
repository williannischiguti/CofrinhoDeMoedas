package entities;

public class Dolar extends Moeda {
	
	private final Double valorDolar = 5.22;
	
	public Dolar() {
		super();
	}

	public Dolar(double valor) {
		super(valor);
	}
	
	@Override
	public void info() {
		System.out.printf("Dólares: U$ %.2f%n", getValor());
	}

	@Override
	public double converter() {
		return getValor() * valorDolar;
	}
}
