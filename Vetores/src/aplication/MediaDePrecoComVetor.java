package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class MediaDePrecoComVetor {

	public static void main(String[] args) {
		/* Fazer um programa para ler um n�mero inteiro N e os dados (nome e pre�o) de N Produtos. Armazene os N produtos em um vetor. Em
			seguida, mostrar o pre�o m�dio dos produtos. */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();//Recebe a qtidade de elementos do vetor
		
		Product[] vect = new Product[n];//Criando vetor de produtos
		
		for(int i = 0; i < vect.length; i ++) {//Percorre o vetor e pede os dados a serem inseridos no vetor
			sc.nextLine();//Quebra de linha
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);//Instancia um produto que recebe name e price como par�metros
		}
		
		double soma = 0;
		for(int i = 0; i < vect.length; i++) {//Percorre o vetor e soma os valores inseridos
			soma += vect[i].getPrice();//Passando o pre�o como valor a ser somado do vetor
		}
		
		double media = soma / vect.length;//Calcula a m�dia dos pre�os
		
		System.out.printf("A m�dia �: %.2f%n", media);
		
		sc.close();
	}
}
