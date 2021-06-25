package entities;

public class Product {
	
	private String name;
	private double price;
	
	//Construtor padrão
	public Product() {
	}
	
	//Construtor com parametros
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	//Métodos acessores
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
