import java.util.Locale;
import java.util.Scanner;

public class ConversaoCelsiusFahrenheitDoWhile {

	public static void main(String[] args) {
		// Coverter celsius em fahrenheit e retornar conversão na tela

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char resposta;
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double celsius = sc.nextDouble();
			double fahrenheit = 9.0 * celsius / 5.0 + 32.0;

			System.out.printf("Equivalente em Fahrenheit: %.1f%n", fahrenheit);
			System.out.print("Deseja repetir: (s/n)? ");
			resposta = sc.next().charAt(0);
		} while (resposta != 'n');

		sc.close();
	}

}
