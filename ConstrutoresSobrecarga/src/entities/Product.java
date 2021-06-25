package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;
	
	/*Construtor � a opera��o da classe que executamos no momento da instancia��o do objeto.
	 * Podemos obrigar ou permitir que o objeto receba dados ou depend�ncias no momento de sua instancia��o.
	 * Se um construtor customizado n�o for especificado, a classe disponibiliza o construtor padr�o, que n�o recebe par�metros. 
	 */
	
	//Construtor e seus par�metros
	public Product(String name, double price, int quantity) {
		this.name =  name;
		this.price = price;
		this.quantity = quantity;//Usamos o this para referenciar ao objeto da classe instanciado na linha 7
	}
	
	//Sobrecarga no construtor do m�todo Product
	public Product(String name, double price) {
		this.name =  name;
		this.price = price;
		quantity = 0;//N�o necessita da palavra this, pois j� referencia o objeto por n�o ter o par�metro recebido com a palavra quantity
	}
	
	public double totalValueInStock () {//C�lcula valor dos produtos
		return price * quantity;	
	}
	
	public void addProduct(int quantity) {//Adiciona produtos ao esroque
		this.quantity += quantity;
	}
	
	public void removeProduct(int quantity) {//Remove proutos em estoque
		this.quantity -= quantity;
	}
	
	//M�todo usado para excibir os valores do objeto em String
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
