package entities;

public class Euro extends Moeda{
	
	private final Double valorEuro = 5.08;
	
	public Euro() {
		super();
	}

	public Euro(double valor) {
		super(valor);
	}

	@Override
	public void info() {
		System.out.printf("Euros: $ %.2f%n", getValor());	
	}

	@Override
	public double converter() {
		return getValor() * valorEuro;
	}
}
