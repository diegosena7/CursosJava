package model.service;

public class PaypalService implements PagamentoOnlineService{

	private final double TAXA_DE_JUROS = 0.02;
	private final double TAXA_POR_MES = 0.01;
	
	@Override
	public double pagamentoComTaxa(Double quantidade) {
		return quantidade * TAXA_DE_JUROS;
	}

	@Override
	public double interesse(Double quantidade, Integer meses) {
		return quantidade * TAXA_POR_MES * meses;
	}
}
