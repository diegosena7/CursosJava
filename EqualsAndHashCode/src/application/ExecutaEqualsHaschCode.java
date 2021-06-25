package application;

import entities.Cliente;

/*
 * HashCode e Equals
• São operações da classe Object utilizadas para comparar se um objeto é igual a outro
• equals: lento, resposta 100%
• hashCode: rápido, porém resposta positiva não é 100%

 * Se o hashCode de dois objetos for diferente, então os dois objetos são
diferentes. Se o código de dois objetos for igual, muito provavelmente os objetos
são iguais (pode haver colisão).
 */
public class ExecutaEqualsHaschCode {

	public static void main(String[] args) {
		String a = "Maria";
		String b = "Alex";
		System.out.println("Equals: " + a.equals(b));
		System.out.println("HashCode: " + a.hashCode());
		System.out.println("HashCode: " + b.hashCode());
		
		Cliente cliente = new Cliente("Diego", "diego@gmail.com");
		Cliente clienteOne = new Cliente("Nayara", "nayara@gmail.com");
		
		System.out.println("HashCode cliente: " + cliente.hashCode());
		System.out.println("HashCode clienteOne: " + clienteOne.hashCode());
		System.out.println("Equals clientes: " + cliente.equals(clienteOne));
	}
}
