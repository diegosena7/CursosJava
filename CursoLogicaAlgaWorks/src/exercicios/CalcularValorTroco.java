package exercicios;
import java.util.Scanner;

public class CalcularValorTroco {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o valor total da compra: ");
		double valorCompra = sc.nextDouble();
		
		System.out.println("Entre com o valor recebido: ");
		double valorRecebido = sc.nextDouble();
		
		double troco = valorRecebido - valorCompra;
		
		System.out.println("Seu troco é R$ " + troco);
		
		sc.close();
	}
}
