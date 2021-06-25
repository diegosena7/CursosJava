package entities;

import enums.Color;

/*
 * Nesta classe estamos trabalhando com m�todos abstratos, que n�o possuem implementa��o
 * utilizamos esses m�todos quando a classe � gen�rica demais para conter sua implementa��o
 * se uma classe possuir pelo menos 1 m�todo abstrato, ent�o esta classe tamb�m � abstrata.
 * 
 * Estamos usando o m�todo abstrato area e este esta�sendo implementtado nas subclasses que s�o
 * as classes: RectangleComMetodosAbstratos e CircleComMetodoAbstrato.
 */
public abstract class ShapeMetodosAbstratos {

	private Color color;

	//Construtor padr�o
	public ShapeMetodosAbstratos() {

	}

	//Construtor com argumentos
	public ShapeMetodosAbstratos(Color color) {
		this.color = color;
	}

	//Getters and Setters
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	//M�todo abstrato
	public abstract double area();
}
