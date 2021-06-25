package entities;

/*
 * Classe dos funcionários terceirizados, estamos trabalhando com herança da classe Employee
 * pois um funcionário terceirizado OutsourcedEmployee é um funcionário Employee
 */
public class OutsourcedEmployee extends Employee {

	private Double additionalCharge;

	// Construtor padrão
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

	//Método para cálculo de pagamento, utiliza o método payment da superclasse Employee
	@Override
	public Double payment() {
		// Recebe o pagamento da superclasse Employee mais o adicional de 110%
		return super.payment() + additionalCharge * 1.1;
	}

}
