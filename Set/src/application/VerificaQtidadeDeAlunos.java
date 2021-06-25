package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * Nesta classe estamos verificando a quantidade de alunos que est�o matriculados nos cursos
 * cada aluno pode se matricular em mais de um curso, com isso usamos o tipo de lista HashSet
 * para retornar apenas o n�nero total de alunos, independente de quantos cursos os alunos
 * estejam matriculados.
 */
public class VerificaQtidadeDeAlunos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Set<Integer> cursoJava = new HashSet<>();
		Set<Integer> cursoJavascript = new HashSet<>();
		Set<Integer> cursoSpringboot = new HashSet<>();

		System.out.print("Insira a quantidade de alunos temos no curso de Java e seus respectivos c�digos de aluno: ");
		int curso = sc.nextInt();
		for (int i = 0; i < curso; i++) {
			int quantidadeDeCursos = sc.nextInt();
			cursoJava.add(quantidadeDeCursos);
		}

		System.out.print("Insira a quantidade de alunos temos no curso de Javascript e seus respectivos c�digos de aluno: ");
		curso = sc.nextInt();
		for (int i = 0; i < curso; i++) {
			int quantidadeDeCursos = sc.nextInt();
			cursoJavascript.add(quantidadeDeCursos);
		}

		System.out.print("Insira a quantidade de alunos temos no curso de Springboot e seus respectivos c�digos de aluno: ");
		curso = sc.nextInt();
		for (int i = 0; i < curso; i++) {
			int quantidadeDeCursos = sc.nextInt();
			cursoSpringboot.add(quantidadeDeCursos);
		}

		Set<Integer> total = new HashSet<>(cursoJava);
		total.addAll(cursoJavascript);
		total.addAll(cursoSpringboot);
		System.out.println("Total alunos: " + total.size());
		sc.close();
	}
}