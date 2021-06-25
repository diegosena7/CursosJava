package consumindoBiblioteca;

import java.util.ArrayList;
import java.util.Scanner;

import org.apache.commons.mail.EmailException;

public class EnviaTarefasPorEmail {

	public static void main(String[] args) throws EmailException {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> linhas = new ArrayList<String>();

		String tarefa;
		int i = 0;
		System.out.println("Diegite as tarefas a serem enviadas para o seu e-mail. Para finalizar digite x.");
		//Deixei o true como condição do laço, pois, o que vai pará-lo é o fato do usuário digitar o "x" no console.
		while (true) { 
			System.out.print("Tarefa " + i + ": ");
			tarefa = scanner.nextLine();

			if ("x".equals(tarefa)) {
				break; //Essa é a única maneira de parar esse laço.
			}

			linhas.add(tarefa);
			i++;
		}

		String tarefas = "";

		for (int iteracao = 0; iteracao < linhas.size(); iteracao++) {
			tarefas += linhas.get(iteracao) + "\n";
		}

		String mensagemEnviada = "Suas tarefas são: \n" + tarefas;

		System.out.print("Digite seu e-mail: ");
		String emailDestino = scanner.next();

		EnviaEmail.enviaEmail(emailDestino, "Sua lista de tarefas", mensagemEnviada);

		System.out.println("Fim...");

		scanner.close();
	}
}