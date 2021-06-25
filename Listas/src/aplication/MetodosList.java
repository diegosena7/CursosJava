package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Uma lista deve ser homogênea, possuir o mesmo tipo de dados para todos
 * é ordenada e todoso os elementos da lsita são acessados por posições
 * inicia vazia e seus elementos são adicionados por demandas
 */
public class MetodosList {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();// Criando uma lista do tipo ArrayList

		// Adicionando itens no array
		list.add(1);
		list.add(7);
		list.add(99);
		list.add(7799);
		list.add(77);
		list.add(123);
		list.add(12);
		list.add(97);

		// Percorrendo a lista para exibir os itens com o forEach
		for (Integer lista : list) {
			System.out.println(lista);
		}

		// Imprimindo o tamanho da lista
		System.out.println("O tamanho da sua lista é de: " + list.size() + " elementos");
		System.out.println("----------------------------------------------");

		// Removendo item na lista pela posição 0 que era o número 1
		System.out.println("Remove o item 0 do array" + list.remove(0));

		// Removendo o item que seja = a 99
		list.removeIf(x -> x.intValue() == 99);

		// Inserindo elemento (447) na posição 2 da lista
		list.add(2, 447);

		// Localizando a posição de um elemento
		System.out.println("IndexOf = " + list.indexOf(77));

		//Filtrando valores
		List<Integer> resultado = list.stream().filter(x -> x.intValue() == 77).collect(Collectors.toList());
		for (Integer y : resultado) {
			System.out.println("Filtrando valores" + resultado);
		}
	}
}
