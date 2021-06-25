package entities;

/*
 * Esta classe está herdando o método withdraw da classe Account ao utilizarmos o extendts de Account
 * neste método estamos utilizando a sobrescrita para implementar a regra de desconto no método de 
 * saque (withdraw), usamos o super da classe principal para refenciar o método withdraw da classe Account.
 * 
 * OBS: Usamos a palavra super nos construtores para acessar os atributos da super classe Account.
 * 
 * Essa classe é uma especialização da classe Account e utiliza o conceito de herança é um, sendo uma Account.
 */
public class BusinessAccount extends Account {

	private Double loanLimit;

	//Construtor padrão com o super da classe Account
	public BusinessAccount() {
		super();
	}

	/*
	 * Neste construto estamos recebendo como parâmetro os dados da Super Classe (Account)
	 * através dele estamos usando os atributos number, holder e balance para acessar
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
	
	//Fará o empréstimo se o valor de empréstimo for menor ou igual ao limite da conta
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
