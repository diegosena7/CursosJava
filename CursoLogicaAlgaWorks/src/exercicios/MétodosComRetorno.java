package exercicios;

public class MétodosComRetorno {

	public static void main(String[] args) {
		Double[] premissaInicial = new Double[] {725.5, 100.};
		Double proporcao = 20.0;
		Double resultadoFinal = regraDeTres(premissaInicial, proporcao);
		System.out.println("O resultado de " + proporcao + "% de " + premissaInicial[0] + " é = " + resultadoFinal);
	}
	
	static Double regraDeTres(Double[] premissa, Double percentual) {
		Double resultado = (premissa[0] * percentual) / premissa[1];
		return resultado;
	}
}
