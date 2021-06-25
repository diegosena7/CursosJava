package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import util.ProductPredicate;

/*
 * Nesta classe estamos usando uma interface funcional ProductPredicate e passando como parâmetro
 * para o método removeIf, com isso removemos da nossa lista os produtos cujo preço seja >= 100.0
 */
public class RemovendoItensLista {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		list.removeIf(new ProductPredicate());
		
		for (Product product : list) {
			System.out.println(product);
		}
	}
}
