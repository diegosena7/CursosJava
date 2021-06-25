package exercicios;
import java.util.Scanner;

public class BonusFuncionarios {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		final Double metaEmpresa = 100.0;
		
		System.out.println("Informe o faturamento: ");
		Double faturamento = sc.nextDouble();
		
		System.out.println("Informe a média salarial: ");
		Double mediaSalarial = sc.nextDouble();
		
		if (faturamento >= metaEmpresa) {
			mediaSalarial = mediaSalarial * 0.8;
			System.out.println("Bonus = " + mediaSalarial);
		}else if (faturamento < metaEmpresa && faturamento >= metaEmpresa * 0.8) {
			mediaSalarial = mediaSalarial * 0.8;
			System.out.println("Bonus = " + mediaSalarial);
		}else {
			System.out.println("Você não receberá bonus, pois não atingimos a meta...");
		}
		sc.close();
	}
}
