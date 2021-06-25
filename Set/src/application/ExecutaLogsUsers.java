package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.time.Instant;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.LogInfo;
/*
 * Nesta classe estamos verificando a quantidade de usuários de um fictício sistema, usamos o tipo de lista HashSet
 * pois esse tipo não aceita valores repetidos, assim podemos diferir a qtidade de usuários no sistema.
 * Estamos lendo os dados dos usuários através do arquivo informado pelo usuário através da classe BufferedReader.
 */
public class ExecutaLogsUsers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o caminho do arquivo...");
		String caminhoArquivo = sc.nextLine();
		//C:\Users\dssena\Desktop\Dsena_Cursos\Cursos\Curso_DevSuperior_Java\Java_Completo\set.txt
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(caminhoArquivo))){
			
			Set<LogInfo> set = new HashSet<>();
			String linha = bufferedReader.readLine();
			
			while (linha != null) {
				
				String [] logs = linha.split(" ");
				String nomeUsuario = logs[0];
				Date dataAtual = Date.from(Instant.parse(logs[1]));
				
				set.add(new LogInfo(nomeUsuario, dataAtual));
				
				linha = bufferedReader.readLine();
			}
			System.out.println("Total de usuários: " + set.size());
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		sc.close();
	}
}
