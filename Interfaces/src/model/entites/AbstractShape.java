package model.entites;

import model.enums.Color;

/*
* Classes abstratas n�o podem ser instanciadas, como j� dito, elas servem apenas para que outras classes usem-na como modelo
* (herdem os atributos/propriedades e m�todos delas).
* Elas podem ter m�todos abstratos ou n�o abstratos. Os m�todos abstratos n�o podem ter corpo, ou seja, deve-se declarar apenas
* a assinatura do m�todo e eles obrigatoriamente ter�o que ser implementados na classe filha (a classe que herda), j� os m�todos
* que n�o forem assinados como abstract devem ter corpo e podem ou n�o ser sobrescritos na classe filha.
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