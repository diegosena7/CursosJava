package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.AccountAbstract;
import entities.BusinessAccount;
import entities.SavingsAccount;

/*
 * Nesta classe criamos uma lista do tipo AccountAbstract que é uma classe abstrata, nela estamos
 * inserindo os objetos do tipo SavingsAccount e BusinessAccount utilizando assim os conceitos
 * de polimorfimos e upcasting.
 */
public class ExercicioComClasseAbstrata {

	public static void main(String[] args) {
		//Classes abstratas
		Locale.setDefault(Locale.US);
		List<AccountAbstract> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
		list.add(new SavingsAccount(1003, "Bob", 300.0, 0.01));
		list.add(new BusinessAccount(1004, "Anna", 500.0, 500.0));
		
		double sum = 0.0;
		//Para cada conta da lista, soma incrementa com saldo das respectivas contas
		for(AccountAbstract acc : list) {
			sum += acc.getBalance();
		}
		
		System.out.printf("Total balance: %.2f%n", sum);
		
		//Para cada conta da lista, acessa o método de depósito e insere 10 em cada conta
		for(AccountAbstract acc : list) {
			acc.deposit(10.0);
		}
		
		System.out.println("----------------------------");
		
		//Para cada conta da lista, printa o número da conta e saldo
		for(AccountAbstract acc : list) {
			System.out.printf("Updated balance for account %d: %.2f%n ", acc.getNumber(), acc.getBalance());
		}
	}

}
