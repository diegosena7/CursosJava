package exercicios;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe um n�mero para verificar se � par ou �mpar: ");
		Integer numero = sc.nextInt();
		
		if (numero % 2 == 0 && numero != 0) {
			System.out.println("O n�mero � par!");
		}else if (numero == 0) {
			System.out.println("O n�mero � ZERO");
		} else {
			System.out.println("O n�mero � �mpar!");
		}
		sc.close();
	}
}
