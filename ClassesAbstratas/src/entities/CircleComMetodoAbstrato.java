package entities;

import enums.Color;

/*
 * Nesta classe estamos trabalhando com heran�a da classe ShapeMetodosAbstratos que � abstrata
 * logo, temos que implementar o seu m�todo abstrato area calculando a �rea do circulo que �
 * o resultado de: Math.PI * radius * radius.
 */
public class CircleComMetodoAbstrato extends ShapeMetodosAbstratos{

	private Double radius;
	
	//Construtor padr�o
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

	//Sobrescrita de m�todo
	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
}
