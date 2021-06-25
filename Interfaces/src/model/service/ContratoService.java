package model.service;

import java.util.Calendar;
import java.util.Date;

import model.entites.Contrato;
import model.entites.ParcelasContrato;

public class ContratoService {

	private PagamentoOnlineService pagamentoOnlineService;
	
	public ContratoService(PagamentoOnlineService pagamentoOnlineService) {
		this.pagamentoOnlineService = pagamentoOnlineService;
	}

	public void processaContrato(Contrato contrato, Integer meses) {
		double cotaBasica = contrato.getValorTotalContrato() / meses;
		
		for (int i = 0; i <= meses; i++) {
			Date data = addMesesAoContrato(contrato.getDataDoContrato(), i);
			double atualizaCota = cotaBasica + pagamentoOnlineService.interesse(cotaBasica, i);
			double cotaFinal = atualizaCota + pagamentoOnlineService.pagamentoComTaxa(atualizaCota);
			contrato.addParcelas(new ParcelasContrato(data, cotaFinal));
		}
	}
	
	private Date addMesesAoContrato(Date data, int mes) {
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(data);
		calendario.add(Calendar.MONTH, mes);
		return calendario.getTime();
	}
}
