package model.entites;

import model.enums.Color;

/*
* Classes abstratas não podem ser instanciadas, como já dito, elas servem apenas para que outras classes usem-na como modelo
* (herdem os atributos/propriedades e métodos delas).
* Elas podem ter métodos abstratos ou não abstratos. Os métodos abstratos não podem ter corpo, ou seja, deve-se declarar apenas
* a assinatura do método e eles obrigatoriamente terão que ser implementados na classe filha (a classe que herda), já os métodos
* que não forem assinados como abstract devem ter corpo e podem ou não ser sobrescritos na classe filha.
*/
public abstract class AbstractShape implements Shape {

	private Color color;

	public AbstractShape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}