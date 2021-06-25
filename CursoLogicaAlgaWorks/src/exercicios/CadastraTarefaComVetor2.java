package exercicios;
import java.util.Scanner;

/*
 * Crie um sistema onde o usuário vai cadastrar, utilizando o console, as 5 tarefas mais importantes do dia dele.
 * Armazene cada uma dessas tarefas em um vetor e, no final, imprima as tarefas novamente.
 */
public class CadastraTarefaComVetor2 {

	public static void main(String[] args) {
		
		String [] tarefas = new String [5];
		System.out.println("Digite suas 5 tarefas mais importantes do dia: ");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Primeira tarefa: ");
		tarefas[0] = sc.next();
		
		System.out.println("Segunda tarefa: ");
		tarefas[1] = sc.next();
		
		System.out.println("Terceira tarefa: ");
		tarefas[2] = sc.next();
		
		System.out.println("Quarta tarefa: ");
		tarefas[3] = sc.next();
		
		System.out.println("Quinta tarefa: ");
		tarefas[4] = sc.next();
		
		for (int i = 0; i < tarefas.length; i++) {
			System.out.println("As tarefas são: " + tarefas[i]);
		}
		sc.close();
	}
}
