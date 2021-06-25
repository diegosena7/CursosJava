package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class valorDePIVersao2 {
	
	public static void main(String[] args) {
/* Ler um valor numérico, retornar na tela a circunferência e volume de uma  esfera, retornar tb o valor de PI */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Instanciando o objeto do tipo Calculator
		Calculator calc = new Calculator();
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		double circ = calc.circumference(radius);
		double volume = calc.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", circ);
		System.out.printf("Volume: %.2f%n", volume);
		System.out.printf("PI value: %.2f%n", calc.PI);
		
		sc.close();
	}
}
