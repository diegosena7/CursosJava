package util;

import java.util.function.Function;

import entities.Product;

/*
 * Nesta classe estamos retornando o nome do produto em letras mai�sculas.
 * Usamos a classe Function, que recebe uma entidade e retorna uma String.
 * 
 * Obs: Esta � uma interface funcional e pode, portanto, ser usada como
 * destino de atribui��o para uma express�o lambda ou refer�ncia de m�todo.
 * Representa uma fun��o que aceita um argumento e produz um resultado.
 */
public class UpperCaseName implements Function<Product, String>{

	@Override
	public String apply(Product prod) {
		return prod.getNome().toUpperCase();
	}
}
