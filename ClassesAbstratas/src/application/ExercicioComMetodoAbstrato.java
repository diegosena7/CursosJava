package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.CircleComMetodoAbstrato;
import entities.RectangleComMetodosAbstratos;
import entities.ShapeMetodosAbstratos;
import enums.Color;
/*
 * Nesta classe criamos uma lista do tipo ShapeMetodosAbstratos, nela estamos inserindo os objetos
 * do tipo RectangleComMetodosAbstratos e CircleComMetodoAbstrato utilizando os conceitos de 
 * de polimorfimos e upcasting
 */
public class ExercicioComMetodoAbstrato {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Instanciando uma lista do tipo da Superclasse 
		List<ShapeMetodosAbstratos> list = new ArrayList<>();
		
		System.out.println("Enter the number of shapes: ");
		int n = sc.nextInt();//Recebe a qtidade de formas
		
		for(int i = 1; i <=n; i++) {
			System.out.println("Shape #" + i + "data: ");
			System.out.print("Rectangle or Cricle (R/C)? ");
			char ch = sc.next().charAt(0);//Recebe o caracter (R/C)
			
			System.out.println("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());//Converte o caracter digitado para o tipo ENUM
			
			if(ch == 'r') {//Se o caracter for == R lê os dados do retângulo
				System.out.println("Width: ");
				double width = sc.nextDouble();
				
				System.out.println("Height: ");
				double height = sc.nextDouble();
				list.add(new RectangleComMetodosAbstratos(color, width, height));
			}
			else {//se não... lê os dados do circulo
				System.out.println("Radius: ");
				double radius = sc.nextDouble();
				list.add(new CircleComMetodoAbstrato(color, radius));
			}
		}
		
		System.out.println();
		System.out.println("Shape areas: ");
		for(ShapeMetodosAbstratos shape : list) {
			System.out.println(String.format("%.2f%n", shape.area()));
		}
		sc.close();
	}
}
