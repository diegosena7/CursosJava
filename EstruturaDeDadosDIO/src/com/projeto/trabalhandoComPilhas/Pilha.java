package com.projeto.trabalhandoComPilhas;

public class Pilha {

	private NoUsandoPilha noDeReferenciaEntradaNaPilha;

	public Pilha() {
		this.noDeReferenciaEntradaNaPilha = null;
	}
	
	/*
	 * Esse m�todo � respons�vel por retornar o topo da pilha de dados
	 */
	public NoUsandoPilha top() {
		return noDeReferenciaEntradaNaPilha;
	}
	
	/*
	 * Esse m�todo � respons�vel por verificar se a pilha de dados est� vazia
	 * Usa um if tern�rio para a verifica��o
	 */
	public boolean isEmpty() {
		return noDeReferenciaEntradaNaPilha == null ? true : false;
	}
	
	/*
	 * M�todo respons�vel por adicionar/empilhar um novo elemento na pilha de dados
	 * Ao dar um push, guardamos a refer�ncia do topo da pilha, passo a refer�ncia
	 * de topo da pilha para o novo n� e seto o valor no no auxiliar.
	 */
	public void push(NoUsandoPilha novoNo) {
		NoUsandoPilha noRefAuxiliar = noDeReferenciaEntradaNaPilha;
		noRefAuxiliar = novoNo;
		novoNo.setRefNo(noRefAuxiliar);
	}
	
	/*
	 * Esse m�todo � respons�vel poe excluir o �ltimo elemento que foi inserido na pilha de dados
	 * Ao darmos o pop guardamos o n� que estamos excluindo na vari�vel noPoped e informo que o 
	 * n� de refer�ncia da nossa pilha atual � o pr�ximo n� (abaixo) do exclu�do, por fim
	 * retorno o n� exclu�do.
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
