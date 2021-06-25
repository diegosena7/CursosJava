package entities;

public class Product {
	
	String name;
	private double price;
	private int quantity;
	
	//Construtor e seus parâmetros
	public Product(String name, double price, int quantity) {
		this.name =  name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//Sobrecarga do método Product
	public Product(String name, double price) {
		this.name =  name;
		this.price = price;
		this.quantity = 0;
	}
		
	//Getters and Stters
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
	
	public int getQuantity() {
		return quantity;
	}
	
	
	//Métodos
	public double totalValueInStock () {//Cálcula valor dos produtos
		return price * quantity;	
	}
	
	public void addProduct(int quantity) {//Adiciona produtos ao esroque
		this.quantity += quantity;
	}
	
	public void removeProduct(int quantity) {//Remove proutos em estoque
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
				+ ", $"
				+ String.format("%.2f", price) 
				+ ", "
				+ quantity
				+ " units, Total products: $ "
				+ String.format("%.2f", totalValueInStock());

}
	
}
