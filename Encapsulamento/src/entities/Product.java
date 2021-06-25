package entities;

public class Product {

	private String name;
	private double price;
	private int quantity;
	
	//Construtor padr�o
	public Product() {
	}

	//Construtor e seus par�metros
	public Product(String name, double price, int quantity) {
		this.name =  name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//Sobrecarga do m�todo Product
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
	
	//M�todo respons�vel por calcular valor dos produtos
	public double totalValueInStock () {
		return price * quantity;	
	}
	
	//M�todo respons�vel por adicionar produtos ao estoque
	public void addProduct(int quantity) {
		this.quantity += quantity;
	}
	
	//M�todo respons�vel por remover proutos em estoque
	public void removeProduct(int quantity) {
		this.quantity -= quantity;
	}
	
	//M�todo respons�vel por criar uma String do objeto
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
