package entities;

import enums.Color;

/*
 * Nesta classe estamos trabalhando com heran�a da classe ShapeMetodosAbstratos que � abstrata
 * logo, temos que implementar o seu m�todo abstrato area calculando a �rea do ret�ngulo que �
 * o resultado de: width * height.
 */
public class RectangleComMetodosAbstratos extends ShapeMetodosAbstratos{
	
	private Double width;
	private Double height;
	
	//Construtor padr�o
	public RectangleComMetodosAbstratos() {
		super();
	}
	
	//Construtor com argumentos
	public RectangleComMetodosAbstratos(Color color, Double width, Double height) {
		super(color);
		this.width = width;
		this.height = height;
	}


	//Getters and Setters
	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	//Sobrescrita de m�todo
	@Override
	public double area() {
		return width * height;
	}	
}
