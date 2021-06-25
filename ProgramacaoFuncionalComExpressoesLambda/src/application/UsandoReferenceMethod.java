package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;

/*
 * Nesta classe estamos usando method reference, ao passarmos como par�metro para o m�todo removeIf
 * o m�todo staticProductPredicate criado na classe Product para remover os valores da lista cujo
 * pre�o seja >= 100.0
 * 
 * Usamos tamb�m o m�todo noStaticProductPredicate da classe Product, esse m�todo trabalha diretamente
 * com o atributo da classe Product, ao contr�rio do m�todo staticProductPredicate que recebe o objeto
 * do tipo Product como par�metro.
 * 
 * Usamos tamb�m a fun��o lambda diretamente e passamos como par�metro para o m�todo removeIf.
 * Usamos tamb�m a express�o lambda diretamente no m�todo removeIf
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