package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class MediaDePrecoComVetor {

	public static void main(String[] args) {
		/* Fazer um programa para ler um número inteiro N e os dados (nome e preço) de N Produtos. Armazene os N produtos em um vetor. Em
			seguida, mostrar o preço médio dos produtos. */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();//Recebe a qtidade de elementos do vetor
		
		Product[] vect = new Product[n];//Criando vetor de produtos
		
		for(int i = 0; i < vect.length; i ++) {//Percorre o vetor e pede os dados a serem inseridos no vetor
			sc.nextLine();//Quebra de linha
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);//Instancia um produto que recebe name e price como parâmetros
		}
		
		double soma = 0;
		for(int i = 0; i < vect.length; i++) {//Percorre o vetor e soma os valores inseridos
			soma += vect[i].getPrice();//Passando o preço como valor a ser somado do vetor
		}
		
		double media = soma / vect.length;//Calcula a média dos preços
		
		System.out.printf("A média é: %.2f%n", media);
		
		sc.close();
	}
}
