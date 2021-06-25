package exercicios;
import java.util.Scanner;

/*
 * Crie um programa que vai receber as notas que uma pessoa tirou nas duas materias de sua prova.
 * Serão dois parâmetros para receber um para receber a nota de português e outro para receber as de matemática. 
 * A prova, no total, vale 200 pontos - 100 para cada matéria. A nota mínima total para passar é igual ou maior que 150.
 * Entretanto, o candidato não pode tirar menos do que 60 pontos em qualquer uma das duas matérias, ou seja, se tirar 59
 * em português e 100 em matemática (totalizando uma nota maior do que o total necessário que é 150) ele não conseguirá a vaga.
 */
public class PassouNoConcurso {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("De 0 a 100 informe a nota de Português: ");
		Double notaPortugues = sc.nextDouble();
		
		System.out.println("De 0 a 100 informe a nota de Matemática: ");
		Double notaMatematica = sc.nextDouble();
		
		Double notaTotal = notaPortugues + notaMatematica;
		final Double notaMinimaPortugues = 60.0;
		final Double notaMinimaMatematica = 60.0;
		final Double notaMinimaConcurso = 150.0;
		
		if ((notaPortugues >= notaMinimaPortugues) && (notaMatematica >= notaMinimaMatematica) && (notaTotal >= notaMinimaConcurso)) {
			System.out.println("PARABÉNS... Você foi aprovado(a) com a nota: " + notaTotal);
		}else {
			System.out.println("Infelizmente, você não foi aprovado(a), tente novamente daqui a 3 meses, sua nota foi: " + notaTotal);
		}
		sc.close();
	}
}
