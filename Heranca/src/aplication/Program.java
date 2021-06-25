package aplication;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Account acc = new Account(2399, "Diego", 0.0);
		BusinessAccount bacc = new BusinessAccount(9099, "Nayara", 0.0, 100.0);
		
		//UPCASTING - Converte objeto da subclasse (filha) para a superclasse (Mãe).
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Ryan", 0.0, 100.0);
		Account acc3 = new SavingsAccount(1004, "Maria", 0.0, 200.0);
		
		//DOWNCASTING - Converte um objeto da superclasse (Mãe) para a subclasse (filha).
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(250.0);
		
		//BusinessAccount acc5 = (BusinessAccount)acc3;

		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("LOAN!!!");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("UPDATE!!!");
		}
	}
}
