package model.service;

public interface PagamentoOnlineService {
	double pagamentoComTaxa(Double quantidade);
	double interesse(Double quantidade, Integer meses);
}
