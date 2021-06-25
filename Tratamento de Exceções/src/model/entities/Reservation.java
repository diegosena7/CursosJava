package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	// Construtor com parâmetros
	public Reservation(Integer roomNumber, Date checkin, Date checkout) {
		this.roomNumber = roomNumber;
		this.checkIn = checkin;
		this.checkOut = checkout;
	}

	// Getters and Setters
	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckin() {
		return checkIn;
	}

	public Date getCheckout() {
		return checkOut;
	}

	// Método responsável por calcular a diferença entre as datas da reserva
	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime();// Pega as datas de checkin/checkout em milisegundos
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);// Converte para dias
	}

	// Método respossável por atualizar as datas
	public String updateDates(Date checkin, Date checkout) {
		Date now = new Date();
		//Se as datas de checkin ou checkout forem inferior a data atual
		if (checkin.before(now) || checkout.before(now)) {
			return "Error in reservation: Reservation dates for updating must be future dates.";
		}
		if(!checkout.after(checkin)) {
			return "Error in reservation: Check-out date must be after check-in date";
		}
		this.checkIn = checkin;
		this.checkOut = checkout;
		return null;
	}

	@Override
	public String toString() {
		return "Room " + roomNumber + ", check-in: " + sdf.format(checkIn) + ", check-out: " + sdf.format(checkOut)
				+ ", " + duration() + " nights";
	}
}
