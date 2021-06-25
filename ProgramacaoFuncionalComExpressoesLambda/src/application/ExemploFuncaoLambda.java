package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

/*
 * O que s�o "express�es lambda"?
 * Em programa��o funcional, express�o lambda corresponde a uma fun��o an�nima de primeira classe.
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
