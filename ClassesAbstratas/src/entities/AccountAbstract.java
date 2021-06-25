package entities;

/*
 * Nesta classe estamos trabalhando com abstract, essas classes não podem ser instanciadas
 * é uma forma de garantir herança total, somente subclasses não abastratas podem ser
 * instanciadas, mas nunca a superclasse abstrata.
 */
public abstract class AccountAbstract {

	private Integer number;
	private String holder;
	protected Double balance;
	
	//Construtor padrão
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
	
	public void deposit(Double amount) {//Depósito
		this.balance += amount;
	}

	public void withdraw(double amount) {//Saque com taxa de 5.0
		this.balance -= amount + 5.0;
	}
	
	
}
