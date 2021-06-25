package leituraDeArquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/*
 * Nesta classe estamos lendo o arquivo atrav�s do caminho informado para o m�todo readAllLines da classe Files
 * Percorremos o arquivo atrav�s do for e usamos o m�todo get para pegar a posi��o da itera��o e retornamos
 * o valor do arquivo no console.
 */
public class LeituraDeArquivos {
	public static void main(String[] args) throws IOException {
		
		Path arquivo = Paths.get("C:\\Users\\dssena\\\\Desktop\\Dsena_Cursos\\\\Cursos\\Curso_DevSuperior_Java\\Java_Completo\\tarefas.txt");
		List<String> linhasArquivo = Files.readAllLines(arquivo);
		
		for (int i = 0; i < linhasArquivo.size(); i++) {
			String nome = linhasArquivo.get(i);
			
			System.out.println("Tarefa " + i + " : " + nome);
		}
	}
}
