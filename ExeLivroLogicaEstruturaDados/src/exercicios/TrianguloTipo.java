package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class TrianguloTipo {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Informe o lado 1 do triangulo: ");
		Integer lado1 = sc.nextInt();
		
		System.out.println("Informe o lado 2 do triangulo: ");
		Integer lado2 = sc.nextInt();
		
		System.out.println("Informe o lado 3 do triangulo: ");
		Integer lado3 = sc.nextInt();
		
		if (lado1 == lado2 && lado2 == lado3 && lado1 == lado3) {
			System.out.println("O triangulo é EQUILÁTERO");
			//Todos os lados são iguais
		}else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
			System.out.println("O triangulo é ESCALENO");
			//Todos os lados são diferentes
		}else {
			System.out.println("O triangulo é ISÓSCELES");
			//Dois lados são iguais
		}
		sc.close();
	}
}
