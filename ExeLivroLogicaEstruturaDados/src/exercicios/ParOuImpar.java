package exercicios;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe um número para verificar se é par ou ímpar: ");
		Integer numero = sc.nextInt();
		
		if (numero % 2 == 0 && numero != 0) {
			System.out.println("O número é par!");
		}else if (numero == 0) {
			System.out.println("O número é ZERO");
		} else {
			System.out.println("O número é ímpar!");
		}
		sc.close();
	}
}
