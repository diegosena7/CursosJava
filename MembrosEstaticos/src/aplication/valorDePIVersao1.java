package aplication;

import java.util.Locale;
import java.util.Scanner;

public class valorDePIVersao1 {
/* Ler um valor numérico, retornar na tela a circunferência e volume de uma  esfera, retornar tb o valor de PI */
/*Não utilizado OO, todos os métodos precisam ser estáticos de uma classe estática*/
	
	public static final double PI = 3.141159;

	public static void main(String[] args) {
		// Ler um valor numérico, retornar na tela a circunferência e volume de uma esfera, retornar tb o valor de PI

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
	
	//Método responsável por calcular a circunferência
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	//Método responsável por calcular o volume
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3;
	}
}
