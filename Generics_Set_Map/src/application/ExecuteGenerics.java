package application;

import java.util.Scanner;

import services.PrintService;

public class ExecuteGenerics {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PrintService<Integer> ps = new PrintService<Integer>();
		
		System.out.println("How many values? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			Integer value = sc.nextInt();
			ps.addValue(value);
		}
		ps.printElements();
		System.out.println("First element: " + ps.firstElement());
		
		sc.close();
	}
}
