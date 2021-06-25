package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Locacao;

public class AlugaQuartosComVetor {

	public static void main(String[] args) {
		/*
		 * Fazer um programa que inicie com todos os dez quartos vazios, e depois leia
		 * uma quantidade N representando o número de estudantes que vão alugar quartos
		 * (N pode ser de 1 a 10). Em seguida, registre o aluguel dos N estudantes. Para
		 * cada registro de aluguel, informar o nome e email do estudante, bem como qual
		 * dos quartos ele escolheu (de 0 a 9). Suponha que seja escolhido um quarto
		 * vago. Ao final, seu programa deve imprimir um relatório de todas ocupações do
		 * pensionato, por ordem de quarto.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Locacao[] quartos = new Locacao[10];// Vetor de tipo referência (Classe Locacao)

		System.out.println("Quantos quartos deseja alugar?");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {// Percorre o vetor e seta os dados
			System.out.println();
			System.out.println("Quarto " + i + " :");// Informa a posição (número do quarto atual)
			System.out.println("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();

			System.out.println("E-mail: ");
			String email = sc.nextLine();
			
			System.out.println("Telefone: ");
			String telefone = sc.nextLine();

			System.out.println("Quarto: ");
			int quarto = sc.nextInt();

			quartos[quarto] = new Locacao(nome, email, telefone);// Instancia o vetor tipo referência
		}

		System.out.println();

		System.out.println("Quartos ocupados: ");
		for (int i = 0; i < 10; i++) {// Percorre o vetor e mostra os quartos ocupados dentre os 10
			if (quartos[i] != null) {
				System.out.println(i + " - " + quartos[i]);

				sc.close();
			}
		}
	}
}
