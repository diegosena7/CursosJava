import java.util.Locale;
import java.util.Scanner;

public class CalculaSalarioFuncionario {

	public static void main(String[] args) {
//		Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//		hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//		decimais.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double numFuncionarios;
		double horasTrabalhadas;
		double valorPorHora;
		double salarioFuncionario;
		
		numFuncionarios = sc.nextDouble();
		horasTrabalhadas = sc.nextDouble();
		valorPorHora = sc.nextDouble();
		salarioFuncionario = horasTrabalhadas * valorPorHora;
		
		System.out.println("O número de funcionários é: " + numFuncionarios);
		System.out.printf("O valor do salário é de: %.2f%n", salarioFuncionario);
		
		sc.close();
		
	}

}
