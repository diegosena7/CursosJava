package exercicios;
import java.util.Scanner;

public class ValorTotal {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o valor do produto: ");
		double valorProduto = sc.nextDouble();
		
		System.out.println("Entre com a quantidade de produtos: ");
		int qtidadeProdutos = sc.nextInt();
		
		System.out.println("Entre com a forma de pagamento [1 = á vista / 2 = a prazo]: ");
		Integer tipoDePagamento = sc.nextInt();
		
		Boolean pagtoAVista = tipoDePagamento.equals(1);
		Double valorCompra = valorProduto * qtidadeProdutos;
		Double desconto = 0.0;
		Double juros = 0.0;
		
		if (!pagtoAVista) {
			juros = 10.0;
			double valorFinal = valorCompra + valorCompra * juros / 100;
			System.out.println("Valor da compra a prazo: " + valorFinal);
		}else{
			desconto = 10.0;
			double valorFinal = valorCompra - desconto;
			System.out.println("Valor da compra a vista: " + valorFinal);
		}
		sc.close();
	}
}
