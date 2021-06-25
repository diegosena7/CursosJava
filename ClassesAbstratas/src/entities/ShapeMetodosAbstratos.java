package entities;

import enums.Color;

/*
 * Nesta classe estamos trabalhando com métodos abstratos, que não possuem implementação
 * utilizamos esses métodos quando a classe é genérica demais para conter sua implementação
 * se uma classe possuir pelo menos 1 método abstrato, então esta classe também é abstrata.
 * 
 * Estamos usando o método abstrato area e este esta´sendo implementtado nas subclasses que são
 * as classes: RectangleComMetodosAbstratos e CircleComMetodoAbstrato.
 */
public abstract class ShapeMetodosAbstratos {

	private Color color;

	//Construtor padrão
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

	//Método abstrato
	public abstract double area();
}
