package services;

/*
 * Default Methods
 * Tem como objetivo prover implementa��o padr�o para m�todos, de modo a evitar:
 * � 1) repeti��o de implementa��o em toda classe que implemente a interface
 * � 2) a necessidade de se criar classes abstratas para prover reuso da implementa��o.
 * Vantagens:
 * � Manter a retrocompatibilidade com sistemas existentes
 * � Permitir que "interfaces funcionais" (que devem conter apenas um m�todo) possam
 * prover outras opera��es padr�o reutiliz�veis.
 */
public class USAInterestService implements InterestService{

	private double interestRate;//taxa de juros

	public USAInterestService(double interestRate) {
		this.interestRate = interestRate;
	}
	
	@Override
	public double getInterestRate() {
		return interestRate;
	}
}
