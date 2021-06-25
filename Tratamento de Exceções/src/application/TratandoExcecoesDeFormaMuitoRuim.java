package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

/*
 * Nesta classe estamos tratando exce��es de forma inadequada, apenas para exemplificar.
 */
public class TratandoExcecoesDeFormaMuitoRuim {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Room number: ");
		int number = sc.nextInt();
		
		System.out.print("Check-in date (dd/MM/yyyy): ");
		Date checkin = sdf.parse(sc.next());//Converte a data digitada
		
		System.out.print("Check-out date (dd/MM/yyyy): ");
		Date checkout = sdf.parse(sc.next());//Converte a data digitada
		
		//Se a data do checkout for inferior a de checkin vai lan�ar msg de erro
		if (!checkout.after(checkin)) {
			System.out.println("Error in reservation: Check-out date must be after check-in date");
		}else {//Se a data de checkin for inferior a de checkout instancia um objeto do tipo Reservation
			Reservation reservation = new Reservation(number, checkin, checkout);
			System.out.println("Reservation: " + reservation);
			System.out.println();
			System.out.println("Enter data to update the reservation: ");
			
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkin = sdf.parse(sc.next());//Converte a data digitada
			
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkout = sdf.parse(sc.next());//Converte a data digitada
			
			Date now = new Date();
			//Se as datas de checkin ou checkout forem inferior a data atual
			if (checkin.before(now) || checkout.before(now)) {
				System.out.println("Error in reservation: Reservation dates for updating must be future dates.");
			}else if(!checkout.after(checkin)) {
				System.out.println("Error in reservation: Check-out date must be after check-in date");
			}else {
				reservation.updateDates(checkin, checkout);
				System.out.println("Reservation updates: " + reservation);
			}
		}
	}
}
