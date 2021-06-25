package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

/*
 * Nesta classe estamso trabalhando com Polimorfismo, as vari�veis x e y s�o do mesmo tipo
 *  apontam para objetos diferentes e tem comportaments diferentes.
 *  Trabalhamos com upcasting: que � o casting da subclasse para a superclasse e com o
 *  downcasting, que � o casting da superclasse para a subclasse
 */
public class ExemploPolimorfismo {

	public static void main(String[] args) {
		
		Account acc = new Account(1020, "Alex", 1000.0);//Objeto do tipo Account
		BusinessAccount bacc = new BusinessAccount(1023, "Mary", 1000.0, 0.01);;//Objeto do BusinessAccount
		
		//Exemplo de upcastings
		Account upcasting = bacc;
		Account upcasting1 = new BusinessAccount(1010, "Diego", 10.980, 5.000);
		Account upcasting2 = new SavingsAccount(1099, "Nayara", 7.590, 1.2);
		
		//Exemplos de downcasting, de superclasse para subclasse a convers�o � manual conforme abaixo
		BusinessAccount businessAcc = (BusinessAccount) upcasting;
		
		/*
		 * Testando para fazer o downcasting, se  o objeto do tipo SavingsAccount for uma intancia de
		 * BusinessAccount ele faz o casting, vai pular esse if, pois a condi��o � false
		 */
		if (upcasting2 instanceof BusinessAccount) {
			BusinessAccount downcasting = (BusinessAccount) upcasting2;
			downcasting.loan(2.500);
			System.out.println("---- EMPR�STIMO ----");
		}
		
		/*
		 * Testando para fazer o downcasting, se  o objeto do tipo SavingsAccount for uma intancia de
		 * SavingsAccount ele faz o casting, vai dar certo, pois a condi��o � true
		 */
		if (upcasting2 instanceof SavingsAccount) {
			SavingsAccount downcasting1 = (SavingsAccount) upcasting2;
			downcasting1.updateBalance();
			System.out.println("UPDATE");
		}
		
		//Instanciando contas e realizando transa��es
		Account conta1 = new Account(77, "Diego Sena", 1000.0);
		conta1.withdraw(200.0);
		System.out.println("Saldo com taxa conta comum: " + conta1.getBalance());
		
		Account conta2 = new SavingsAccount(771, "Nayara Andrade", 1000.0, 0.01);
		conta2.withdraw(200.0);//Utilizado a sobrescrita do m�todo withdraw da classe Account
		System.out.println("Saldo sem taxa savings account: " + conta2.getBalance());
		
		Account conta3 = new BusinessAccount(772, "Ryan", 1000.0, 500.0);
		conta3.withdraw(200);//Utilizado a sobrescrita do m�todo withdraw da classe Account
		System.out.println("Saldo com taxa business account: " + conta3.getBalance());
	}
}
