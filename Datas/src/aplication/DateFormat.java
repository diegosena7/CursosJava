package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class DateFormat {

	public static void main(String[] args) throws ParseException {
		//Date
		
		//Formatação de datas
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		//Tipos de datas
		Date x1 = new Date();//Data atual do sistema
		Date x2 = new Date(System.currentTimeMillis());//Data atual do sistema em milisegundos
		Date x3 = new Date(0L);//Data inicial do objeto Date, inicia em 01/01/1970 as 00h00, neste caso vai contar -3h do sistema
		Date x4 = new Date(1000L * 60L * 60L * 5L);//Data com 5h a mais em milisegundos
		Date y1 = sdf1.parse("25/06/2018");//Data passada como parâmetro
		Date y2 = sdf2.parse("25/06/2018 15:42:07");//Data e hora passada como parâmetro
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));//Data no formato iso8601 padrão utc
		System.out.println("Datas sem formatação");
		System.out.println("x1 " + x1);
		System.out.println("x2 " + x2);
		System.out.println("x3 " + x3);
		System.out.println("x4: " + x4);
		System.out.println("y1: " + y1);
		System.out.println("y2: " + y2);
		System.out.println("y3: " + y3);
		System.out.println("__________Datas Formatadas____________");
		System.out.println("x1: " + sdf2.format(x1));
		System.out.println("x2: " + sdf2.format(x2));
		System.out.println("x3: " + sdf2.format(x3));
		System.out.println("x4: " + sdf2.format(x4));
		System.out.println("y1: " + sdf2.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		System.out.println("y3: " + sdf2.format(y3));
		System.out.println("__________Datas Formatadas Parte 2____________");
		System.out.println("x1: " + sdf3.format(x1));
		System.out.println("x2: " + sdf3.format(x2));
		System.out.println("x3: " + sdf3.format(x3));
		System.out.println("x4: " + sdf3.format(x4));
		System.out.println("y1: " + sdf3.format(y1));
		System.out.println("y2: " + sdf3.format(y2));
		System.out.println("y3: " + sdf3.format(y3));	
	}
}
