package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
 * Nesta classe estamos trabalhando com a estrutura try/catch utilizando o bloco finally
 * que contem um c�digo a ser executado independente de ter ocorrido ou n�ao uma exce��o.
 * Ex: quando precisamos fechar um arquivo, uma conex�o com o BD, ou outro recurso ao
 * final do processamento do m�todo.
 */
public class ExecutaTryCatchComFinally {

	public static void main(String[] args) {

		File file = new File("C:\\tmp\\aula.txt");//Arquivo extistente
		File file1 = new File("C:\\tmp\\aulas.txt");//Arquivo inexistente
		Scanner sc = null;
		try {
			sc = new Scanner(file1);
			while (sc.hasNextLine()) {//Lendo as linhas do arquivo encontrado
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {//Exce��o para caso n�o encontre o arquivo
			System.out.println("Error opening file: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}