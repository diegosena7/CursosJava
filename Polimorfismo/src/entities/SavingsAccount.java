package entities;

/*
 * Nesta classe usamos o conceito de herança através do extends Account, usamos no construtor com argumentos
 * os atributos oriundos da classe Account, através da chamada do método super.
 */
public class SavingsAccount extends Account{
	
	private Double interestRate;//Taxa de juros

	//Construtor padrão, recebe o método super oriundo da classe  Account
	public SavingsAccount() {
		super();
	}

	//Construtor com parametros, recebe o método super e os atributos oriundos da classe  Account
	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	//Método para retornar o saldo com a atualização de taxa de juros
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	//Usando a sobrescrita do método saque da classe Account, sem taxa de 5.0
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}
}
