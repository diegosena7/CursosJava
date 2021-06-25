package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;

/*
 * Nesta classe estamos usando method reference, ao passarmos como parâmetro para o método removeIf
 * o método staticProductPredicate criado na classe Product para remover os valores da lista cujo
 * preço seja >= 100.0
 * 
 * Usamos também o método noStaticProductPredicate da classe Product, esse método trabalha diretamente
 * com o atributo da classe Product, ao contrário do método staticProductPredicate que recebe o objeto
 * do tipo Product como parâmetro.
 * 
 * Usamos também a função lambda diretamente e passamos como parâmetro para o método removeIf.
 * Usamos também a expressão lambda diretamente no método removeIf
 */
public class UsandoReferenceMethod {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		Predicate<Product> predicate = prod -> prod.getPrice() >= 100.0;
		
//		list.removeIf(prod -> prod.getPrice() >= 100.0);
//		list.removeIf(Product::staticProductPredicate);
//		list.removeIf(Product::noStaticProductPredicate);
		list.removeIf(predicate);

		for (Product product : list) {
			System.out.println(product);
		}
	}
}