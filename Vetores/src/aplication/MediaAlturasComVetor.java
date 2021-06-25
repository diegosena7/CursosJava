package aplication;

import java.util.Locale;
import java.util.Scanner;

public class MediaAlturasComVetor {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um n�mero inteiro N e a altura de N pessoas.
		 * Armazene as N alturas em um vetor. Em seguida, mostrar a altura m�dia dessas
		 * pessoas.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double[] vect = new double[n];// Criando vetor

		for (int i = 0; i < vect.length; i++) {// For para percorrer o vetor e guardar os valores na vari�vel vect
			vect[i] = sc.nextDouble();
		}

		double soma = 0.0;
		for (int i = 0; i < vect.length; i++) {// For para percorrer os valores inseridos e realizar a soma dos valores
			soma += vect[i];// Soma recebe soma + vect na posi��o i
		}

		double media = soma / n;// Calcula a m�dia de alturas inseridas
		System.out.printf("A m�dia �: %.2f.%n", media);

		sc.close();
	}
}
