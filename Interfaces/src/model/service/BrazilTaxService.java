package model.service;

public class BrazilTaxService implements TaxService{

	//M�todo respons�vel por calcular o imposto
	public double tax(double amount) {
		if (amount <= 100.0) {
			return amount * 0.2;
		}
		else {
			return amount * 0.15;
		}
	}
}