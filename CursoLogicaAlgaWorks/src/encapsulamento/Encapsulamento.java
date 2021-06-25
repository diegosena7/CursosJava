package encapsulamento;

public class Encapsulamento {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		
		cliente.setNome("Diego");
		cliente.setNomeCompleto("Diego Sena");
		cliente.setTelefone("1198907070");
		
		System.out.println("Nome: " + cliente.getNomeCompleto());
		System.out.println("Telefone: " + cliente.getTelefone());
		System.out.println(cliente.nome);
	}
}
