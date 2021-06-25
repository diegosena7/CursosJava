import java.util.Scanner;

public class TabuadaEstruturaFor {

	public static void main(String[] args) {
		// Leia o inteiro X e retorne a tabuada deste valor
		
		Scanner sc = new Scanner(System.in);
		
		int tabuada = sc.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			int resultado = i * tabuada;
			System.out.println(i + " x " + tabuada + " = " + resultado);
		}
		
		sc.close();
	}
}
