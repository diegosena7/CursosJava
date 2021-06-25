package exercicios;
import java.util.Scanner;

public class CalculaQuadrado {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número para calcularmos o valor dele ao quadrado: ");
		int numDigitado = sc.nextInt(); 
		
		int numAoQuadrado = numDigitado * numDigitado;
		
		System.out.println(numDigitado + " ao quadrado é: " + numAoQuadrado);
		
		sc.close();
	}
}
