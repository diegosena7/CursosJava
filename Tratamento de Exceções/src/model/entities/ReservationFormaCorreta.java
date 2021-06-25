package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

/*
  Cláusula throws: propaga a exceção ao invés de trata-la
• Cláusula throw: lança a exceção / "corta" o método
• Exception: compilador obriga a tratar ou propagar
• RuntimeException: compilador não obriga
• O modelo de tratamento de exceções permite que erros sejam tratados de forma consistente e flexível, usando boas práticas

• Vantagens:
• Lógica delegada
• Construtores podem ter tratamento de exceções
• Possibilidade de auxílio do compilador (Exception)
• Código mais simples. Não há aninhamento de condicionais: a qualquer momento que uma exceção for disparada, a execução é interrompida e cai no bloco catch correspondente.
• É possível capturar inclusive outras exceções de sistema
 */
public class ReservationFormaCorreta {

	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	// Construtor com parâmetros
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

	// Método responsável por calcular a diferença entre as datas da reserva
	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime();// Pega as datas de checkin/checkout em milisegundos
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);// Converte para dias
	}

	/* Neste método estamos atualizando as datas de reservas, esse método pode lançar uma exceção do tipo DomainException
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
