package application;

import java.util.HashSet;
import java.util.Set;

import entities.Product;

/*
 * Nesta classe estamos usando o método contains para verificar se em nossa lista HashSet
 * possui um elemento com nome Notebook.
 */
public class UsandoHashSet {

	public static void main(String[] args) {

		Set<Product> set = new HashSet<>();
		
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		Product prod = new Product("Notebook", 1200.0);
		System.out.println(set.contains(prod));
	}
}
