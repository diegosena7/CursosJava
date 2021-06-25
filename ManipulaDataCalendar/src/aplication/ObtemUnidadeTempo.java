package aplication;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class ObtemUnidadeTempo {

	public static void main(String[] args) {
		//Obtendo uma unidade de tempo

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date data = Date.from(Instant.parse("2018-06-25T15:42:07Z"));//Data no formato UTC
		System.out.println("Data com formato UTC: " + sdf.format(data));
		
		//Instanciando o objeto calendar
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		int hour = cal.get(Calendar.HOUR_OF_DAY);//Retorna a hora da vari�vel data
		int minutes = cal.get(Calendar.MINUTE);//Retorna a qtidade de minutos da vari�vel data
		int seconds = cal.get(Calendar.SECOND);//Retorna a qtidade de segundos da vari�vel data
		int day = cal.get(Calendar.DAY_OF_MONTH);//Retorna o dia da vari�vel data
		int month = 1 + cal.get(Calendar.MONTH);//Retorna o m�s da vari�vel data, utilizamos o 1, pois o m�s come�a em 0.
		int year = cal.get(Calendar.YEAR);//Retorna o ano da vari�vel data
		System.out.println("Hour " + hour);
		System.out.println("Minutes: " + minutes);
		System.out.println("Seconds " + seconds);
		System.out.println("Day: " + day);
		System.out.println("Month: " + month);
		System.out.println("Year: " + year);
		
		System.out.println("-------------------------------------------");
		
		cal.add(Calendar.MONTH, 1);
		data = cal.getTime();
		System.out.println("Adiciona 1 m�s na data: " + sdf.format(data));
		
		cal.add(Calendar.DAY_OF_MONTH, 3);
		data = cal.getTime();
		System.out.println("Adiciona 3 dias na data: " + sdf.format(data));
	}
}
