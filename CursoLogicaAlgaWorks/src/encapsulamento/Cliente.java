package encapsulamento;

public class Cliente {

	String nome;
	String sobrenome;
	String telefone;
	
	//Getters and Setters
	public String getNomeCompleto() {
		return nome + " " + sobrenome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setNomeCompleto(String nome) {//Usa o método split pra cortar a string e guarda no vetor os valores
		String [] nomeCompleto = nome.split(" ");
		nome = nomeCompleto[0];
		sobrenome = nomeCompleto[1];
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
