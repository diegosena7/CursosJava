package aplication;

import java.util.Locale;
import java.util.Scanner;


import entities.Rectangle;

public class CalculaAreaRectangle {
//Programa utilizando OO, acessa o objeto Retangle.
	
	public static void main(String[] args) {
// Leia a largura e altura de um retangulo, mostre na tela o valor da área, perímetro e a diagonal.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();

		System.out.println("Enter the width of the rectangle ");
		rectangle.width = sc.nextDouble();
		
		System.out.println("Enter the height of the rectangle ");
		rectangle.height = sc.nextDouble();
		sc.close();
		
		
		System.out.println("Área: " + rectangle.area());
		System.out.println("Perimeter: " + rectangle.perimeter());
		System.out.println("Diagonal: " + rectangle.diagonal());
	}

}
