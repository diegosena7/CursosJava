package exercicios;

import java.util.Scanner;

public class Salario {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		final Double bonus1 = 0.20;
		final Double bonus2 = 0.10;
		
		System.out.println("Informe o salário do colaborador: ");
		Double salario = sc.nextDouble();
		
		System.out.println("Informe o tempo de contrato do colaborador: ");
		Integer contrato = sc.nextInt();
		
		if (contrato >= 5) {
			Double bonus = 0.0;
			bonus = salario * bonus1;
			salario = salario + bonus;
			System.out.println("O salário do colaborador = " + salario);
		}else {
			Double bonus = 0.0;
			bonus = salario * bonus2;
			salario = salario + bonus;
			System.out.println("O salário do colaborador = " + salario);
		}
		sc.close();
	}
}
