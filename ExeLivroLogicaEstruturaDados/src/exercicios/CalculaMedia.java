package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class CalculaMedia {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Informe a quantidade de números que deseja calcular a média: ");
		int numerosMedia = sc.nextInt();
		int soma = 0;
		
		for (int i = 1; i <= numerosMedia; i++) {
			System.out.println("Informe o número a ser calculado a média: ");
			int numInformado = sc.nextInt();
			soma = soma + numInformado;
		}
		System.out.println("A média é: " + soma / numerosMedia);
		sc.close();
	}
}
