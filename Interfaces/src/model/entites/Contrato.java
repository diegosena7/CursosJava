package model.entites;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {

	private Integer numeroContrato;
	private Date dataDoContrato;
	private Double valorTotalContrato;
	private List<ParcelasContrato> parcelas = new ArrayList<>();
	
	public Contrato() {
		super();
	}
	
	public Contrato(Integer numeroContrato, Date dataDoContrato, Double valorTotalContrato) {
		super();
		this.numeroContrato = numeroContrato;
		this.dataDoContrato = dataDoContrato;
		this.valorTotalContrato = valorTotalContrato;
	}
	public Integer getNumeroContrato() {
		return numeroContrato;
	}
	public void setNumeroContrato(Integer numeroContrato) {
		this.numeroContrato = numeroContrato;
	}
	public Date getDataDoContrato() {
		return dataDoContrato;
	}
	public void setDataDoContrato(Date dataDoContrato) {
		this.dataDoContrato = dataDoContrato;
	}
	public Double getValorTotalContrato() {
		return valorTotalContrato;
	}
	public void setValorTotalContrato(Double valorTotalContrato) {
		this.valorTotalContrato = valorTotalContrato;
	}
	
	public List<ParcelasContrato> getParcelas(){
		return parcelas;
	}

	public void addParcelas(ParcelasContrato parcela) {
		parcelas.add(parcela);
	}
	
	public void removeParcelas(ParcelasContrato parcela) {
		parcelas.remove(parcela);
	}
}
