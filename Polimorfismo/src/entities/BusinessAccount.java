package entities;

//Classe com heran�a da classe Account
public class BusinessAccount extends Account {

	private Double loanLimit;

	//Construtor padr�o com o super da classe Account
	public BusinessAccount() {
		super();
	}

	//Construtor com parametros da classe Business e da super classe Account
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(Double amount) {//Far� o empr�stimo se o valor de empr�stimo for menor ou igual ao limite da conta
		if(amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}
	
	/*
	 * Sobrescrevendo o m�todo withdraw da classe Account chamando a implementa��o da classe Account atrav�s da palavra SUPER
	 * o m�todo vai descontar 2.0 de cada saque realizado da conta.
	 */
	
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}
}
