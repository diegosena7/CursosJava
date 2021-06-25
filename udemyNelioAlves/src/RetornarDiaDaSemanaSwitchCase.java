import java.util.Scanner;

public class RetornarDiaDaSemanaSwitchCase {

	public static void main(String[] args) {
		// Fazer um programa para ler um valor inteiro de 1 a 7 representando um
		// dia da semana (sendo 1=domingo, 2=segunda, e assim por diante).
		// Escrever na tela o dia da semana correspondente, conforme exemplos.

		Scanner sc = new Scanner(System.in);

		int diaDaSemana = sc.nextInt();
		String dia;

		switch (diaDaSemana) {
		case 1:
			dia = "Domingo";
			break;

		case 2:
			dia = "Segunda-feira";
			break;

		case 3:
			dia = "Terça-feira";
			break;

		case 4:
			dia = "Quarta-feira";
			break;

		case 5:
			dia = "Quinta-feira";
			break;

		case 6:
			dia = "Sexta-feira";
			break;

		case 7:
			dia = "Sábado";

			break;

		default:
			dia = "inválido";
			break;
		}
		System.out.println("Dia da semana é " + dia);
		sc.close();
	}

}
