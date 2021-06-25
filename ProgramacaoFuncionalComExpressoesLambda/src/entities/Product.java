package entities;

/*
 * Nesta classe criamos o método staticProductPredicate que recebe umm Product como parâmetro para 
 * retornar os produtos cujo preço seja >= 100.0
 * 
 * Criamos o método noStaticProductPredicate para retornar os produtos cujo preço seja >= 100.0, porém
 * esse método trabalha com o retorno a partir do atributo price.
 * 
 * Criamos os métodos staticPriceUpdate e noStaticPriceUpdate que atualizam o preço dos produtos em 10%
 * esses métoso são estáticos e não estáticos
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
