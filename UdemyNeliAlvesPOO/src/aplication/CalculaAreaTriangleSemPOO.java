package aplication;

import java.util.Locale;
import java.util.Scanner;

public class CalculaAreaTriangleSemPOO {

	// Problema resolvido sem orienta��o a objetos
	public static void main(String[] args) {
		/*
		 * L� os dados de 2 triangulas x e y, calcule e mostre as �reas e o valor da
		 * maior �rea entre os valores calculados
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// lendo a �rea do triangulo x
		double xA, xB, xC, yA, yB, yC;
		System.out.println("Entre com as medidas do tri�ngulo X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();

		// lendo a �rea do triangulo y
		System.out.println("Entre com as medidas do tri�ngulo Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();

		// Calculando a �rea do tri�ngulo
		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

		// Calculando a �rea do tri�ngulo y
		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

		System.out.printf("Tri�ngulo X �rea = %.4f%n", areaX);
		System.out.printf("Tri�ngulo Y �rea = %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.printf("Maior �rea � X = %.4f%n", areaX);
		} else {
			System.out.printf("Maior �rea � Y = %.4f%n", areaY);
		}
		sc.close();
	}
}