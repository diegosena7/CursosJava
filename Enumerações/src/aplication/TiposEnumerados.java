package aplication;

import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Pedidos;
import entities.enums.StatusPedidos;

public class TiposEnumerados {
//Serve para especificar de forma literal um conjunto de constantes relacionadas.
//Palavra chave: ENUM
	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");//Formatando a data
		Pedidos pedidos = new Pedidos(77, sdf.format(new Date()), StatusPedidos.PAGAMENTO_PENDENTE);
		System.out.println("Dados do pedido: " + pedidos);
		
		//Conversão de String para Enum
		StatusPedidos statusPedido = StatusPedidos.ENTREGUE;
		StatusPedidos statusPedidoConvert = StatusPedidos.valueOf("ENTREGUE");//Converte enum para String
		System.out.println("Status do pedido: " + statusPedido);
		System.out.println("Status do pedido do tipo enum convertido para String: " + statusPedidoConvert);
	}
}
