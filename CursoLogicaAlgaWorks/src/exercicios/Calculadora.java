package exercicios;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int num1 = sc.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int num2 = sc.nextInt();
		
		System.out.println("Entre com o tipo de cálculo [1 = soma / 2 = subtração / 3 multiplicação / 4 divisão]: ");
		Integer tipoDeCalculo = sc.nextInt();
		
//		Boolean soma = tipoDeCalculo.equals(1);
//		Boolean subtracao = tipoDeCalculo.equals(2);
//		Boolean multiplicacao = tipoDeCalculo.equals(3);
//		Boolean divisao = tipoDeCalculo.equals(4);
		
		if (tipoDeCalculo == 1) {
			int soma = num1 + num2;
			System.out.println("A soma de " + num1 + " + " + num2 + " é = " + soma);
		}else if (tipoDeCalculo == 2) {
			int subtracao = num1 - num2;
			System.out.println("A subtração de " + num1 + " - " + num2 + " é = " + subtracao);
		}else if (tipoDeCalculo == 3) {
			int multiplicacao = num1 * num2;
			System.out.println("A multiplicação de " + num1 + " x " + num2 + " é = " + multiplicacao);
		}else {
			int divisao = num1 / num2;
			System.out.println("A divisão de " + num1 + " / " + num2 + " é = " + divisao);
		}
		sc.close();
	}
}
