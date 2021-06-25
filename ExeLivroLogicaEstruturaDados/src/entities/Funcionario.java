package entities;

public class Funcionario {
	String nome;
	Double salario;
	final Double reajuste = 0.0875;
	
	public Double calculaReajuste(Double salarioFuncionario) {
		return salarioFuncionario + (salarioFuncionario * reajuste);
	}

	public Funcionario(String nome, Double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
}
