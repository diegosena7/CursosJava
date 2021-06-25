package application;

import java.util.Set;
import java.util.TreeSet;

import entities.Product;

/*
 * Nesta classe estamos usando o TreeSet para ordenar os elementos da lista por ordem alfabética. 
 * Para que possamos ordenar os objetos da nossa lista precisamos que nossa classe do conjunto,
 * no caso a classe Product, precisa implementar a classe Comparable.
 */
public class UsandoTreeSet {

	public static void main(String[] args) {

		Set<Product> set = new TreeSet<>();

		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));

		for (Product produto : set) {
			System.out.println(produto);
		}
	}
}