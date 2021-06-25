package exercicios;

import java.util.Scanner;

/*
 * Nesta classe estamos calculando o produto de todos os n�meors inteiros positivos
 * que sejam menor que N, sendo N fornecido pelo usu�rio.
 * Fat foi inicializada em 1, pois n�o altera o valor do produto e a mesma � incrementada
 * com o valor dela mesma vezes o valor de i.
 */
public class FatorialDeN {

	public static void main(String[] args) {
		
		System.out.println("Informe o n�mero para calcularmos o fatorial: ");
		Scanner sc = new Scanner(System.in);
		Integer n = sc.nextInt();
		
		Integer fat = 1;
		if (n >= 0) {
			for(int i = 1; i <= n; i ++) {
				fat *= i;
			}
			System.out.println("O fatorial de " + n + " �: " + fat);
		}else {
			System.out.println("Informe um n�mero a partir de ZERO.");
		}
		sc.close();
	}
}