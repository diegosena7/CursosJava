package encapsulamento;

public class PedidoEncapsulamento {

	public static void main(String[] args) {
		Pedido pedido = new Pedido();
		
		pedido.setCodigo(1097);
		pedido.setSubtotal(1000.0);
		System.out.println(pedido.getTotalCompra(pedido));
	}
}
