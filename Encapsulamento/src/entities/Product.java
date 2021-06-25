package entities;

public class Product {

	private String name;
	private double price;
	private int quantity;
	
	//Construtor padrão
	public Product() {
	}

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
	
	//Método responsável por calcular valor dos produtos
	public double totalValueInStock () {
		return price * quantity;	
	}
	
	//Método responsável por adicionar produtos ao estoque
	public void addProduct(int quantity) {
		this.quantity += quantity;
	}
	
	//Método responsável por remover proutos em estoque
	public void removeProduct(int quantity) {
		this.quantity -= quantity;
	}
	
	//Método responsável por criar uma String do objeto
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
