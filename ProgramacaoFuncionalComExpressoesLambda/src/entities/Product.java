package entities;

/*
 * Nesta classe criamos o m�todo staticProductPredicate que recebe umm Product como par�metro para 
 * retornar os produtos cujo pre�o seja >= 100.0
 * 
 * Criamos o m�todo noStaticProductPredicate para retornar os produtos cujo pre�o seja >= 100.0, por�m
 * esse m�todo trabalha com o retorno a partir do atributo price.
 * 
 * Criamos os m�todos staticPriceUpdate e noStaticPriceUpdate que atualizam o pre�o dos produtos em 10%
 * esses m�toso s�o est�ticos e n�o est�ticos
 */
public class Product {
	private String name;
	private Double price;
	
	public Product() {
		super();
	}

	public Product(String nome, Double price) {
		super();
		this.name = nome;
		this.price = price;
	}

	public String getNome() {
		return name;
	}

	public void setNome(String nome) {
		this.name = nome;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public static String staticUpperCasename(Product prod) {
		return prod.getNome().toUpperCase();
	}
	
	public String noStaticUpperCasename() {
		return name.toUpperCase();
		
	}
	
	public static void staticPriceUpdate(Product prod) {
		prod.setPrice(prod.getPrice() * 1.1);
	}
	
	public void noStaticPriceUpdate() {
		setPrice(getPrice() * 1.1);
	}
	
	public static boolean staticProductPredicate(Product prod) {
		return prod.getPrice() >= 100.0;
	}
	
	public boolean noStaticProductPredicate() {
		return price >= 100.0;
	}

	@Override
	public String toString() {
		return name + " - R$ " + String.format("%.2f", price);
	}
}
