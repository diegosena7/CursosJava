package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class EstoqueProdutosEncapsulamento {

	public static void main(String[] args) {
		// Controle de estoque com impressão de produtos na tela
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		String name = sc.nextLine();
		
		System.out.println("Price: ");
		double price = sc.nextDouble();
		
		Product product = new Product(name, price);
		
		product.setName("Notebook");
		System.out.println("Updated name product: " + product.getName());
		
		product.setPrice(2000.00);
		System.out.println("Updated price product: " + product.getPrice());
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProduct(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProduct(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		sc.close();
	}
}
