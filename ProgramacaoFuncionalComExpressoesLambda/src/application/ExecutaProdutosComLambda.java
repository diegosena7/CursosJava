package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import entities.Product;

/*
 * Nesta classe estamos usando o Comparator para comparar os objetos do tipo Product
 * onde usamos uma classe MyComparator e usando o método sort.
 * Usamos também o método Comparator dentro da nossa classe como 2 forma de fazer
 * a comparação dos objetos, chamammos o método sort e passamos nossa variável comp 
 * como parâmetro.
 */
public class ExecutaProdutosComLambda {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		list.sort(new MyComparator());
		
		Comparator<Product> comp = new Comparator<Product>() {
			@Override
			public int compare(Product prod1, Product prod2) {
				return prod1.getNome().toUpperCase().compareTo(prod2.getNome().toUpperCase());
			}
		};
		list.sort(comp);
		
		for (Product product : list) {
			System.out.println("Produto: " + product);
		}
	}
}
