package exercicios;

import java.util.Scanner;

public class VerificaCPF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String CPF;

		System.out.printf("Informe um CPF: ");
		CPF = sc.next();

		System.out.printf("\nResultado: ");
		
		// usando os metodos isCPF() e imprimeCPF() da classe "ValidaCPF"
		if (ValidaCPF.isCPF(CPF) == true) {
			System.out.printf("%s\n", ValidaCPF.imprimeCPF(CPF));
		}
		else {
			System.out.printf("Erro, CPF invalido !!!\n");
		}
		sc.close();
	}
}
