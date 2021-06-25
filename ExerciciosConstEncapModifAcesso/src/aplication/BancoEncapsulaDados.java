package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class BancoEncapsulaDados {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Conta contaCliente;// Instancia a classe Conta

		System.out.println("Entre com o n�mero da conta");
		int numConta = sc.nextInt();

		System.out.println("Entre com o nome do titular da conta");
		sc.nextLine();
		String nomeTitular = sc.nextLine();

		/*
		 * Se fizer dep�sito cria a conta e chama o construtor de 3 argumentos, se n�o
		 * cria a conta sem saldo e chama o construtor de 2 argumentos
		 */
		System.out.println("Possui dep�sito inical (s/n)? ");
		char resposta = sc.next().charAt(0);
		
		if (resposta == 's') {
			System.out.println("Informe o valor do dep�sito.");
			double depositoInicial = sc.nextDouble();
			contaCliente = new Conta(numConta, nomeTitular, depositoInicial);
		} else {
			contaCliente = new Conta(numConta, nomeTitular);
		}

		System.out.println();// pula linha

		System.out.println("Dados da conta..." + contaCliente);// Imprime os valores do primeiro dep�sito
		System.out.println();// pula linha

		// Faz outra opera��o de dep�sito
		System.out.println("Deseja realizar um novo dep�sito (s/n)?");
		resposta = sc.next().charAt(0);
		if (resposta == 's') {
			System.out.println("Digite o valor de dep�sito: ");
			double valorDeposito = sc.nextDouble();
			contaCliente.deposito(valorDeposito);
			System.out.println("Dados atualizado ap�s novo dep�sito " + contaCliente);
		} else {
			System.out.println("Dados da conta sem novo dep�sito." + contaCliente);
		}

		System.out.println();

		// Faz a opera��o de saque
		System.out.println("Deseja realizar um saque (s/n)?");
		resposta = sc.next().charAt(0);
		if (resposta == 's') {
			System.out.println("Digite o valor do saque: ");
			double valorSaque = sc.nextDouble();
			contaCliente.saque(valorSaque);
			System.out.println("Dados da conta atualizado ap�s saque." + contaCliente);
		}
		sc.close();
	}
}
