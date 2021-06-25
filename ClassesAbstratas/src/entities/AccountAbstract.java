package entities;

/*
 * Nesta classe estamos trabalhando com abstract, essas classes n�o podem ser instanciadas
 * � uma forma de garantir heran�a total, somente subclasses n�o abastratas podem ser
 * instanciadas, mas nunca a superclasse abstrata.
 */
public abstract class AccountAbstract {

	private Integer number;
	private String holder;
	protected Double balance;
	
	//Construtor padr�o
	public AccountAbstract() {
	}

	//Construtor com parametros
	public AccountAbstract(Integer number, String holder, Double balance) {
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
	
	public void deposit(Double amount) {//Dep�sito
		this.balance += amount;
	}

	public void withdraw(double amount) {//Saque com taxa de 5.0
		this.balance -= amount + 5.0;
	}
	
	
}
