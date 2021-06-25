package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class valorDePIVersao3 {
/*A palavra final diz que o valor atribuibo não poderá ser alterado uma constante deve ser em letras maiúsculas */

	public static final double PI = 3.141159;

	public static void main(String[] args) {
/* Ler um valor numérico, retornar na tela a circunferência e volume de uma  esfera, retornar tb o valor de PI */
/*Utilizamos a própria classe, pois os métodos não precisam de objetos para ser acionados quando se é estático*/

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();

		double circ = Calculator.circumference(radius);
		double volume = Calculator.volume(radius);

		System.out.printf("Circumference: %.2f%n", circ);
		System.out.printf("Volume: %.2f%n", volume);
		System.out.printf("PI value: %.2f%n", Calculator.PI);

		sc.close();
	}

	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}

	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3;
	}
}
