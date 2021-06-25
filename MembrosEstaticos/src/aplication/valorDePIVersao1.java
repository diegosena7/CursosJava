package aplication;

import java.util.Locale;
import java.util.Scanner;

public class valorDePIVersao1 {
/* Ler um valor num�rico, retornar na tela a circunfer�ncia e volume de uma  esfera, retornar tb o valor de PI */
/*N�o utilizado OO, todos os m�todos precisam ser est�ticos de uma classe est�tica*/
	
	public static final double PI = 3.141159;

	public static void main(String[] args) {
		// Ler um valor num�rico, retornar na tela a circunfer�ncia e volume de uma esfera, retornar tb o valor de PI

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		double circ = circumference(radius);
		double volume = volume(radius);
		
		System.out.printf("Circumference: %.2f%n", circ);
		System.out.printf("Volume: %.2f%n", volume);
		System.out.printf("PI value: %.2f%n", PI);
		
		sc.close();
	}
	
	//M�todo respons�vel por calcular a circunfer�ncia
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	//M�todo respons�vel por calcular o volume
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3;
	}
}
