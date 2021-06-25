package exercicios;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class CalculoValorPoduto {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Informe o nome do produto: ");
		String nomeProd = sc.next();
		
		System.out.println("Informe o valor do produto: ");
		Double valorProd = sc.nextDouble();
		
		System.out.println("Informe a quantidade de produtos: ");
		Integer qtidadeProd = sc.nextInt();
		
		System.out.println("Informe a código do produto: ");
		Integer codigoProd = sc.nextInt();
		
		Produto prod = new Produto(nomeProd, valorProd, codigoProd, codigoProd);
		
		nomeProd = prod.getNome();
		valorProd = prod.getValor();
		qtidadeProd = prod.getQuantidade();
		codigoProd = prod.getCodigo();
		
		Double valorTotal = prod.valorCompra(valorProd, qtidadeProd);
		
		System.out.println("Produto = " + nomeProd + " - Valor unitário = " + valorProd + 
				" - Quantidade = " + qtidadeProd + " - Código do produto = " + codigoProd);
		System.out.println("Valor total = " + valorTotal);
		sc.close();
	}
}
