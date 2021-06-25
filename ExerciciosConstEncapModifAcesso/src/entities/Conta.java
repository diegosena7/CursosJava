package entities;

public class Conta {
	
	private int numeroConta;
	private String titularConta;
	private double saldo;
	
	public Conta(int numeroConta, String titularConta) {
		this.numeroConta = numeroConta;
		this.titularConta = titularConta;
	}
	
	public Conta(int numeroConta, String titularConta, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.titularConta = titularConta;
		deposito(depositoInicial);//Deposito recebe o valor de parâmetro
	}
	
	//Método de depósito
	public void deposito(double valor) {
		saldo = saldo + valor;
	}
	
	//Médoto de saque
	public void saque(double valor) {
		saldo -= valor + 5.0;
	}

	//Getters and seters
	public int getNumeroConta() {
		return numeroConta;
	}

	public String getTitularConta() {
		return titularConta;
	}

	public void setTitularConta(String titularConta) {
		this.titularConta = titularConta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	//Retorna a String do objeto
	@Override
	public String toString() {
		return " Conta número: " + numeroConta
				+ " - Nome do titular: " + titularConta
				+ String.format(" - Saldo R$ %.2f: ", saldo);
	}
}
