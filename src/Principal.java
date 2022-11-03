import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import entities.Cofrinho;
import entities.Dolar;
import entities.Euro;
import entities.Real;

public class Principal {

	public static void main(String args[]) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Cofrinho cofrinho = new Cofrinho();
		Dolar dolar = new Dolar(0);
		Euro euro = new Euro(0);
		Real real = new Real(0);
		cofrinho.adicionarMoedaLista(dolar);
		cofrinho.adicionarMoedaLista(euro);
		cofrinho.adicionarMoedaLista(real);

		try {

			while (true) {

				limpaTela();
				System.out.println("Pressione enter para continuar...");
				sc.nextLine();

				mostrarMenu();
				int opcao = sc.nextInt();

				if (opcao == 1 || opcao == 2) {
					escolhaMenu();
					int tipoMoeda = sc.nextInt();
					System.out.println();

					if (tipoMoeda == 1) {
						System.out.print("Digite a quantia em dólares: ");
						double valor = sc.nextDouble();
						if (opcao == 1) {
							cofrinho.adicionar(dolar, valor);
						} else {
							cofrinho.remover(dolar, valor);
							System.out.println("Pressione enter para continuar...");
							sc.nextLine();
						}
						sc.nextLine();
						limpaTela();
						dolar.info();
						System.out.println("Pressione enter para continuar...");
						sc.nextLine();

					} else if (tipoMoeda == 2) {
						System.out.print("Digite a quantia em euros: ");
						double valor = sc.nextDouble();
						if (opcao == 1) {
							cofrinho.adicionar(euro, valor);
						} else {
							cofrinho.remover(euro, valor);
							System.out.println("Pressione enter para continuar...");
							sc.nextLine();
						}
						sc.nextLine();
						limpaTela();
						euro.info();
						System.out.println("Pressione enter para continuar...");
						sc.nextLine();

					} else if (tipoMoeda == 3) {
						System.out.print("Digite a quantia em reais: ");
						double valor = sc.nextDouble();
						if (opcao == 1) {
							cofrinho.adicionar(real, valor);
						} else {
							cofrinho.remover(real, valor);
							System.out.println("Pressione enter para continuar...");
							sc.nextLine();
						}
						sc.nextLine();
						limpaTela();
						real.info();
						System.out.println("Pressione enter para continuar...");
						sc.nextLine();

					}
				}

				if (opcao == 3) {
					sc.nextLine();
					limpaTela();
					cofrinho.listagemMoedas();
					System.out.println("Pressione enter para continuar...");
					sc.nextLine();
				}

				if (opcao == 4) {
					sc.nextLine();
					limpaTela();
					System.out.printf("Total convertido em reais: R$ %.2f%n", cofrinho.totalConvertidoReais());
					System.out.println("Pressione enter para continuar...");
					sc.nextLine();
				}

				if (opcao == 5) {
					break;
				}

				System.out.println();
			}

			sc.close();
		} catch (InputMismatchException e) {
			System.out.println("Formato de número inválido");
		} catch (InterruptedException | IOException e) {
			e.printStackTrace();
		}
	}

	public static void mostrarMenu() {
		System.out.println("*** Cofrinho de moedas ***");
		System.out.println();
		System.out.println("O que deseja fazer?");
		System.out.println("1 - Adicionar moeda no cofrinho");
		System.out.println("2 - Remover moeda do cofrinho");
		System.out.println("3 - Listar moedas do cofrinho");
		System.out.println("4 - Calcular dinheiro do cofrinho (em Real)");
		System.out.println("5 - Sair");
		System.out.println();
		System.out.print("Digite a opção: ");
	}

	public static void escolhaMenu() {
		System.out.println("1 - Dólar");
		System.out.println("2 - Euro");
		System.out.println("3 - Real");
		System.out.println();
		System.out.print("Digite a opção: ");
	}

	public static void limpaTela() throws InterruptedException, IOException {
		if (System.getProperty("os.name").contains("Windows"))
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		else
			Runtime.getRuntime().exec("clear");
	}
}
