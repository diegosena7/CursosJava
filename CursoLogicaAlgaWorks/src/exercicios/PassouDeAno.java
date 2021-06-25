package exercicios;
import java.util.Scanner;

public class PassouDeAno {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com a nota do 1 semestre: ");
		double nota1 = sc.nextDouble();
		
		System.out.println("Entre com a nota do 2 semestre: ");
		double nota2 = sc.nextDouble();
		
		double notaFinal = nota1  + nota2;
		double media = 7.5;
		
		if (notaFinal >= media) {
			System.out.println("Parabéns você passou de ano e sua nota final foi de: " + notaFinal);
		}else {
			System.out.println("Infelizmente você não passou de ano e sua nota final foi de: " + notaFinal);
		}
	}
}
