import java.util.Scanner;

public class SomaComFor {

	public static void main(String[] args) {
//Ler um número N e fazer a soma dos valores digitados
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int soma = 0;
		
		for(int i = 0; i < N; i ++) {
			int x = sc.nextInt();
			soma = soma + x;
		}
		System.out.println("Soma dos N números é: " + soma);
	}
}
