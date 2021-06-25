package services;

/*
 * Default Methods
 * Tem como objetivo prover implementação padrão para métodos, de modo a evitar:
 * • 1) repetição de implementação em toda classe que implemente a interface
 * • 2) a necessidade de se criar classes abstratas para prover reuso da implementação.
 * Vantagens:
 * • Manter a retrocompatibilidade com sistemas existentes
 * • Permitir que "interfaces funcionais" (que devem conter apenas um método) possam
 * prover outras operações padrão reutilizáveis.
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
