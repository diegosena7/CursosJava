package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class CodigoProduto {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Informe o código do produto [1-5]: ");
		Integer codProduto = sc.nextInt();
		
		switch (codProduto) {
		case 1:
			System.out.println("TV");
			break;
		case 2:
			System.out.println("Geladeira");
			break;
		case 3:
			System.out.println("Microondas");
			break;
		case 4:
			System.out.println("Notebook");
			break;
		case 5:
			System.out.println("Celular");
			break;
		default:
			break;
		}
		sc.close();
	}
}
