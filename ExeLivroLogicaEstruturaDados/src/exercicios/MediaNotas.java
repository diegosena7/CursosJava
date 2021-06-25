package exercicios;

import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a nota da prova 1: ");
		Double nota1 = sc.nextDouble();
		
		System.out.println("Digite a nota da prova 2: ");
		Double nota2 = sc.nextDouble();
		
		System.out.println("Digite a nota da prova 3: ");
		Double nota3 = sc.nextDouble();
		
		System.out.println("Digite a nota do exame final: ");
		Double exame = sc.nextDouble();
		
		Double media = (nota1 + nota2 + nota3) / 3;
		Double notaFinal = (exame + media) / 2;
		
		if (media >= 7.0 && notaFinal > 5.0) {
			System.out.println("Sua nota de média é: " + media + " e sua nota do exame final foi de: " + notaFinal + 
					" e você foi APROVADO.");
		}else {
			System.out.println("Sua nota de média é: " + media + " e sua nota do exame final foi de: " + notaFinal + 
					" e você foi REPROVADO.");
		}
		sc.close();
	}
}
