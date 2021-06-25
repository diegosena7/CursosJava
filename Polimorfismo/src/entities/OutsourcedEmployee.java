package entities;

/*
 * Classe dos funcion�rios terceirizados, estamos trabalhando com heran�a da classe Employee
 * pois um funcion�rio terceirizado OutsourcedEmployee � um funcion�rio Employee
 */
public class OutsourcedEmployee extends Employee {

	private Double additionalCharge;

	// Construtor padr�o
	public OutsourcedEmployee() {
		super();
	}

	// Construtor com argumentos, reutilizando os atributos da superclasse Employee
	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	// Getters and Setters
	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	//M�todo para c�lculo de pagamento, utiliza o m�todo payment da superclasse Employee
	@Override
	public Double payment() {
		// Recebe o pagamento da superclasse Employee mais o adicional de 110%
		return super.payment() + additionalCharge * 1.1;
	}

}
