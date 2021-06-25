package exercicios;
import java.util.Scanner;

/*
 * Crie um programa que receba a idade de uma pessoa e a quantidade de tempo que essa pessoa contribuiu com a previdência,
 * depois verifique se ela pode aposentar ou não.
 * Nas regras desse programa a pessoa vai precisar ter, pelo menos, 55 anos e ter contribuído com, pelo menos, 25 anos.
 * Se ela passar nessas duas condições, então mostre pra ela uma mensagem dizendo que ela pode aposentar.
 */
public class PodeAposentarOuNao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a sua idade: ");
		Integer idade = sc.nextInt();
		
		System.out.println("Informe o período de contribuição com a previdencia: ");
		Integer periodoContribuicao = sc.nextInt();
		
		if (idade >= 55 && periodoContribuicao >= 25) {
			System.out.println("SIM... Você já pode se aposentar!!!");
		}else {
			System.out.println("NÃO... Você ainda não pode se aposentar!!!");
		}
		sc.close();
	}
}
