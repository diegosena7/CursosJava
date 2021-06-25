package application;

import entities.Account;
import entities.SavingsAccount;

/*
 * Nesta classe estamos utilizando o Polimorfismo, recurso que nos permite fazer com que
 * vari�veis de um mesmo tipo mais gen�rico possam apontar para objetos de tipos diferentes
 * tendo asim comportamentos diferentes conforme cada implementa��o.
 * 
 * Ao rodarmos nossa aplica��o, o resultado ser� de valores diferentes mesmo utilizando objetos
 * que s�o do tipo Account, cada um deles est� usando a implementa��o do m�todo withdraw de forma
 * diferente um do outro, isso � o polimorfismo.
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
