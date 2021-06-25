package entities;

public class Funcionario {
	
	private String nome;
	private int id;
	private double salario;
	
	//Construtor padr�o
	public Funcionario() {
	}
	
	//COnstrutor com argumentos
	public Funcionario(Integer id, String name, Double salary) {
		this.id = id;
		this.nome = name;
		this.salario = salary;
	}

	//Getters and seters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return nome;
	}

	public void setName(String name) {
		this.nome = name;
	}

	public Double getSalary() {
		return salario;
	}

	public void setSalary(Double salary) {
		this.salario = salary;
	}
	
	//M�todo que aumenta o sal�rio
	public void increaseSalary(double percentage) {
		salario += salario * percentage / 100.0;
	}
	
	//M�todo para transformar o objeto em string
	@Override
	public String toString() {
		return id + ", " + nome + ", " + String.format("%.2f", salario);
	}
}
