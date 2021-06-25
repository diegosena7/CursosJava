package exercicios;

import java.util.Scanner;

/*
 * Nesta classe estamos verificando se um número informado pelo usuário é multiplo de 3 ou 7
 * A lógica se baseia em se o número tiver o resto da divisão entre o número informado = a 0
 * é múltiplo do número informado.
 */
public class VerificaMultiplo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		System.out.println("Informe o número para verificar se é múltiplo ou não...");
		Integer multiplo = sc.nextInt();

		if (multiplo % 3 == 0) {
			System.out.println("É múltiplo de 3");
		}else if (multiplo % 7 == 0) {
			System.out.println("É múltiplo de 7");
		}else {
			System.out.println("Não é múltiplo de 3 e nem de 7");
		}
		sc.close();
	}
}
