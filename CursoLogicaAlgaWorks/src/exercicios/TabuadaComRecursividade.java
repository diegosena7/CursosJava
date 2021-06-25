package exercicios;
import java.util.Scanner;

public class TabuadaComRecursividade {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número que deseja saber a tuabuada: ");
		Integer multiplicador = sc.nextInt();
		
		imprimirTabuada(multiplicador, 0);
		
		sc.close();
	}
	
	static void imprimirTabuada(Integer multiplicador, Integer iterator) {
		System.out.println(multiplicador + " x " + iterator + " = " + (multiplicador * iterator));
		if (++ iterator <= 10) {
			imprimirTabuada(multiplicador, iterator);
		}
	}
}
