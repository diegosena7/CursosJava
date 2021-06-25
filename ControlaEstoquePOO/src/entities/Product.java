package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;
	
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
