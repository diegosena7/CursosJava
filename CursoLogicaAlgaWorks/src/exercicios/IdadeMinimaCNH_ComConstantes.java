package exercicios;
import java.util.Scanner;

/*
 * Nesta classe estamos criando uma constante para trabalhar co o valor do atributo idadeMinimaParaTirarCNH
 * esse valor n�o pode ser alterado ao chamarmos o atributo no nosso c�digo.
 */
public class IdadeMinimaCNH_ComConstantes {
	public static void main(String[] args) {
		
		final Integer idadeMinimaParaTirarCNH = 18;//constante
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com sua idade: ");
		int idade = sc.nextInt();
		
		if (idade >= idadeMinimaParaTirarCNH) {
			System.out.println("Voc� possui: " + idade + " anos e voc� j� pode tirar sua CNH.");
		}else {
			System.out.println("Voc� possui: " + idade + " aonos e voc� n�o pode tirar sua CNH ainda, aguarde mais um pouco.");
		}
	}
}
