import java.util.Locale;
import java.util.Scanner;

public class CalculaSalarioFuncionario {

	public static void main(String[] args) {
//		Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por
//		hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas
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
		
		System.out.println("O n�mero de funcion�rios �: " + numFuncionarios);
		System.out.printf("O valor do sal�rio � de: %.2f%n", salarioFuncionario);
		
		sc.close();
		
	}

}
