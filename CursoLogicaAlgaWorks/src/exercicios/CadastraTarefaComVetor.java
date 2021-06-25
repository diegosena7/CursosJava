package exercicios;
import java.util.Scanner;

/*
 * Crie um sistema onde o usuário vai cadastrar, utilizando o console, as 5 tarefas mais importantes do dia dele.
 * Armazene cada uma dessas tarefas em um vetor e, no final, imprima as tarefas novamente.
 */
public class CadastraTarefaComVetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String [] tarefas = new String [5];
		
		//Lendo a tarefas digitadas
		System.out.println("Digite suas 5 tarefas do dia: ");
		for (int i = 0; i < tarefas.length; i++) {
			System.out.println("Tarefa " + i + " :");
			tarefas[i] = sc.nextLine();			
		}
		
		//Percorre e imprime as tarefas digitadas
		for (int i = 0; i < tarefas.length; i++) {
			System.out.println("As tarefas são: " + tarefas[i]);
		}
		sc.close();
	}
}
