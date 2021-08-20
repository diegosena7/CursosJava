package com.projeto.trabalhandoComNoUsandoGenerics;

public class ProjetoNoUsandoGenerics<T> {

	private T conteudo;
	private ProjetoNoUsandoGenerics<T> proximoNo;
	
	public ProjetoNoUsandoGenerics(T conteudo) {
		super();
		this.conteudo = conteudo;
	}

	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public ProjetoNoUsandoGenerics<T> getProximoNo() {
		return proximoNo;
	}

	public void setProximoNo(ProjetoNoUsandoGenerics<T> no) {
		this.proximoNo = no;
	}

	@Override
	public String toString() {
		return "ProjetoNo [conteudo=" + conteudo + "]";
	}
}
