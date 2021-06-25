package entities;

public class Carro {

	String fabricante;
	String modelo;
	Integer ano;
	Double valor;
	final Double desconto = 0.10;
	
	public Double calculaDesconto(Double valorCarro) {
		Double valorDesconto = valorCarro * desconto;
		return valorCarro - valorDesconto;
	}
	
	public Carro(String fabricante, String modelo, Integer ano, Double valor) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.ano = ano;
		this.valor = valor;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Double getDesconto() {
		return desconto;
	}
}
