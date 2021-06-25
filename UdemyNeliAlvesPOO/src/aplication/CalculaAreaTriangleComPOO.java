package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class CalculaAreaTriangleComPOO {

	public static void main(String[] args) {
	/*Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas
	válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos
	possui a maior área. */
		
		//COM ORIENTAÇÃO A OBJETOS
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Objeto do tipo Triangle
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X: ");
		
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		double areaX = x.area();
		
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.printf("Large area: %.4f%n", areaX);
		}
		else {
			System.out.printf("Larger area: %.4f%n", areaY);
		}
		sc.close();
	}
}
