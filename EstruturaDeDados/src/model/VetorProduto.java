package model;

import java.util.Arrays;

public class VetorProduto {
	
	private Produto[] produtos = new Produto[100];
	
	public void addProduto(Produto produto) {
	}
	
	public Produto seleciona(int posicao) {
		return null;
	}
	
	public void removeProduto(int posicao) {
	}
	
	public boolean contem(Produto produto) {
		return false;
	}
	
	public int tamanho () {
		return 0;
	}

	@Override
	public String toString() {
		return "VetorProduto [produtos=" + Arrays.toString(produtos) + "]";
	}
}
