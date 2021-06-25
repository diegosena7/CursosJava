package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class CalculaNotaAluno {

	public static void main(String[] args) {
/*Leia o nome e 3 notas de um aluno em 3 trimestres do ano (primeiro trimestre  vale 30, o segundo e terceiro 35).
Mostre a nota final do aluno, se ele foi aprovado ou não e se não, quantos pontos faltou para passar. */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();

		System.out.println("Student's name: ");
		student.name = sc.nextLine();
		
		System.out.println("First note: ");
		student.nota1 = sc.nextDouble();
		
		System.out.println("Second note: ");
		student.nota2 = sc.nextDouble();
		
		System.out.println("Third note: ");
		student.nota3 = sc.nextDouble();

		System.out.printf("Final grade: %.2f%n", student.finalGrade());
		if (student.finalGrade() < 60.0) {
			System.out.println(student.name + " Unfortunately you were not approved");
			System.out.printf("Missing %.2f points%n", student.missingPoints());
		} else {
			System.out.println(student.name + " Congratulations you passed");
		}

		sc.close();
	}
}
