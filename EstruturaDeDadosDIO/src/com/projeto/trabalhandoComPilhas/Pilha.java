package com.projeto.trabalhandoComPilhas;

public class Pilha {

	private NoUsandoPilha noDeReferenciaEntradaNaPilha;

	public Pilha() {
		this.noDeReferenciaEntradaNaPilha = null;
	}
	
	/*
	 * Esse método é responsável por retornar o topo da pilha de dados
	 */
	public NoUsandoPilha top() {
		return noDeReferenciaEntradaNaPilha;
	}
	
	/*
	 * Esse método é responsável por verificar se a pilha de dados está vazia
	 * Usa um if ternário para a verificação
	 */
	public boolean isEmpty() {
		return noDeReferenciaEntradaNaPilha == null ? true : false;
	}
	
	/*
	 * Método responsável por adicionar/empilhar um novo elemento na pilha de dados
	 * Ao dar um push, guardamos a referência do topo da pilha, passo a referência
	 * de topo da pilha para o novo nó e seto o valor no no auxiliar.
	 */
	public void push(NoUsandoPilha novoNo) {
		NoUsandoPilha noRefAuxiliar = noDeReferenciaEntradaNaPilha;
		noRefAuxiliar = novoNo;
		novoNo.setRefNo(noRefAuxiliar);
	}
	
	/*
	 * Esse método é responsável poe excluir o último elemento que foi inserido na pilha de dados
	 * Ao darmos o pop guardamos o nó que estamos excluindo na variável noPoped e informo que o 
	 * nó de referência da nossa pilha atual é o próximo nó (abaixo) do excluído, por fim
	 * retorno o nó excluído.
	 */
	public NoUsandoPilha pop() {
		if (!this.isEmpty()) {
			NoUsandoPilha noPoped = noDeReferenciaEntradaNaPilha;
			noDeReferenciaEntradaNaPilha = noDeReferenciaEntradaNaPilha.getRefNo();
			return noPoped;
		}
		return null;
	}
}
