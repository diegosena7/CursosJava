import java.util.Scanner;

public class NumPositivoNegativo {

	public static void main(String[] args) {
		//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		numero = sc.nextInt();
		
		if(numero < 0) {
			System.out.println(numero + " É um número NEGATIVO");
			
		}
		else {
			System.out.println(numero + " É um número POSITIVO");
		}
		
		sc.close();
		
	}
}
