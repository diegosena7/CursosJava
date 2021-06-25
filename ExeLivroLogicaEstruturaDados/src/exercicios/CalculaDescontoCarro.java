package exercicios;

import java.util.Locale;
import java.util.Scanner;

import entities.Carro;

public class CalculaDescontoCarro {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Qual o fabricante do ve�culo: ");
		String fabricante = sc.next();
		
		System.out.println("Qual o modelo do ve�culo: ");
		String modelo = sc.next();
		
		System.out.println("Qual o ano do ve�culo: ");
		Integer ano = sc.nextInt();
		
		System.out.println("Qual o valor do ve�culo: ");
		Double valor = sc.nextDouble();
		
		Carro carro = new Carro(fabricante, modelo, ano, valor);
		fabricante = carro.getFabricante();
		modelo = carro.getModelo();
		ano = carro.getAno();
		valor = carro.getValor();
		
		Double valorComDesconto = carro.calculaDesconto(valor);
		
		System.out.println("O ve�culo " + modelo + " do fabricante " + fabricante + " fabricao em " + ano +
				" com valor de venda R$ = " + valor + " est� com desconto de 10% e est� sendo vendido por R$ = " + valorComDesconto);

		sc.close();
	}
}
