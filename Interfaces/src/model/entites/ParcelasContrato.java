package model.entites;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ParcelasContrato {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date dataParcelas;
	private Double valorParcelas;
	
	public ParcelasContrato() {
		super();
	}
	
	public ParcelasContrato(Date dataParcelas, Double valorParcelas) {
		super();
		this.dataParcelas = dataParcelas;
		this.valorParcelas = valorParcelas;
	}
	
	public Date getDataParcelas() {
		return dataParcelas;
	}
	public void setDataParcelas(Date dataParcelas) {
		this.dataParcelas = dataParcelas;
	}
	public Double getValorParcelas() {
		return valorParcelas;
	}
	public void setValorParcelas(Double valorParcelas) {
		this.valorParcelas = valorParcelas;
	}
	
	@Override
	public String toString() {
		return sdf.format(dataParcelas) + " - " + String.format("%.2f", valorParcelas);
 	}
}
