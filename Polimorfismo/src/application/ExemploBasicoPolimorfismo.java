package application;

import entities.Account;
import entities.SavingsAccount;

/*
 * Nesta classe estamos utilizando o Polimorfismo, recurso que nos permite fazer com que
 * variáveis de um mesmo tipo mais genérico possam apontar para objetos de tipos diferentes
 * tendo asim comportamentos diferentes conforme cada implementação.
 * 
 * Ao rodarmos nossa aplicação, o resultado será de valores diferentes mesmo utilizando objetos
 * que são do tipo Account, cada um deles está usando a implementação do método withdraw de forma
 * diferente um do outro, isso é o polimorfismo.
 */
public class ExemploBasicoPolimorfismo {

	public static void main(String[] args) {

		Account contaComum = new Account(1020, "Diego", 1000.0);
		Account contaPoupanca = new SavingsAccount(1021, "Nayara", 1000.0, 0.01);

		contaComum.withdraw(50.0);
		contaPoupanca.withdraw(50.0);

		System.out.println("Saldo da conta comum: " + contaComum.getBalance());//Taxa de 5
		System.out.println("Saldo da conta comum: " + contaPoupanca.getBalance());//Sem taxa

	}
}
