package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class CalculaSalarioFuncionario {

	public static void main(String[] args) {
/*Leia os dados de um funcion�rio (nome, sal�rio bruto e impostos), mostre nome e sal�rio liqu�do do funcion�rio,
em seguida aumente o valor do sal�rio em x % */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		System.out.print("Gross salary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + emp);
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		System.out.println();
		System.out.println("Updated data: " + emp);
		sc.close();
		
	}
}
