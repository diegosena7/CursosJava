import java.util.Locale;
import java.util.Scanner;

public class CalculaValorPagto {

	public static void main(String[] args) {
//		Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o
//		c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago
		
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		int codPeca1;
		int codPeca2;
		int qtidadePecas1;
		int qtidadePecas2;
		double precoPeca1;
		double precoPeca2;
		
		codPeca1 = sc.nextInt();
		qtidadePecas1 = sc.nextInt();
		precoPeca1 = sc.nextDouble();
		
		codPeca2 = sc.nextInt();
		qtidadePecas2 = sc.nextInt();
		precoPeca2 = sc.nextDouble();
		
		int valorPagto = (int) (precoPeca1 * qtidadePecas1 + precoPeca2 * qtidadePecas2);
		System.out.println("VALOR A PAGAR: " + valorPagto);
		
		sc.close();
	}

}
