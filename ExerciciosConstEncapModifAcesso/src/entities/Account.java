package entities;

public class Account {
	
	private int number;
	private String holder;
	private double balance;
	
	//Construtor com 2 argumentos
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	//Construtor com 3 argumentos
	public Account(int number, String holder, double initialDeposit) {
		super();
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);//Recebe o valor do dep�sito, j� que o saldo inicia em 0
	}

	//Modificadores de Acessos 
	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	//M�todorespons�vel pelo dep�sito
	public void deposit(double amount) {
		balance += amount;
	}
	
	//M�todorespons�vel pelo saque
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	//M�todo respons�vel por criar uma string do objeto
	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
}
