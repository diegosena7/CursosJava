package exercicios;
public class VetorUmaDimensao {

	public static void main(String[] args) {

		Double faturamentoDia = 1000.0;
		Double [] faturamentoMensalJaneiro = new Double [] {1500.0, 2200.0, 3750.0};
		Double [] faturamentoMensalfevereiro = new Double [] {1900.0, 2500.0, 3950.0};
		Double [][] faturamentoAnual = new Double [] [] {faturamentoMensalJaneiro, faturamentoMensalfevereiro};
		
		System.out.println("Faturamento de 01 de Janeiro: " + faturamentoAnual[0] [0]);
		System.out.println("Faturamento de 03 de Fevereiro: " + faturamentoAnual[1][2]);
		
		//percorre o array faturamentoAnual
		for (int i = 0; i < faturamentoAnual.length; i++) {
			System.out.println("Mês: " + (i + 1));
			
			// percorre o array faturamentoMensalJaneiro e faturamentoMensalfevereiro
			for (int j = 0; j < faturamentoAnual[i].length; j++) {
				Double dia = faturamentoAnual[i][j];
				System.out.println("Dia: " + (j + 1) + ": " + dia);
			}
		}
	}
}
