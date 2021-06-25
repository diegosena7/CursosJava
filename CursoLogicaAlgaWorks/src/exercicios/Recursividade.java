package exercicios;
/*
 * A recursividade � um recurso onde um m�todo faz a invoca��o do pr�prio m�todo
 */
public class Recursividade {

	public static void main(String[] args) {
		String [] alunos = new String [] {"Diego", "Nayara", "Ryan"};
		imprimirNumero(1);
		imprimirNomes(alunos, 0);
	}
	
	static void imprimirNumero(Integer numero) {
		System.out.println("N�mero: " + numero);
		
		if (numero < 10) {
			imprimirNumero(++ numero);
		}
	}
	
	static void imprimirNomes(String [] alunos, Integer iterador) {
		System.out.println("Aluno: " + alunos[iterador]);
		
		if (++iterador < alunos.length) {
			imprimirNomes(alunos, iterador);
		}
	}
}
