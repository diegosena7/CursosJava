import java.util.Scanner;

public class NumerosMultiplosOuNao {

	public static void main(String[] args) {
//		Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//		Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
//		ordem crescente ou decrescente.

		Scanner sc = new Scanner(System.in);

		int numero1;
		int numero2;
		
		numero1 = sc.nextInt();
		numero2 = sc.nextInt();
		
		if(numero1 % 2 == 0 && numero2 % 2 ==0) {
			System.out.println("Os números " + numero1 + " e " + numero2 + " SÃO multiplos");
		}
		else {
			System.out.println("Os números " + numero1 + " e " + numero2 + " NÃO são multiplos");
		}
		
		sc.close();
	}

}
