package entities;

import enums.Color;

/*
 * Nesta classe estamos trabalhando com herança da classe ShapeMetodosAbstratos que é abstrata
 * logo, temos que implementar o seu método abstrato area calculando a área do circulo que é
 * o resultado de: Math.PI * radius * radius.
 */
public class CircleComMetodoAbstrato extends ShapeMetodosAbstratos{

	private Double radius;
	
	//Construtor padrão
	public CircleComMetodoAbstrato() {
		super();
	}
	
	//Construtor com argumentos
	public CircleComMetodoAbstrato(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}
	
	//Getters and Setters	
	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	//Sobrescrita de método
	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
}
