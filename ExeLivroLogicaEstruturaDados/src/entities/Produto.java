package entities;

public class Produto {
	String produto;
	Double valor;
	Integer quantidade;
	Integer codigo;
	Double descontoPagtoAVista = 0.05;
	Double jurosParcel5x = 0.02;
	Double jurosParcel10x = 0.08;

	public Produto(String nome, Double valor, Integer quantidade, Integer codigo) {
		super();
		this.produto = nome;
		this.valor = valor;
		this.quantidade = quantidade;
		this.codigo = codigo;
	}
	
	public Produto() {
		
	}
	
	public Double valorCompra(Double valorProd, Integer qtidade) {
		return qtidade * valorProd;
	}
	
	public Double calculaDescontoPagotAVista(Double valorFinalCompra) {
		Double valorFinal = valorFinalCompra + valorFinalCompra - descontoPagtoAVista;
		return valorFinal;
	}
	
	public Double calculaJurosParcel5x(Double valorFinalCompra) {
		Double valorFinal = valorFinalCompra + valorFinalCompra * jurosParcel5x;
		return valorFinal;
	}
	
	public Double calculaJurosParcel10x(Double valorFinalCompra) {
		Double valorFinal = valorFinalCompra + valorFinalCompra * jurosParcel10x;
		return valorFinal;
	}

	public String getNome() {
		return produto;
	}

	public void setNome(String nome) {
		this.produto = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	@Override
	public String toString() {
		return "Produto [Produto= " + produto + " - Valor do Produto = " + valor + 
				" - Quantidade = " + quantidade + " - Código do produto =" + codigo + "]";
	}
}
