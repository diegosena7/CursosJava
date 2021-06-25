package escrevendoArquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Nesta classe estamos criando um arquivo no caminho informado em path e com o nome files.txt
 * Estamos escrevendo neste arquivo os nomes digitados via console que estão sendo armazenados
 * na variável linhas através do for.
 */
public class EscrevendoArquivos {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> linhas = new ArrayList<String>();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Jogador " + i + ": ");
			String nome = sc.nextLine();
			linhas.add(nome);
		}
		
		System.out.println("Jogadores: " + linhas);
		
		Path path = Paths.get("C:\\Users\\dssena\\\\Desktop\\Dsena_Cursos\\\\Cursos\\Curso_DevSuperior_Java\\Java_Completo\\files.txt");
		linhas.add("Diego");
		Files.write(path, linhas);
		
		sc.close();
	}
}
