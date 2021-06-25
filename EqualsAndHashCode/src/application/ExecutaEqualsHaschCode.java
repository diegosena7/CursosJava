package application;

import entities.Cliente;

/*
 * HashCode e Equals
� S�o opera��es da classe Object utilizadas para comparar se um objeto � igual a outro
� equals: lento, resposta 100%
� hashCode: r�pido, por�m resposta positiva n�o � 100%

 * Se o hashCode de dois objetos for diferente, ent�o os dois objetos s�o
diferentes. Se o c�digo de dois objetos for igual, muito provavelmente os objetos
s�o iguais (pode haver colis�o).
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
