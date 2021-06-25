import java.util.Locale;
import java.util.Scanner;

public class LerRaioCirculo {

	public static void main(String[] args) {
		
//		Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
//		casas decimais conforme exemplos.
//		Fórmula da área: area = π . raio2
//		Considere o valor de π = 3.14159
		
		
//		double raio;
//		double area;
//		final double PI = 3.1416;
//
//		System.out.println("Escreva o valor do raio");
//		Scanner scan = new Scanner(System.in);
//		raio = scan.nextFloat();
//
//		area = PI * Math.pow(raio, 2);
//
//		System.out.printf("O valor da area é %.4f%n", area);
//		scan.close();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double R, A, pi = 3.14159;
	    
	    R = sc.nextDouble();

	    A = pi * R * R;

	    System.out.printf("Área = %.4f%n", A);

		sc.close();
	}
}
