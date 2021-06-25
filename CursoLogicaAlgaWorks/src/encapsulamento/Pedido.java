package encapsulamento;

public class Pedido {
	private Integer codigo;
	private Double subtotal;
	private Double total;
	final private Double percentualDesconto = 20.0;
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public Double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public Double getPercentualDesconto() {
		return percentualDesconto;
	}
	public Double getTotalCompra(Pedido pedido) {
		System.out.println("Total compra: ");
		Double desconto = (subtotal/100) * percentualDesconto;
		return subtotal - desconto;
	}
}
