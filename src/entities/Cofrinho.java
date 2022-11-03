package entities;

import java.util.ArrayList;
import java.util.List;

public class Cofrinho {

	private List<Moeda> listaMoedas = new ArrayList<Moeda>();

	public Cofrinho() {

	}

	public Cofrinho(List<Moeda> listaMoedas) {
		this.listaMoedas = listaMoedas;
	}

	public List<Moeda> getListaMoedas() {
		return listaMoedas;
	}

	public void setListaMoedas(List<Moeda> listaMoedas) {
		this.listaMoedas = listaMoedas;
	}

	public void adicionarMoedaLista(Moeda moeda) {
		listaMoedas.add(moeda);
	}
	
	public void adicionar(Moeda moeda, double valor) {
		listaMoedas.get(listaMoedas.indexOf(moeda)).setValor(listaMoedas.get(listaMoedas.indexOf(moeda)).getValor() + valor);
	}
	
	public void remover(Moeda moeda, double valor) {
		if (valor <= listaMoedas.get(listaMoedas.indexOf(moeda)).getValor())
		listaMoedas.get(listaMoedas.indexOf(moeda)).setValor(listaMoedas.get(listaMoedas.indexOf(moeda)).getValor() - valor);
		else {
			System.out.println("Quantia insuficiente para remover");
		}
	}

	public void listagemMoedas() {
		
		if (listaMoedas.size() == 0) {
			System.out.println("Ainda não há moedas inseridas");
		} else {
			for (int i = 0; i < listaMoedas.size(); i++) {
				System.out.printf("Indice: %d ", i + 1);
				listaMoedas.get(i).info();
				System.out.println();
			}
		}
	}
	
	public double totalConvertidoReais() {
		double total = 0;
		for (int i = 0; i < listaMoedas.size(); i++) {
			total += listaMoedas.get(i).converter();
		}
		return total;
	}
}
