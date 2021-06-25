package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class ProgramSomaTempo {

	public static void main(String[] args) throws ParseException {
		//Somando uma unidade de tempo

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date data = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println(sdf.format(data));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		cal.add(Calendar.HOUR_OF_DAY, 4);//Acrescentado 4h ao horário instanciado na variável d
		data = cal.getTime();
		
		System.out.println(sdf.format(data));
	}
}
