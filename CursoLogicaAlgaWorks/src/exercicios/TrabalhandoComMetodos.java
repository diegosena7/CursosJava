package exercicios;

public class TrabalhandoComMetodos {

	public static void main(String[] args) {
		String[] cursos = new String[] { "Java EE", "Spring", "Java OO Avan�ado" };
		String[] formasPagamento = new String[] { "Cart�o", "Boleto", "D�bito" };
		
		imprimir("OKokaokojoajosm");
		iterandoExibindoPosicoesDoVetor(cursos);
		imprimir("--------------");
		iterandoExibindoPosicoesDoVetor(formasPagamento);
	}
	
	//M�todos criados
	static void imprimirTraco() {
		System.out.println("----------------------------------------------");
	}
	
	static void imprimir(String texto) {
		System.out.println(texto);
	}
	
	static void iterandoExibindoPosicoesDoVetor(String [] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("[" + i + "] " + vetor[i]);
		}
	}
	
	static void validaPosicao(Integer posicaoCursoEscolhido, Integer posicaoUsuario, String [] tamanho) {
		Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < tamanho.length;
		if (!posicaoValida) {
			posicaoInvalida();
		}
	}

	private static void posicaoInvalida() {
		System.err.println("Posi��o inv�lida!");
		System.exit(1);	
	}
}
