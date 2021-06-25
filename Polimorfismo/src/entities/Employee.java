package entities;

public class Employee {
	
	String name;
	Integer hours;
	Double valuePerHour;
	
	//Construtor padrão
	public Employee() {
	}

	//Construtor com argumentos
	public Employee(String name, Integer hours, Double valuePerHour) {
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}

	//Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	
	//Método para cálculo de pagamento
	public Double payment() {
		return hours * valuePerHour;
	}
}
