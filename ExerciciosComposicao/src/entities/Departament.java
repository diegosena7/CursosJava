package entities;

public class Departament {

	private String name;

	public Departament() {// Construtor vazio
	}

	public Departament(String name) {// Construtor com argumentos
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
