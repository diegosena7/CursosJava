package application;

import java.util.Arrays;
import java.util.List;

/*
 * O supertipo de qualquer tipo de lista é List<?>. Este é um tipo curinga
 * Nesta classe estamos usando o tipo curinga para imprimir qualquer tipo de lista.
 * Porém não é possível adicionar dados a uma lista do tipo curinga.
 */
public class TiposCuringa {

	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
	    List<String> myStr = Arrays.asList("Diego", "Nayara", "Ryan", "Ted");
	    printList(myStr);
	}

	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}