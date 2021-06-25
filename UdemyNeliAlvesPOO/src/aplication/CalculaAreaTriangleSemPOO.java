package aplication;

import java.util.Locale;
import java.util.Scanner;

public class CalculaAreaTriangleSemPOO {

	// Problema resolvido sem orientação a objetos
	public static void main(String[] args) {
		/*
		 * Lê os dados de 2 triangulas x e y, calcule e mostre as áreas e o valor da
		 * maior área entre os valores calculados
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// lendo a área do triangulo x
		double xA, xB, xC, yA, yB, yC;
		System.out.println("Entre com as medidas do triângulo X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();

		// lendo a área do triangulo y
		System.out.println("Entre com as medidas do triângulo Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();

		// Calculando a área do triângulo
		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

		// Calculando a área do triângulo y
		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

		System.out.printf("Triângulo X área = %.4f%n", areaX);
		System.out.printf("Triângulo Y área = %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.printf("Maior área é X = %.4f%n", areaX);
		} else {
			System.out.printf("Maior área é Y = %.4f%n", areaY);
		}
		sc.close();
	}
}