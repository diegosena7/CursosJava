package exercicios;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class CalculaReajusteFuncionario {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Informe o nome do funcion�rio: ");
		String funcionario = sc.next();
		
		System.out.println("Informe o sal�rio do funcion�rio: ");
		Double salario = sc.nextDouble();
		
		Funcionario colaborador = new Funcionario(funcionario, salario);
		funcionario = colaborador.getNome();
		salario = colaborador.getSalario();
		
		Double salarioComReajuste = colaborador.calculaReajuste(salario);
		
		System.out.println("O colaborador " + funcionario + " possui um sal�rio atual de R$: " + salario +
				" e com o rejuste passar� a receber R$: " + salarioComReajuste);
		
		sc.close();
	}
}
