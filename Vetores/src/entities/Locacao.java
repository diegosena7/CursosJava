package entities;

public class Locacao {
	
	private String name;
	private String email;
	private String telefone;
	
	//Construtor com 2 parâmetros
	public Locacao(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	//Construtor com 3 parâmetros
	public Locacao(String name, String email, String telefone) {
		this.name = name;
		this.email = email;
		this.telefone = telefone;
	}
	
	//Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	@Override
	public String toString() {
		return "Cliente: " + name + " - E-mail: " + email + " - Telefone " + telefone;
	}
}
