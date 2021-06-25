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
		//Deixei o true como condi��o do la�o, pois, o que vai par�-lo � o fato do usu�rio digitar o "x" no console.
		while (true) { 
			System.out.print("Tarefa " + i + ": ");
			tarefa = scanner.nextLine();

			if ("x".equals(tarefa)) {
				break; //Essa � a �nica maneira de parar esse la�o.
			}

			linhas.add(tarefa);
			i++;
		}

		String tarefas = "";

		for (int iteracao = 0; iteracao < linhas.size(); iteracao++) {
			tarefas += linhas.get(iteracao) + "\n";
		}

		String mensagemEnviada = "Suas tarefas s�o: \n" + tarefas;

		System.out.print("Digite seu e-mail: ");
		String emailDestino = scanner.next();

		EnviaEmail.enviaEmail(emailDestino, "Sua lista de tarefas", mensagemEnviada);

		System.out.println("Fim...");

		scanner.close();
	}
}