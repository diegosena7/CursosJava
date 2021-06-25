package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;
import util.UpperCaseName;

/*
 * Usamos nesta classe a fun��o para deixar os produtos da nossa lista com nome em letras mai�sculas
 * o m�todo est� implementado na classe UpperCaseName, usamos a fun��o map para aplicar uma fun��o, no
 * caso atual a fun��o da classe UpperCaseName em cada elemento da lista e transformamos em seguida
 * os valores em lista com o Collectors.toList.
 * 
 * Usamos reference methot aos m�todos da classe product
 */
public class NameUpperCase {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		System.out.println("----------------Usando a instancia da classe UpperCaseName----------------");
		List<String> listaProdutos = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		listaProdutos.forEach(System.out::println);
		
		System.out.println("----------------Usando o m�todo staticUpperCasename da classe Product----------------");
		List<String> listaprod = list.stream().map(Product::staticUpperCasename).collect(Collectors.toList());
		listaprod.forEach(System.out::println);
		
		System.out.println("----------------Usando o m�todo noStaticUpperCasename da classe Product----------------");
		List<String> listaprod1 = list.stream().map(Product::noStaticUpperCasename).collect(Collectors.toList());
		listaprod1.forEach(System.out::println);
		
		System.out.println("----------------Usando express�o lambda declarada----------------");
		Function<Product, String> function = prod -> prod.getNome().toUpperCase();
		List<String> listaprod2 = list.stream().map(function).collect(Collectors.toList());
		listaprod2.forEach(System.out::println);
		
		System.out.println("----------------Usando express�o lambda inline----------------");
		List<String> listaprod3 = list.stream().map (prod -> prod.getNome().toUpperCase()).collect(Collectors.toList());
		listaprod3.forEach(System.out::println);
	}
}
