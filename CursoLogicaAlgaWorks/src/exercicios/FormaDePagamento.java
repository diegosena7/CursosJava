package exercicios;
import java.util.Scanner;

public class FormaDePagamento {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o valor do produto: ");
		double produto = sc.nextDouble();
		System.out.println("Entre com a forma de pagamento [1 = á vista / 2 = a prazo]: ");
		Integer tipoDePagamento = sc.nextInt();
		
		Boolean pagtoAVista = tipoDePagamento.equals(1);
		Double juros = 0.0;
		
		if (!pagtoAVista) {
			juros = 10.0;
			produto = produto + produto * juros / 100;
		}
		System.out.println("O valor do produto é: " + produto);
		sc.close();
	}
}
