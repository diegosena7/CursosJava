import java.util.Scanner;

public class RetornaMaiorNumDigitado {

	public static void main(String[] args) {
		//Leia 3 números inteiros e imprima na tela o maior deles
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int higher = max(num1, num2, num3);
		
		showResult(higher);
		
		
		sc.close();
	}
	
	//Criando uma função personalizada...
	public static int max (int x, int y, int  z) {
		int aux;
		
		if(x > y && x > z) {
			aux = x;
		}
		else if(y > z) {
			aux = y;
		}
		else {
			aux = z;
		}
		return aux;
	}
	
	public static void showResult (int value) {
		System.out.println("Higher = " + value);
	}

}
