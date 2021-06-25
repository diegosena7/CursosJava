package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;

/*
 * Nesta classe estamos usando a implemtna��o da interface PriceUpdate como par�metro para o forEach
 * onde estamos aumentando o pre�o de todos os produtos da lista em 10%.
 * 
 * Para o mesmo fim, usamos reference method ao m�todo est�tico da classe Product
 * 
 * E tamb�m usamos para o mesmo fim o reference method ao m�todo n�o est�tico da classe Product
 * 
 * Criamos um Consumer do tipo Product que recebe uma fun��o lambda como par�metro e passamos para 
 * o forEach que percorre a nossa lista.
 * 
 * Obs: Consumer � uma interface funcional e pode, portanto, ser usada como destino de atribui��o para
 * uma express�o lambda ou refer�ncia de m�todo.
 * Representa uma opera��o que aceita um �nico argumento de entrada e n�o retorna nenhum resultado.
 * Ao contr�rio da maioria das outras interfaces funcionais, Consumerespera-se que opere por meio de efeitos colaterais.
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
