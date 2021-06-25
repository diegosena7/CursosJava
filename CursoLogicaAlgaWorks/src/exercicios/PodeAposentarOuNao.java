package exercicios;
import java.util.Scanner;

/*
 * Crie um programa que receba a idade de uma pessoa e a quantidade de tempo que essa pessoa contribuiu com a previd�ncia,
 * depois verifique se ela pode aposentar ou n�o.
 * Nas regras desse programa a pessoa vai precisar ter, pelo menos, 55 anos e ter contribu�do com, pelo menos, 25 anos.
 * Se ela passar nessas duas condi��es, ent�o mostre pra ela uma mensagem dizendo que ela pode aposentar.
 */
public class PodeAposentarOuNao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a sua idade: ");
		Integer idade = sc.nextInt();
		
		System.out.println("Informe o per�odo de contribui��o com a previdencia: ");
		Integer periodoContribuicao = sc.nextInt();
		
		if (idade >= 55 && periodoContribuicao >= 25) {
			System.out.println("SIM... Voc� j� pode se aposentar!!!");
		}else {
			System.out.println("N�O... Voc� ainda n�o pode se aposentar!!!");
		}
		sc.close();
	}
}
