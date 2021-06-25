package exercicios;
import java.util.Scanner;

public class VetorDuasDimensoes {

	public static void main(String[] args) {

		String [] cardapio = new String [] {"Calabresa", "Mussarela", "Frango", "Atum"};
		System.out.println("Escolha o sabor: ");
		
		for (int i = 0; i < cardapio.length; i++) {
			System.out.println("[" + i + "] " + cardapio[i]);
		}
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número referente ao sabor desejado: ");
		int saborEscolhido = sc.nextInt();
		
		System.out.println("Pronto seu pedido foi selecionado e o sabor escolhido é: " + cardapio[saborEscolhido]);
		sc.close();
	}
}
