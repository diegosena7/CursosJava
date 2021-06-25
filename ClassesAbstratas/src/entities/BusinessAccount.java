package entities;

//Classe com herança da classe Account
public class BusinessAccount extends AccountAbstract {

	private Double loanLimit;

	//Construtor padrão com o super da classe Account
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
	
	public void loan(Double amount) {//Fará o empréstimo se o valor de empréstimo for menor ou igual ao limite da conta
		if(amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}
	
	@Override
	public void withdraw(double amount) {//Inplementando a superclasse com a palavra SUPER
		super.withdraw(amount);
		balance -= 2.0;
	}
}
