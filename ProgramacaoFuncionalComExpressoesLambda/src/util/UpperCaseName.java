package util;

import java.util.function.Function;

import entities.Product;

/*
 * Nesta classe estamos retornando o nome do produto em letras maiúsculas.
 * Usamos a classe Function, que recebe uma entidade e retorna uma String.
 * 
 * Obs: Esta é uma interface funcional e pode, portanto, ser usada como
 * destino de atribuição para uma expressão lambda ou referência de método.
 * Representa uma função que aceita um argumento e produz um resultado.
 */
public class UpperCaseName implements Function<Product, String>{

	@Override
	public String apply(Product prod) {
		return prod.getNome().toUpperCase();
	}
}
