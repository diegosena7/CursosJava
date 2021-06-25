package orientacaoObjetos;

public class Produto {
	
	String nome;
	Double preco;
	Integer qtidade;

	public void exibirQtidadeProdutos(Produto produto) {
		System.out.println("Quantidade em estoque: " + produto.qtidade);
		System.out.println("Preço do produto: " + produto.preco);
		System.out.println("Quantidade em estoque: " + produto.qtidade);
	}

	public void verificarEstoque(Produto item) {
		if (item.qtidade <= 10) {
			System.out.println("Temos apenas " + item.qtidade + " " + item.nome + " o estoque deve ser reabastecido.");
		} else {
			System.out.println("Temos: " + item.qtidade + " " + item.nome + " o estoque está abastecido.");
		}
	}
}
