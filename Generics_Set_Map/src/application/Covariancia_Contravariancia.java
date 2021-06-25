package application;

import java.util.ArrayList;
import java.util.List;

/*
 * Nesta classe estamos utilizando a covariancia, quando podemos usar um supertipo recebendo
 * um valor de um subtipo, passamos o valor de Integer para Number (List<? extends Number> list = intList)
 * Não será possível adicionar valores a esta lista.
 * 
 * Trabalhamos também com contravariancia, quando podemos usar um tipo Number ou tipo Object,
 * transformamos uma lista do tipo Number em Object.
 * Neste caso não será possível acessar o objeto da lista através do get, mas podemos adicionar
 * objetos nesta lista.
 */
public class Covariancia_Contravariancia {

	public static void main(String[] args) {

		/* Trabalhando com Covariancia */
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(5);

		List<? extends Number> list = intList;

		Number x = list.get(0);

		// list.add(20); // erro de compilacao

		/* Trabalhando com Contravariancia */

		List<Object> myObjs = new ArrayList<Object>();
		myObjs.add("Maria");
		myObjs.add("Alex");

		List<? super Number> myNums = myObjs;

		myNums.add(10);
		myNums.add(3.14);

		// Number x = myNums.get(0); // erro de compilacao
	}
}
