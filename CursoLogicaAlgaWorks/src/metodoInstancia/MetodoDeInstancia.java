package metodoInstancia;

public class MetodoDeInstancia {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.nome = "Diego";
		cliente.sobrenome = "Sena";
		cliente.email = "diego.sena@magna.com";
		cliente.telefone = "11958587524";
		
		System.out.println("Nome = " + cliente.obterNomeCompleto());
		System.out.println("DDD = " + cliente.obterDDD());
	}
}
