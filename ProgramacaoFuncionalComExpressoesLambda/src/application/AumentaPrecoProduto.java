package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;

/*
 * Nesta classe estamos usando a implemtnação da interface PriceUpdate como parâmetro para o forEach
 * onde estamos aumentando o preço de todos os produtos da lista em 10%.
 * 
 * Para o mesmo fim, usamos reference method ao método estático da classe Product
 * 
 * E também usamos para o mesmo fim o reference method ao método não estático da classe Product
 * 
 * Criamos um Consumer do tipo Product que recebe uma função lambda como parâmetro e passamos para 
 * o forEach que percorre a nossa lista.
 * 
 * Obs: Consumer é uma interface funcional e pode, portanto, ser usada como destino de atribuição para
 * uma expressão lambda ou referência de método.
 * Representa uma operação que aceita um único argumento de entrada e não retorna nenhum resultado.
 * Ao contrário da maioria das outras interfaces funcionais, Consumerespera-se que opere por meio de efeitos colaterais.
 */
public class AumentaPrecoProduto {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		Double percentualAumento = 1.1;
		
		Consumer<Product> consumer = prod -> prod.setPrice(prod.getPrice() * percentualAumento);

		list.forEach(consumer);
//		list.forEach(prod -> prod.setPrice(prod.getPrice() * percentualAumento));
//		list.forEach(Product::staticPriceUpdate);
//		list.forEach(Product::noStaticProductPredicate);
//		list.forEach(new PriceUpdate());
		
//		System.out.println(list);
		
		//Usando sysout lambda
		list.forEach(System.out::println);
	}
}
