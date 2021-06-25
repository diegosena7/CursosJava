package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;
	
	/*Construtor é a operação da classe que executamos no momento da instanciação do objeto.
	 * Podemos obrigar ou permitir que o objeto receba dados ou dependências no momento de sua instanciação.
	 * Se um construtor customizado não for especificado, a classe disponibiliza o construtor padrão, que não recebe parâmetros. 
	 */
	
	//Construtor e seus parâmetros
	public Product(String name, double price, int quantity) {
		this.name =  name;
		this.price = price;
		this.quantity = quantity;//Usamos o this para referenciar ao objeto da classe instanciado na linha 7
	}
	
	//Sobrecarga no construtor do método Product
	public Product(String name, double price) {
		this.name =  name;
		this.price = price;
		quantity = 0;//Não necessita da palavra this, pois já referencia o objeto por não ter o parâmetro recebido com a palavra quantity
	}
	
	public double totalValueInStock () {//Cálcula valor dos produtos
		return price * quantity;	
	}
	
	public void addProduct(int quantity) {//Adiciona produtos ao esroque
		this.quantity += quantity;
	}
	
	public void removeProduct(int quantity) {//Remove proutos em estoque
		this.quantity -= quantity;
	}
	
	//Método usado para excibir os valores do objeto em String
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
