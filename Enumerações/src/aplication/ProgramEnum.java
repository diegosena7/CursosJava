package aplication;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class ProgramEnum {

	public static void main(String[] args) {
		//Tipo ENUM
		
		Order order = new Order(1090, new Date(), OrderStatus.PENDING_PAYMENT);
		OrderStatus os1 = OrderStatus.DELIVERED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");//Usando o valueOf para converter para String o ENUM
		
		System.out.println("Dados do pedido: " + order);
		
		System.out.println("Status do pedido: " + os1);
		System.out.println("Status do pedido convertido para String: " + os2);
	}
}
