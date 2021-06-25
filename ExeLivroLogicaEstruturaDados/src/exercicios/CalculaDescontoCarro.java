package exercicios;

import java.util.Locale;
import java.util.Scanner;

import entities.Carro;

public class CalculaDescontoCarro {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Qual o fabricante do veículo: ");
		String fabricante = sc.next();
		
		System.out.println("Qual o modelo do veículo: ");
		String modelo = sc.next();
		
		System.out.println("Qual o ano do veículo: ");
		Integer ano = sc.nextInt();
		
		System.out.println("Qual o valor do veículo: ");
		Double valor = sc.nextDouble();
		
		Carro carro = new Carro(fabricante, modelo, ano, valor);
		fabricante = carro.getFabricante();
		modelo = carro.getModelo();
		ano = carro.getAno();
		valor = carro.getValor();
		
		Double valorComDesconto = carro.calculaDesconto(valor);
		
		System.out.println("O veículo " + modelo + " do fabricante " + fabricante + " fabricao em " + ano +
				" com valor de venda R$ = " + valor + " está com desconto de 10% e está sendo vendido por R$ = " + valorComDesconto);

		sc.close();
	}
}
