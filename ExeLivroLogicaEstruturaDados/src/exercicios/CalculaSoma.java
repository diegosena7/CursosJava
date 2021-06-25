package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class CalculaSoma {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);

		int soma = 0;
		int numeros = 4;
		
		for (int i = 1; i <= numeros; i++) {
			System.out.println("Digite o número a ser calculado a soma...");
			int numInformado = sc.nextInt();
			soma = soma + numInformado;
		}
		System.out.println("A soma é: " + soma);
		sc.close();
	}
}
