package br.com.aplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import model.entites.Employee;

public class ExecutaEmployee {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		String path = "C:\\Users\\dssena\\Desktop\\Pessoal\\interfaceComparable.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String employeeCsv = br.readLine();
			
			while (employeeCsv != null) {
				String[] fields = employeeCsv.split(",");//recorta a string e separa com virgula o elemento no array
				list.add(new Employee(fields[0], Double.parseDouble(fields[1])));//pega os 2 elementos no array
				employeeCsv = br.readLine();
			}
			
			Collections.sort(list);
			
			for (Employee emp : list) {
				System.out.println(emp.getName() + ", " + emp.getSalary());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}