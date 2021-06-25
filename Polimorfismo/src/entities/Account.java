package entities;

public class Account {

	private Integer number;
	private String holder;
	protected Double balance;
	
	//Construtor padr�o
	public Account() {
	}

	//Construtor com parametros
	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	//Getters and Setters
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
	
	//Dep�sito
	public void deposit(Double amount) {
		this.balance += amount;
	}

	//Saque com taxa de 5.0
	public void withdraw(double amount) {
		this.balance -= amount + 5.0;
	}
}
