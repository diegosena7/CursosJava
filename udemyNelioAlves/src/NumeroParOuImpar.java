import java.util.Scanner;

public class NumeroParOuImpar {

	public static void main(String[] args) {
		//Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		numero = sc.nextInt();
		
		if(numero % 2 != 0) {
			System.out.println(numero + " � um n�mero �MPAR");
		}
		else {
			System.out.println(numero + " � um n�mero PAR");
		}
		
		sc.close();
	}

}
