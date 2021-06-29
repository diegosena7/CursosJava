package exercicios;
import java.util.Scanner;

public class IdadeMinimaCNH {
	public static void main(String[] args) {
		
		final Integer IDADE_MINIMA = 18;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com sua idade: ");
		int idade = sc.nextInt();
		
		if (idade >= IDADE_MINIMA) {
			System.out.println("Você possui: " + idade + " anos e você já pode tirar sua CNH.");
		}else {
			System.out.println("Você possui: " + idade + " aonos e você não pode tirar sua CNH ainda, aguarde mais um pouco.");
		}
		sc.close();
	}
}
