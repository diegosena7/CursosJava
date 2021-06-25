package entities;

public class Pessoa {
	
	private Double peso;
	private Double altura;
	private String cargo;
	private Double salario;
	private String dataAdmissao;
	private Double percentualAumento;
	
	//Construtores
	public Pessoa() {
	}
	
	public Pessoa(String cargo, Double salario, String dataAdmissao) {
		super();
		this.cargo = cargo;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
	}

	public Pessoa(Double peso, Double altura) {
		this.peso = peso;
		this.altura = altura;
	}
	
	//Getters and Setters
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	
	public Double calculaImcMasc(Double altura, Double peso){
		Double imcCalc =  (peso * altura) - 58;
		return imcCalc;
	}
	
	public Double calculaImcFem(Double altura, Double peso){
		Double imcCalc =  (peso * altura) - 44.7;
		return imcCalc;
	}
	
	public Double calcularPLR(Double percentualAumento) {
		return salario += salario * percentualAumento / 100;
	}
}
