package exercicios;
import java.util.Scanner;

public class DiaDaSemana {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o n�mero correspondente ao dia da semana (1 a 7): ");
		int diaDaSemana = sc.nextInt();
		
		switch (diaDaSemana) {
		case 1:
			System.out.println("Hoje � domingo");
			break;

		case 2:
			System.out.println("Hoje � segunda");
			break;
			
		case 3:
			System.out.println("Hoje � ter�a");
			break;
			
		case 4:
			System.out.println("Hoje � quarta");
			break;
			
		case 5:
			System.out.println("Hoje � quinta");
			break;
			
		case 6:
			System.out.println("Hoje � sexta");
			break;
			
		case 7:
			System.out.println("Hoje � s�bado");
			break;
		}
		sc.close();
	}
}
