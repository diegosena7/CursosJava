import java.util.Scanner;

public class NumeroParOuImpar {

	public static void main(String[] args) {
		//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		numero = sc.nextInt();
		
		if(numero % 2 != 0) {
			System.out.println(numero + " É um número ÍMPAR");
		}
		else {
			System.out.println(numero + " É um número PAR");
		}
		
		sc.close();
	}

}
