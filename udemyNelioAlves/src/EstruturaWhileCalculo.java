import java.util.Scanner;

public class EstruturaWhileCalculo {

	public static void main(String[] args) {
		// Faça um programa para ler valores enquanto estes forem menores que 0 e
		// retornar a soma destes valores

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int soma = 0;

		while (x != 0) {
			soma = soma + x;
			x = sc.nextInt();
		}
		
		System.out.println(soma);
		sc.close();
	}

}
