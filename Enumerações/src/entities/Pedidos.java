package entities;

import java.util.Date;

import entities.enums.StatusPedidos;

public class Pedidos {

	private int id;
	private Date momento;
	private StatusPedidos status;
	private String moment;//Recebe a data (momento) com a formatação
	
	//Construtor sem argumentos
	public Pedidos() {
	}
	
	//Construtor com argumentos
	public Pedidos(int id, Date momento, StatusPedidos status) {
		this.id = id;
		this.momento = momento;
		this.status = status;
	}

	//Construtor com parâmetros para data formatada
	public Pedidos(int id, String moment, StatusPedidos status) {
		this.id = id;
		this.setMoment(moment);
		this.status = status;
	}

	//Getters and seters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public StatusPedidos getStatus() {
		return status;
	}

	public void setStatus(StatusPedidos status) {
		this.status = status;
	}
	
	//Retorna uma string do objeto
	@Override
	public String toString() {
		return"Pedido - [id= " + id + ", momento = " + moment + ", status= " + status + "]";
	}

	public String getMoment() {
		return moment;
	}

	public void setMoment(String moment) {
		this.moment = moment;
	}
}
