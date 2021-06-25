import java.util.Locale;
import java.util.Scanner;

public class CalculaMinutosExcedentes {

	public static void main(String[] args) {
//		Uma operadora de telefonia cobra R$ 50.00 por um plano b�sico que
//		d� direito a 100 minutos de telefone. Cada minuto que exceder a
//		franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler a
//		quantidade de minutos que uma pessoa consumiu, da� mostrar o valor
//		a ser pago.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutosUtilizados = sc.nextInt();
		double conta = 50.0;
		int minutosExcedentes = minutosUtilizados - 100;//Recebe o valor acima dos 100 minutos
		
		if(minutosUtilizados > 50) {
			conta += (minutosExcedentes) * 2;
		}
		
		System.out.printf("Valor da conta = R$ %.2f%n ", conta);
		sc.close();
	}
}
