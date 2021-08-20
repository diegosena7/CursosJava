package com.projeto.trabalhandoComPilhas;

public class NoUsandoPilha {

	private int dado;
	private NoUsandoPilha refNo;
	
	public NoUsandoPilha(int dado) {
		super();
		this.dado = dado;
	}

	public NoUsandoPilha() {
	}

	public int getDado() {
		return dado;
	}

	public void setDado(int dado) {
		this.dado = dado;
	}

	public NoUsandoPilha getRefNo() {
		return refNo;
	}

	public void setRefNo(NoUsandoPilha refNo) {
		this.refNo = refNo;
	}

	@Override
	public String toString() {
		return "NoUsandoPilha [dado=" + dado + "]";
	}
}
