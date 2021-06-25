package exercicios;
import java.util.Scanner;

public class BonusFuncionarios {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		final Double metaEmpresa = 100.0;
		
		System.out.println("Informe o faturamento: ");
		Double faturamento = sc.nextDouble();
		
		System.out.println("Informe a m�dia salarial: ");
		Double mediaSalarial = sc.nextDouble();
		
		if (faturamento >= metaEmpresa) {
			mediaSalarial = mediaSalarial * 0.8;
			System.out.println("Bonus = " + mediaSalarial);
		}else if (faturamento < metaEmpresa && faturamento >= metaEmpresa * 0.8) {
			mediaSalarial = mediaSalarial * 0.8;
			System.out.println("Bonus = " + mediaSalarial);
		}else {
			System.out.println("Voc� n�o receber� bonus, pois n�o atingimos a meta...");
		}
		sc.close();
	}
}
