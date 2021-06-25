package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

/*
 * Nesta classe estamos tratando exceções de forma inadequada, apenas para exemplificar.
 */
public class TratandoExcecoesDeFormaRuim {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Room number: ");
		int number = sc.nextInt();
		
		System.out.print("Check-in date (dd/MM/yyyy): ");
		Date checkin = sdf.parse(sc.next());//Converte a data digitada
		
		System.out.print("Check-out date (dd/MM/yyyy): ");
		Date checkout = sdf.parse(sc.next());//Converte a data digitada
		
		//Se a data do checkout for inferior a de checkin vai lançar msg de erro
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
			
			//Se o error não for null informa msg de erro
			String error = reservation.updateDates(checkin, checkout);
			if (error != null) {
				System.out.println("Error in reservation: " + error);
			}
			else {//se o error for null atualiza os dados da reserva
				System.out.println("Reservation updates: " + reservation);
			}
		}
	}
}
