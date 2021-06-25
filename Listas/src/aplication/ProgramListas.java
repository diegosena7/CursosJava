package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramListas {

	public static void main(String[] args) {
		//Utilizando Listas, lembrando que listas s�o interfaces e n�o podem ser instanciadas sem uma classe que a implementa
		
		List<String> list = new ArrayList<>();
		list.add("Diego");
		list.add("Nayara");
		list.add("Ryan");
		list.add("Ted");
		list.add("Maria");
		
		list.add(2, "Joaquim_Carlos");//Adicionando item na lista na posi��o 2
		//list.remove(1);//Remove o item 1 da lista
		//list.remove("Ryan");//Remove a String que foi mencionada
		
		System.out.println("Sua lista tem o total de posi��es = " + list.size());
		
		for (String lista : list) {//forEach
			System.out.println(lista);
		}
		System.out.println("____________Removendo itens com a letra R (Ryan) usando um predicado____________________");
		
		//Removendo itens com a letra M usando um predicado
		list.removeIf(x -> x.charAt(0) == 'R');//Pegando um valor x e retornando SE for igual a 'R' para realizar a exclus�o

		System.out.println(list);
		
		System.out.println("____________Encontrando a posi��o de um elemento____________________");
		
		//Encontrando a posi��o de um elemento
		System.out.println("Index of Diego: " + list.indexOf("Diego"));
		
		System.out.println("______________Imprimindo lista com string que come�a com D_____________________");
		//Imprimindo lista com string que come�a com D
		List<String> resultado = list.stream().filter(x -> x.charAt(0) == 'D').collect(Collectors.toList());
		for (String lista : resultado) {//forEach
			System.out.println(lista);
		}
		
		System.out.println("___________Retornando o primeiro elemento com a string inicial D________________________");
		//Retornando o primeiro elemento com a string inicial D
		//A fun��o retornar� o elemento solicitado, caso n�o exista ela retorna nulo
		String name = list.stream().filter(x -> x.charAt(0) == 'D').findFirst().orElse(null);
		System.out.println(name);
	}
}
