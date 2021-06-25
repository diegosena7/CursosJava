package entities;

/*
 * Esta classe est� herdando o m�todo withdraw da classe Account ao utilizarmos o extendts de Account
 * neste m�todo estamos utilizando a sobrescrita para implementar a regra de desconto no m�todo de 
 * saque (withdraw), usamos o super da classe principal para refenciar o m�todo withdraw da classe Account.
 * 
 * OBS: Usamos a palavra super nos construtores para acessar os atributos da super classe Account.
 * 
 * Essa classe � uma especializa��o da classe Account e utiliza o conceito de heran�a � um, sendo uma Account.
 */
public class BusinessAccount extends Account {

	private Double loanLimit;

	//Construtor padr�o com o super da classe Account
	public BusinessAccount() {
		super();
	}

	/*
	 * Neste construto estamos recebendo como par�metro os dados da Super Classe (Account)
	 * atrav�s dele estamos usando os atributos number, holder e balance para acessar
	 * os dados do cliente da conta.
	 */
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	//Getters and Setters
	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	//Far� o empr�stimo se o valor de empr�stimo for menor ou igual ao limite da conta
	public void loan(Double amount) {
		if(amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}
	
	//Inplementando a superclasse com a palavra SUPER
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}
}
