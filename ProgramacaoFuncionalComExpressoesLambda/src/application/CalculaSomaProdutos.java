package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import service.ProductService;

public class CalculaSomaProdutos {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		ProductService ps = new ProductService();
		Double soma = ps.somaFiltrada(list, prod -> prod.getNome().charAt(0) == 'T');
		
		System.out.println("Soma dos produtos com a letra T R$ = " + String.format("%.2f", soma));
		
		Double soma1 = ps.somaFiltrada(list, prod -> prod.getPrice() < 100.0);
		System.out.println("Soma dos produtos menor que 100.0 R$ = " + String.format("%.2f", soma1));
	}
}
