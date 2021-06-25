package exercicios;

import java.util.Scanner;

import entities.Produto;

public class CalculaValorFinalCompra {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		
		System.out.println("Informe o valor da compra: ");
		Double valorFinalCompra = sc.nextDouble();
		
		System.out.println("Entre com a forma de pagamento [1 = á vista / 2 = parcelado 3x / 3 = parcelado 5x / 4 = parcelado 10x]: ");
		Integer formaDePagamento = sc.nextInt();
		
		Boolean pagtoAVista = formaDePagamento.equals(1);
		Boolean parcel3x = formaDePagamento.equals(2);
		Boolean parcel5x = formaDePagamento.equals(3);
//		Boolean parcel10x = formaDePagamento.equals(4);
		
		if (pagtoAVista) {
			Double valorFim = produto.calculaDescontoPagotAVista(valorFinalCompra);
			System.out.println("O valor total de sua compra com o desconto de 5% é: " + valorFim);
		}else if (parcel3x) {
			System.out.println("O valor total de sua compra é: " + valorFinalCompra);
		}else if (parcel5x) {
			Double valorFim = produto.calculaJurosParcel5x(valorFinalCompra);
			System.out.println("Sua compra com o acréscimo de juros de 2% é: " + valorFim);
		}else {
			Double valorFim = produto.calculaJurosParcel10x(valorFinalCompra);
			System.out.println("Sua compra com o acréscimo de juros de 8% é: " + valorFim);
		}
		sc.close();
	}
}
