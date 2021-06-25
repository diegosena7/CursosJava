package exercicios;
import java.util.Scanner;

public class CalculaIMC {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o seu peso: ");
		double peso = sc.nextDouble();
		
		System.out.println("Entre com a sua altura: ");
		double altura = sc.nextDouble();
		
		double imc = peso/ (altura * altura);
		
		System.out.println("O seu IMC é: " + imc);
		
		sc.close();
	}
}
