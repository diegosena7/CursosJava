package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Nesta classe estamos trabalhando com covarianca e contravariancia, onde copiamos uma lista de inteiros
 * para uma lista de objects e em seguida uma lista de doubles para uma lista de objects.
 * Feito um método copy com um foreach para percorrer e adicionar os objetos na lista de destino e em seguida
 * um foreach para percorrer os objetos da lista e imprimir no console.
 */
public class ExecutaCovarianciaContravariancia {

	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<Object>();
		
		copy(myInts, myObjs);
		System.out.println("Lista de inteiros: ");
		printList(myObjs);
		
		copy(myDoubles, myObjs);
		System.out.println("Lista de double: ");
		printList(myObjs);
	}

	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for (Number number : source) {
			destiny.add(number);
		}
	}

	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}
}