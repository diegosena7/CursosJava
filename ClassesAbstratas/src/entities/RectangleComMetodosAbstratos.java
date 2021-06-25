package entities;

import enums.Color;

/*
 * Nesta classe estamos trabalhando com herança da classe ShapeMetodosAbstratos que é abstrata
 * logo, temos que implementar o seu método abstrato area calculando a área do retângulo que é
 * o resultado de: width * height.
 */
public class RectangleComMetodosAbstratos extends ShapeMetodosAbstratos{
	
	private Double width;
	private Double height;
	
	//Construtor padrão
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

	//Sobrescrita de método
	@Override
	public double area() {
		return width * height;
	}	
}
