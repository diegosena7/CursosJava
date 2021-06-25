package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

/*
  Cl�usula throws: propaga a exce��o ao inv�s de trata-la
� Cl�usula throw: lan�a a exce��o / "corta" o m�todo
� Exception: compilador obriga a tratar ou propagar
� RuntimeException: compilador n�o obriga
� O modelo de tratamento de exce��es permite que erros sejam tratados de forma consistente e flex�vel, usando boas pr�ticas

� Vantagens:
� L�gica delegada
� Construtores podem ter tratamento de exce��es
� Possibilidade de aux�lio do compilador (Exception)
� C�digo mais simples. N�o h� aninhamento de condicionais: a qualquer momento que uma exce��o for disparada, a execu��o � interrompida e cai no bloco catch correspondente.
� � poss�vel capturar inclusive outras exce��es de sistema
 */
public class ReservationFormaCorreta {

	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	// Construtor com par�metros
	public ReservationFormaCorreta(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException {
		if (!checkOut.after(checkIn)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
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

	// M�todo respons�vel por calcular a diferen�a entre as datas da reserva
	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime();// Pega as datas de checkin/checkout em milisegundos
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);// Converte para dias
	}

	/* Neste m�todo estamos atualizando as datas de reservas, esse m�todo pode lan�ar uma exce��o do tipo DomainException
	 * que deve ser tratado na classe TratandoExcecoesDeFormaCorreta no bloco catch
	 */
	public void updateDates(Date checkin, Date checkout) throws DomainException {
		Date now = new Date();
		//Se as datas de checkin ou checkout forem inferior a data atual
		if (checkIn.before(now) || checkOut.before(now)) {
			throw new DomainException("Reservation dates for update must be future dates");
		}
		if (!checkOut.after(checkIn)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	@Override
	public String toString() {
		return "Room " + roomNumber + ", check-in: " + sdf.format(checkIn) + ", check-out: " + sdf.format(checkOut)
				+ ", " + duration() + " nights";
	}
}
