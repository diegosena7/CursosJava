package entities;

/*
 * Essa classe é uma generalização, através dela podemos criar classes específicas, como a classe BusinessAccount
 */
public class Account {

	private Integer number;
	private String holder;
	protected Double balance;
	
	//Construtor padrão
	public Account() {
	}

	//Construtor com parametros
	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}
	
	//Depósito
	public void deposit(Double amount) {
		this.balance += amount;
	}

	//Saque com taxa de 5.0
	public void withdraw(double amount) {
		this.balance -= amount + 5.0;
	}
}
