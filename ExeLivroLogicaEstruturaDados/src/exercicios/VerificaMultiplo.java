package exercicios;

import java.util.Scanner;

/*
 * Nesta classe estamos verificando se um n�mero informado pelo usu�rio � multiplo de 3 ou 7
 * A l�gica se baseia em se o n�mero tiver o resto da divis�o entre o n�mero informado = a 0
 * � m�ltiplo do n�mero informado.
 */
public class VerificaMultiplo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		System.out.println("Informe o n�mero para verificar se � m�ltiplo ou n�o...");
		Integer multiplo = sc.nextInt();

		if (multiplo % 3 == 0) {
			System.out.println("� m�ltiplo de 3");
		}else if (multiplo % 7 == 0) {
			System.out.println("� m�ltiplo de 7");
		}else {
			System.out.println("N�o � m�ltiplo de 3 e nem de 7");
		}
		sc.close();
	}
}
