package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

/*
 * O que são "expressões lambda"?
 * Em programação funcional, expressão lambda corresponde a uma função anônima de primeira classe.
 */
public class ExemploFuncaoLambda {

	public static int compareProducts(Product p1, Product p2) {
		return p1.getPrice().compareTo(p2.getPrice());
	}

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));

		list.sort(ExemploFuncaoLambda::compareProducts);
		list.sort((p1, p2) -> p1.getPrice().compareTo(p2.getPrice()));

		for (Product product : list) {
			System.out.println("Produto: " + product);
		}
	}
}
