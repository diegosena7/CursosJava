package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import entities.Product;

/*
 * Nesta classe estamos usando o Comparator para comparar os objetos do tipo Product
 * onde usamos uma classe MyComparator e usando o método sort.
 * Usamos também o método Comparator dentro da nossa classe como 2 forma de fazer
 * a comparação dos objetos, chamammos o método sort e passamos nossa variável comp 
 * como parâmetro.
 * Usamos uma função lambda para comparar os valores dos objetos na chamada da classe
 * Comparator. Essa função lambda recebe o prod1 e prod2 como argumentos e retorna a 
 * comparação dos objetos prod1 e prod2.
 * Podemos usar também a expressão lambda diretamente no método sort, conforme exemplo.
 * 
 * Resumo:
• Comparator objeto de classe separada
• Comparator objeto de classe anônima
• Comparator objeto de expressão lambda com chaves
• Comparator objeto de expressão lambda sem chaves
• Comparator expressão lambda "direto no argumento"
 */
public class ExecutaProdutos {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
//		list.sort(new MyComparator());
		
//		Comparator<Product> comp = (prod1, prod2) -> prod1.getNome().toUpperCase().compareTo(prod2.getNome());
		
//		list.sort(comp);
		list.sort((prod1, prod2) -> prod1.getNome().toUpperCase().compareTo(prod2.getNome()));

		
		for (Product product : list) {
			System.out.println("Produto: " + product);
		}
	}
}
