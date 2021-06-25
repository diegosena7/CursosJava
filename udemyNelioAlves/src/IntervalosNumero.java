import java.util.Scanner;

public class IntervalosNumero {

	public static void main(String[] args) {
//		Voc� deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
//		seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor n�o estiver em
//		nenhum destes intervalos, dever� ser impressa a mensagem �Fora de intervalo�.
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		numero = sc.nextInt();
		
		if(numero < 0) {
			System.out.println("Favor digitar um n�mero entre 0 e 100");
		}
		else if(numero > 0 && numero <= 25) {
			System.out.println("O n�mero " + numero + " est� entre 0 e 25");
		}
		else if(numero > 25 && numero <= 50) {
			System.out.println("O n�mero " + numero + " est� entre 25 e 50");
		}
		else if(numero > 50 && numero <= 75) {
			System.out.println("O n�mero " + numero + " est� entre 50 e 75");
		}
		else if(numero > 75 && numero <= 100) {
			System.out.println("O n�mero " + numero + " est� entre 75 e 100");
		}
		
		sc.close();
	}
}
