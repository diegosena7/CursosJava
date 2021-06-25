package service;

import java.util.List;
import java.util.function.Predicate;

import entities.Product;

/*
 * Nesta classe estammos usando o m�todo somaFiltrada que faz a soma dos produtos cujo nome come�a com a letra T
 * Recebe a lista de Products como par�metro e o Predicate informado na chamada do m�todo na classe CalculaSomaProdutos.
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
