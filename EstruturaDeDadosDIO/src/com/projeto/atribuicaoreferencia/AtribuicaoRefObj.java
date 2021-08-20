package com.projeto.atribuicaoreferencia;

public class AtribuicaoRefObj {

	Integer num;

	
	public AtribuicaoRefObj(Integer num) {
		this.num = num;
	}

	public void setNum(Integer num) {
			this.num = num;
		}

	@Override
	public String toString() {
		return this.num.toString();
	}
}
