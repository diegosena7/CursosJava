package application;

import java.util.HashMap;
import java.util.Map;

import entities.Produto;

/*
 * Nesta classe usamos o método containsKey para verificar se a chave ps contém em nosso map
 * através do eaquals e hashcode da classe Produto ele analisa o nome e valor do produto como
 * base de comparação, temos esse valor na variável produto1 e na produtoTeste, com isso retorna
 * true a verificação.
 */
public class UsandoMapNew {

	public static void main(String[] args) {
		Map<Produto, Double> estoque = new HashMap<>();
		
		Produto produto1 = new Produto("Tv", 900.0);
		Produto produto2 = new Produto("Notebook", 1200.0);
		Produto produto3 = new Produto("Tablet", 400.0);
		
		estoque.put(produto1, 10000.0);
		estoque.put(produto2, 20000.0);
		estoque.put(produto3, 15000.0);
		
		Produto produtoTeste = new Produto("Tv", 900.0);
		
		System.out.println("Contains 'ps' key: " + estoque.containsKey(produtoTeste));
	}
}
