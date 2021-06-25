package exercicios;
import java.util.Scanner;

public class Recursividade1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		imprimirTraco();

		String[] cursos = new String[] { "Java EE", "Spring", "Java OO Avan�ado" };

		imprimiePulaLinha("Escolha dentre os cursos abaixo: ");
		iterarEExibirPosicoesDoVetorString(cursos);

		for (int i = 0; i < cursos.length; i++) {
			System.out.println("[" + i + "] " + cursos[i]);
		}

		Integer posicaoCursoEscolhido = receberNumeroInteiroDoUsuario("O curso que voc� deseja � o: ", scanner);

		Boolean posicaoValida = verificaPosicaoEscolhidaUsuario(posicaoCursoEscolhido, cursos);

		if (!posicaoValida) {
			posicaoInvalida();
		}

		imprimirTraco();

		String[] formasPagamento = new String[] { "Cart�o", "Boleto" };

		imprimiePulaLinha("Escolha dentre as formas de pagamento abaixo: ");

		iterarEExibirPosicoesDoVetorString(formasPagamento);

		Integer posicaoFormaPagamentoEscolhida = receberNumeroInteiroDoUsuario("Sua forma de pagamento escolhida �: ", scanner);

		posicaoValida = verificaPosicaoEscolhidaUsuario(posicaoFormaPagamentoEscolhida,formasPagamento);

		if (!posicaoValida) {
			posicaoInvalida();
		}

		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];

		imprimirTraco();

		imprimiePulaLinha("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento � " + formaPagamentoEscolhida);
		scanner.close();
	}
	
	//M�todos criados
	static Integer receberNumeroInteiroDoUsuario(String texto, Scanner sc) {
		imprimiSemPularLinha(texto);
		Integer numInformadoUsuario = sc.nextInt();
		return numInformadoUsuario;
	}
	
	static Boolean verificaPosicaoEscolhidaUsuario(Integer posicaoEscolhida, String[] vetor) {
		Boolean valida = posicaoEscolhida >= 0 && posicaoEscolhida < vetor.length;
		return valida;
	}
	
	static void imprimiePulaLinha(String texto) {
		System.out.println(texto);
	}
	
	static void imprimiSemPularLinha(String texto) {
		System.out.print(texto);
	}
	
	static void imprimirTraco() {
		imprimiePulaLinha("----------------------------------------------");
	}
	static void posicaoInvalida() {
		System.err.println("Posi��o inv�lida!");
		System.exit(1);
	}
	
	static void iterarEExibirPosicoesDoVetorString(String[] vetor) {
		iterarEExibirPosicoesDoVetorString(vetor, 0);
	}
	
	//Usando a recursividade, recurso onde um m�todo chama o pr�prio m�todo
	static void iterarEExibirPosicoesDoVetorString(String[] vetor, Integer iterator) {
		imprimiePulaLinha("[" + iterator + "] " + vetor[iterator]);
		
		if (++ iterator < vetor.length) {
			iterarEExibirPosicoesDoVetorString(vetor, iterator);
		}
	}
}
