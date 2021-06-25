package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
/*
 * Nesta classe estamos retornando a soma da área das figuras (Circle and Rectangle).
 * Usamos os tipos curingas (?) nas listas
 */
public class ExecutaTipoCuringaDelimitado {

	public static void main(String[] args) {
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(2.0, 3.0));
		myShapes.add((Shape) new Circle(2.0));

		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));

		System.out.println("Total area: " + totalArea((List<? extends Shape>) myCircles));
	}

	public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for (Shape s : list) {
			sum += ((Circle) s).area();
		}
		return sum;
	}
}