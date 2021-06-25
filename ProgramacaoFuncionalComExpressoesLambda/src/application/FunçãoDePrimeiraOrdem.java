package application;

import java.util.ArrayList;
import java.util.List;
import entities.Product;

/*
 * Nesta classe estamos trabalhando com funções que são são objetos de primeira ordem (ou primeira classe).
 * Isso significa que funções podem, por exemplo, serem passadas como parâmetros de métodos, bem como
 * retornadas como resultado de métodos.
 * Usamos a função compareProducts para fazer a comparação dos objetos por preço e passamos essa mesma função
 * como parâmetro na chamada do método sort.
 */
public class FunçãoDePrimeiraOrdem {
	
	public static int compareProducts(Product p1, Product p2) {
		return p1.getPrice().compareTo(p2.getPrice());
	}

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		list.sort(FunçãoDePrimeiraOrdem::compareProducts);
		list.forEach(System.out::println);
	}
}
