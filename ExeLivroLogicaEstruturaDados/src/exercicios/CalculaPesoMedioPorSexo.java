package exercicios;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class CalculaPesoMedioPorSexo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Pessoa pessoa = new Pessoa();
		
		System.out.println("Informe o sexo do paciente: [1 = Masculino / 2 = Feminino ]");
		Integer sexo = sc.nextInt();
		
		System.out.println("Informe a alutura d@ paciente: ");
		Double altura = sc.nextDouble();
		
		System.out.println("Informe o peso d@ paciente: ");
		Double peso = sc.nextDouble();
		
		if (sexo.equals(1)) {
			Double IMC = pessoa.calculaImcMasc(altura, peso);
			System.out.println("Peso atual do paciente é: " + IMC);
		}else {
			Double IMC = pessoa.calculaImcFem(altura, peso);
			System.out.println("Peso atual do paciente é: " + IMC);
		}
		sc.close();
	}
}
