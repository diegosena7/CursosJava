import java.util.Scanner;

public class ExpressaoTernariaValorDesconto {

	public static void main(String[] args) {
		//Imprimi o valor do desconto através da condição ternária
		
		Scanner sc = new Scanner(System.in);
		
		double preco = 34.5;
		//desconto recebe preco * 0.1 ou preco * 0.05 de acordo com a condição
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.printf("O valor de desconto é de R$ %.2f%n", desconto);
		
		sc.close();
	}
}
