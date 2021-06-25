package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class ExercicioEmployee {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Instanciando lista de funcion�rios
		List<Employee> list = new ArrayList<>();
		
		System.out.println("Enter the number of employees: ");
		int numberEmployees = sc.nextInt();//Recebe a qtidade de funcion�rios
		
		//Lista para ler a quantidade de funcion�rios
		for(int i = 1; i <= numberEmployees; i++) {
			System.out.println("Employee #" + i + "data: ");
			System.out.print("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);//l� o caracter (y/n)
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			
			System.out.println("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			//Se o funcion�rio for terceirizado...
			if(ch == 'y') {
				System.out.println("Addictoinal charge: ");
				double additionalCharge = sc.nextDouble();
				//Instancia um funcion�rio terceirizado do tipo Employee
				Employee emp = new OutsourcedEmployee( name, hours, valuePerHour, additionalCharge);
				list.add(emp);//adc o funcion�rio na lista
			}
			else {//Se n�o for terceirizado, instancia um funcion�rio comum
				Employee emp = new Employee(name, hours, valuePerHour);
				list.add(emp);
			}
		}
		
		System.out.println();
		System.out.println("Payment: ");
		for(Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}
		sc.close();
	}
}
