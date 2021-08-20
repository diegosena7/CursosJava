package com.projeto.trabalhandoComNo;

public class ProjetoNo {

	private String conteudo;
	private ProjetoNo proximoNo;
	
	public ProjetoNo(String conteudo) {
		super();
		this.conteudo = conteudo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public ProjetoNo getProximoNo() {
		return proximoNo;
	}

	public void setProximoNo(ProjetoNo no) {
		this.proximoNo = no;
	}

	@Override
	public String toString() {
		return "ProjetoNo [conteudo=" + conteudo + "]";
	}
}
