package exercicios;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero: ");
		int num1 = sc.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		int num2 = sc.nextInt();
		
		System.out.println("Entre com o tipo de c�lculo [1 = soma / 2 = subtra��o / 3 multiplica��o / 4 divis�o]: ");
		Integer tipoDeCalculo = sc.nextInt();
		
//		Boolean soma = tipoDeCalculo.equals(1);
//		Boolean subtracao = tipoDeCalculo.equals(2);
//		Boolean multiplicacao = tipoDeCalculo.equals(3);
//		Boolean divisao = tipoDeCalculo.equals(4);
		
		if (tipoDeCalculo == 1) {
			int soma = num1 + num2;
			System.out.println("A soma de " + num1 + " + " + num2 + " � = " + soma);
		}else if (tipoDeCalculo == 2) {
			int subtracao = num1 - num2;
			System.out.println("A subtra��o de " + num1 + " - " + num2 + " � = " + subtracao);
		}else if (tipoDeCalculo == 3) {
			int multiplicacao = num1 * num2;
			System.out.println("A multiplica��o de " + num1 + " x " + num2 + " � = " + multiplicacao);
		}else {
			int divisao = num1 / num2;
			System.out.println("A divis�o de " + num1 + " / " + num2 + " � = " + divisao);
		}
		sc.close();
	}
}
