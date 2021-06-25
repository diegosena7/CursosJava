package aplication;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class ProgramTesteSobrescrita {

	public static void main(String[] args) {
		// Testando a sobrescrita do método withdraw(saque) com e sem a taxa da conta
		// Account

		Account acc = new Account(1001, "Diego Sena", 1000.0);
		acc.withdraw(200.0);
		System.out.println("Saldo atual Account: " + acc.getBalance());

		Account acc1 = new SavingsAccount(1002, "Nayara", 1000.0, 0.01);
		acc1.withdraw(200.0);
		System.out.println("Saldo atual SavingsAccount: " + acc1.getBalance());

		Account acc2 = new BusinessAccount(1003, "Ryan", 1000.0, 500.0);
		acc2.withdraw(200.0);
		System.out.println("Saldo atual BusinessAccount: " + acc2.getBalance());
	}

}
