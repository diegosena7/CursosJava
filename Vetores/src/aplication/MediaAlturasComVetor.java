package aplication;

import java.util.Locale;
import java.util.Scanner;

public class MediaAlturasComVetor {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número inteiro N e a altura de N pessoas.
		 * Armazene as N alturas em um vetor. Em seguida, mostrar a altura média dessas
		 * pessoas.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double[] vect = new double[n];// Criando vetor

		for (int i = 0; i < vect.length; i++) {// For para percorrer o vetor e guardar os valores na variável vect
			vect[i] = sc.nextDouble();
		}

		double soma = 0.0;
		for (int i = 0; i < vect.length; i++) {// For para percorrer os valores inseridos e realizar a soma dos valores
			soma += vect[i];// Soma recebe soma + vect na posição i
		}

		double media = soma / n;// Calcula a média de alturas inseridas
		System.out.printf("A média é: %.2f.%n", media);

		sc.close();
	}
}
