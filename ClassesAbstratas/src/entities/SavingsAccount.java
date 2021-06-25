package entities;

public class SavingsAccount extends AccountAbstract{
	
	private Double interestRate;

	//Construtor padr�o
	public SavingsAccount() {
		super();
	}

	//Construtor com parametros
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
	
	public void updateBalance() {//Fun��o para retornar o saldo com a atualiza��o de taxa de juros
		balance += balance * interestRate;
	}
	
	@Override
	public void withdraw(double amount) {//Usando a sobrescrita do m�todo saque, sem taxa de 5.0
		balance -= amount;
	}

}
