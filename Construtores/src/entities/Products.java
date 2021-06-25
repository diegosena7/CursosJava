package entities;

public class Products {

	// Atributos
	public String name;
	public double price;
	public int quantity;
	
	//Construtor sem argumentos
	public Products() {
	}

	// Construtor e seus parâmetros
	public Products(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	// Sobrecarga do método Product
	public Products(String name, double price) {
		this.name = name;
		this.price = price;
		this.quantity = 0;
	}

	// Cálcula valor dos produtos
	public double totalValueInStock() {
		return price * quantity;
	}

	// Adiciona produtos ao esroque
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	// Remove proutos em estoque
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	// Representação textual do objeto Produto, converte o objeto para String
	public String toString() {
		return name + ", $" + String.format("%.2f", price) + ", " + quantity + " units, Total products: $ "
		+ String.format("%.2f", totalValueInStock());
	}
}
