package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Products;

public class ControleEstoqueProducts {

	public static void main(String[] args) {
		// Controle de estoque com impressão de produtos na tela
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Products products = new Products();
		
		System.out.println("Enter product data: ");
		
		//Lendo o nome do produto
		System.out.println("Name: ");
		products.name = sc.nextLine();
		
		//Lendo o preço do produto
		System.out.println("Price: ");
		products.price = sc.nextDouble();
		
		//Lendo a quantidade de estoque
		System.out.println("Quantity in stock: ");
		products.quantity = sc.nextInt();
		
		System.out.println();//Quebra de linha
		
		System.out.println("Product data: " + products);//Imprime os dados do protudo impliscitamente usando o toString
		
		System.out.println();//Quebra de linha
		
		//Adicionando produtos no estoque
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		products.addProducts(quantity);
		
		System.out.println();//Quebra de linha
		
		System.out.println("Updated data: " + products);//Imprime os dados do protudo impliscitamente usando o toString
		
		System.out.println();//Quebra de linha
		
		//Removendo proutos no estoque
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		products.removeProducts(quantity);
		
		System.out.println();//Quebra de linha
		
		System.out.println("Updated data: " + products);//Imprime os dados do protudo impliscitamente usando o toString
		
		sc.close();
	}
}
