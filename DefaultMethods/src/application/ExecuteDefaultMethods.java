package application;

import java.util.Locale;
import java.util.Scanner;

import services.BrazilInterestService;
import services.InterestService;
import services.USAInterestService;

/*
 * Default Methods
 * Tem como objetivo prover implementação padrão para métodos, de modo a evitar:
 * • 1) repetição de implementação em toda classe que implemente a interface
 * • 2) a necessidade de se criar classes abstratas para prover reuso da implementação.
 * Vantagens:
 * • Manter a retrocompatibilidade com sistemas existentes
 * • Permitir que "interfaces funcionais" (que devem conter apenas um método) possam
 * prover outras operações padrão reutilizáveis.
 */
public class ExecuteDefaultMethods {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Amount: ");
		double amount = sc.nextDouble();
		System.out.println("Months: ");
		int months = sc.nextInt();
		
		InterestService us = new USAInterestService(1.0);
		InterestService is = new BrazilInterestService(2.0);
		double paymentBrazil = is.payment(amount, months);
		double paymentUSA = us.payment(amount, months);
		
		System.out.println("Payment afte r" + months + " months: ");
		System.out.println(String.format("%.2f Braszil", paymentBrazil));
		System.out.println(String.format("%.2f USA", paymentUSA));
		
		sc.close();
	}
}
