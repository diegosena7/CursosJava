package exercicios;
import java.util.Scanner;

/*
 * Crie um programa que receba o valor de um produto e exiba o valor final da compra.
 * Esse valor final será o valor do produto mais o valor do frete - use o valor do frete como R$15,00.
 * Uma compra de, por exemplo, R$80,00, teria um valor final de R$95,00.
 * Agora, caso a compra seja maior ou igual a R$100,00, então não cobre o frete.
 */
public class DescontoComFrete {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o valor do produto: ");
		Double produto = sc.nextDouble();
		
		final Double frete = 15.0;
		
		Double valorCompra = produto + frete;
		if (valorCompra > 100.0) {
			valorCompra = valorCompra - frete;
		}
		System.out.println("O valor da compra é: " + valorCompra);
	}
}
