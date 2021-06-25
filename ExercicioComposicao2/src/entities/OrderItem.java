package entities;

import java.util.Date;

public class OrderItem {

	private double quantity;
	private double price;

	private Product product;

	public OrderItem() {// Construtor padrão
	}

	public OrderItem(double quantity, double price) {// Construtor com argumentos
		this.quantity = quantity;
		this.price = price;
	}

	public OrderItem(int quantity2, double productPrice, Product product2) {
		// TODO Auto-generated constructor stub
	}

	// Métodos acessores
	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double subTotal() {
		return price * quantity;
	}

	@Override
	public String toString() {
		return product.getName() + ", $" + String.format("%.2f", price) + ", Quantity: " + quantity + ", Subtotal: $"
				+ String.format("%.2f", subTotal());

	}
}
