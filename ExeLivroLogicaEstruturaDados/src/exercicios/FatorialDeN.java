package exercicios;

import java.util.Scanner;

/*
 * Nesta classe estamos calculando o produto de todos os númeors inteiros positivos
 * que sejam menor que N, sendo N fornecido pelo usuário.
 * Fat foi inicializada em 1, pois não altera o valor do produto e a mesma é incrementada
 * com o valor dela mesma vezes o valor de i.
 */
public class FatorialDeN {

	public static void main(String[] args) {
		
		System.out.println("Informe o número para calcularmos o fatorial: ");
		Scanner sc = new Scanner(System.in);
		Integer n = sc.nextInt();
		
		Integer fat = 1;
		if (n >= 0) {
			for(int i = 1; i <= n; i ++) {
				fat *= i;
			}
			System.out.println("O fatorial de " + n + " é: " + fat);
		}else {
			System.out.println("Informe um número a partir de ZERO.");
		}
		sc.close();
	}
}