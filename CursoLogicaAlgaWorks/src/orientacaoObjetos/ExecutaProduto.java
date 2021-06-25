package orientacaoObjetos;

public class ExecutaProduto {

	public static void main(String[] args) {

		Produto produto = new Produto();
		produto.nome = "Smartphone";
		produto.preco = 1500.0;
		produto.qtidade = 5;
		
		exibirQtidadeProdutos(produto);
		verificarEstoque(produto);
		
		produto.exibirQtidadeProdutos(produto);
		produto.verificarEstoque(produto);
	}
	
	static void exibirQtidadeProdutos(Produto produto) {
		System.out.println("Quantidade em estoque: " + produto.qtidade);
		System.out.println("Preço do produto: " + produto.preco);
		System.out.println("Quantidade em estoque: " + produto.qtidade);
	}
	
	static void verificarEstoque(Produto item) {
		if (item.qtidade <=10) {
			System.out.println("Temos apenas " + item.qtidade + " " + item.nome + " o estoque deve ser reabastecido.");
		}else {
			System.out.println("Temos: " + item.qtidade + " " + item.nome + " o estoque está abastecido.");
		}
	}
}
