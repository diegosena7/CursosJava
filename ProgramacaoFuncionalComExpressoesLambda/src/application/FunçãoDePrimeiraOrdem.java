package application;

import java.util.ArrayList;
import java.util.List;
import entities.Product;

/*
 * Nesta classe estamos trabalhando com fun��es que s�o s�o objetos de primeira ordem (ou primeira classe).
 * Isso significa que fun��es podem, por exemplo, serem passadas como par�metros de m�todos, bem como
 * retornadas como resultado de m�todos.
 * Usamos a fun��o compareProducts para fazer a compara��o dos objetos por pre�o e passamos essa mesma fun��o
 * como par�metro na chamada do m�todo sort.
 */
public class Fun��oDePrimeiraOrdem {
	
	public static int compareProducts(Product p1, Product p2) {
		return p1.getPrice().compareTo(p2.getPrice());
	}

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		list.sort(Fun��oDePrimeiraOrdem::compareProducts);
		list.forEach(System.out::println);
	}
}
