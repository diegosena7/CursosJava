package exercicios;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class CalculaDiferencaEntreDatas {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		// Dando um exemplo: quantos dias se passam desde 26/02/1989 até 20/06/2021?
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date d1 = df.parse("26/02/1989");
		System.out.println(d1);
		Date d2 = df.parse("20/06/2021");
		System.out.println(d2);
		long dt = (d2.getTime() - d1.getTime()) + 3600000;//Acrescenta 1 hora para compensar horário de verão
		System.out.println("Passsaram-se: " + dt / 86400000L + " dias.");//Passaram-se 11802 dias

		sc.close();
	}
}
