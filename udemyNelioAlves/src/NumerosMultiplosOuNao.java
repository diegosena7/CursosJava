import java.util.Scanner;

public class NumerosMultiplosOuNao {

	public static void main(String[] args) {
//		Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//		Multiplos", indicando se os valores lidos s�o m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em
//		ordem crescente ou decrescente.

		Scanner sc = new Scanner(System.in);

		int numero1;
		int numero2;
		
		numero1 = sc.nextInt();
		numero2 = sc.nextInt();
		
		if(numero1 % 2 == 0 && numero2 % 2 ==0) {
			System.out.println("Os n�meros " + numero1 + " e " + numero2 + " S�O multiplos");
		}
		else {
			System.out.println("Os n�meros " + numero1 + " e " + numero2 + " N�O s�o multiplos");
		}
		
		sc.close();
	}

}
