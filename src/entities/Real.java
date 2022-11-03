package entities;

public class Real extends Moeda {
	
	public Real() {
		super();
	}

	public Real(double valor) {
		super(valor);
	}

	@Override
	public void info() {
		System.out.printf("Reais: R$ %.2f%n", getValor());
	}

	@Override
	public double converter() {
		return getValor();
	}

}
