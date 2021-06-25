package application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ExecutaSetNew {

	public static void main(String[] args) {
		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
		
		//Faz a união da lista a com a lista b, retonando em uma lista c.
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println("União de dados: " + c);
		
		//Cria a lista d que recebe a lista a, faz a comparação dos itens na lista b e retorna na lista d.
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println("Retorna os elementos em comum: " + d);
		
		/*Cria uma lista e que recebe os elementos da lista a, compara com os elementos da lista b, remove
		 * os elementos que são comum entre as listas a+b e retorna os valores na lista e.
		 * */
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println("Diferença entre os elementos da lista: " + e);
	}
}