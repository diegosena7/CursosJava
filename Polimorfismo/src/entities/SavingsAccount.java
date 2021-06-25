package entities;

/*
 * Nesta classe usamos o conceito de heran�a atrav�s do extends Account, usamos no construtor com argumentos
 * os atributos oriundos da classe Account, atrav�s da chamada do m�todo super.
 */
public class SavingsAccount extends Account{
	
	private Double interestRate;//Taxa de juros

	//Construtor padr�o, recebe o m�todo super oriundo da classe  Account
	public SavingsAccount() {
		super();
	}

	//Construtor com parametros, recebe o m�todo super e os atributos oriundos da classe  Account
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
	
	//M�todo para retornar o saldo com a atualiza��o de taxa de juros
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	//Usando a sobrescrita do m�todo saque da classe Account, sem taxa de 5.0
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}
}
