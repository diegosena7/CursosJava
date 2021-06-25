package metodoInstancia;

public class Cliente {

	String nome;
	String sobrenome;
	String telefone;
	String email;
	
	String obterNomeCompleto() {
		String nomeCompleto = nome + " " + sobrenome;
		return nomeCompleto;
	}
	
	String obterDDD() {
		String DDD = telefone.substring(0, 2);
		return DDD;
	}
}
