package service;

import java.util.List;
import java.util.function.Predicate;

import entities.Product;

/*
 * Nesta classe estammos usando o método somaFiltrada que faz a soma dos produtos cujo nome começa com a letra T
 * Recebe a lista de Products como parâmetro e o Predicate informado na chamada do método na classe CalculaSomaProdutos.
 */
public class ProductService {
	
	public Double somaFiltrada(List<Product> list, Predicate<Product> criterio) {
		double soma = 0.0;
		for (Product product : list) {
			if (criterio.test(product)) {
				soma += product.getPrice();
			}
		}
		return soma;
	}
}
