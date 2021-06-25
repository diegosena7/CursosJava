package entities;

import java.sql.Date;

public class Order {
	
	private Date date;
	private Product product;
	
	//Construtor
	public Order(Date date, Product product) {
		super();
		this.date = date;
		this.product = product;
		this.product.name = "PC";//Acessa o atributo name da classe Product, pois o mesmo não tem modificador de acesso
	}
	
	//Getters and Setters
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
}
