import java.util.Scanner;

public class NumPositivoNegativo {

	public static void main(String[] args) {
		//Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		numero = sc.nextInt();
		
		if(numero < 0) {
			System.out.println(numero + " � um n�mero NEGATIVO");
			
		}
		else {
			System.out.println(numero + " � um n�mero POSITIVO");
		}
		
		sc.close();
		
	}
}
