package application;

import java.util.ArrayList;
import java.util.List;

/*
 * Nesta classe estamos exemplificando 2 formas de somar valores...
 * Uma atrav�s da programa��o mperativa usando o foreach para percorrer a lista e somar os valores
 * Outra atrav�s das fun��es de primeira classe da programa��o funcional
 */
public class ExpressividadeOuConciso {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(7);
		list.add(12);
		list.add(5);
		list.add(10);
		
//		Integer sum = 0;
//		
//		for (Integer x : list) {
//			sum += x;
//		}
		
		Integer sum = list.stream().reduce(0, Integer::sum);
		
		System.out.println("A soma �: " + sum);
	}
}
