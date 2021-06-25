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
		
		//Instanciando lista de funcionários
		List<Employee> list = new ArrayList<>();
		
		System.out.println("Enter the number of employees: ");
		int numberEmployees = sc.nextInt();//Recebe a qtidade de funcionários
		
		//Lista para ler a quantidade de funcionários
		for(int i = 1; i <= numberEmployees; i++) {
			System.out.println("Employee #" + i + "data: ");
			System.out.print("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);//lê o caracter (y/n)
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			
			System.out.println("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			//Se o funcionário for terceirizado...
			if(ch == 'y') {
				System.out.println("Addictoinal charge: ");
				double additionalCharge = sc.nextDouble();
				//Instancia um funcionário terceirizado do tipo Employee
				Employee emp = new OutsourcedEmployee( name, hours, valuePerHour, additionalCharge);
				list.add(emp);//adc o funcionário na lista
			}
			else {//Se não for terceirizado, instancia um funcionário comum
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
