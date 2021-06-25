package exercicios;
import java.util.Scanner;

/*
 * Crie um programa que vai receber as notas que uma pessoa tirou nas duas materias de sua prova.
 * Ser�o dois par�metros para receber um para receber a nota de portugu�s e outro para receber as de matem�tica. 
 * A prova, no total, vale 200 pontos - 100 para cada mat�ria. A nota m�nima total para passar � igual ou maior que 150.
 * Entretanto, o candidato n�o pode tirar menos do que 60 pontos em qualquer uma das duas mat�rias, ou seja, se tirar 59
 * em portugu�s e 100 em matem�tica (totalizando uma nota maior do que o total necess�rio que � 150) ele n�o conseguir� a vaga.
 */
public class PassouNoConcurso {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("De 0 a 100 informe a nota de Portugu�s: ");
		Double notaPortugues = sc.nextDouble();
		
		System.out.println("De 0 a 100 informe a nota de Matem�tica: ");
		Double notaMatematica = sc.nextDouble();
		
		Double notaTotal = notaPortugues + notaMatematica;
		final Double notaMinimaPortugues = 60.0;
		final Double notaMinimaMatematica = 60.0;
		final Double notaMinimaConcurso = 150.0;
		
		if ((notaPortugues >= notaMinimaPortugues) && (notaMatematica >= notaMinimaMatematica) && (notaTotal >= notaMinimaConcurso)) {
			System.out.println("PARAB�NS... Voc� foi aprovado(a) com a nota: " + notaTotal);
		}else {
			System.out.println("Infelizmente, voc� n�o foi aprovado(a), tente novamente daqui a 3 meses, sua nota foi: " + notaTotal);
		}
		sc.close();
	}
}
