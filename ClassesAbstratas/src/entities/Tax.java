package entities;

public abstract class Tax {
	
	private String name;
	private Double anualIncome;
	
	//Construtor padr�o
	public Tax() {
		super();
	}

	//Construtor com argumentos
	public Tax(String name, Double anualIncome) {
		super();
		this.name = name;
		this.anualIncome = anualIncome;
	}

	//Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}
	
	//M�todo de c�lculo de impostos
	public abstract double tax();
}
