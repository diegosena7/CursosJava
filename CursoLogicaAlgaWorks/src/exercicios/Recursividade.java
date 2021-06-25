package exercicios;
/*
 * A recursividade é um recurso onde um método faz a invocação do próprio método
 */
public class Recursividade {

	public static void main(String[] args) {
		String [] alunos = new String [] {"Diego", "Nayara", "Ryan"};
		imprimirNumero(1);
		imprimirNomes(alunos, 0);
	}
	
	static void imprimirNumero(Integer numero) {
		System.out.println("Número: " + numero);
		
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
