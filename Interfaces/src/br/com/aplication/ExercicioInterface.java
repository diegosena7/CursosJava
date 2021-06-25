package br.com.aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entites.Contrato;
import model.entites.ParcelasContrato;
import model.service.ContratoService;
import model.service.PaypalService;

/*
 * Interface é um tipo que define um conjunto de operações que uma
classe deve implementar. A interface estabelece um contrato
que a classe deve cumprir.
 */
public class ExercicioInterface {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Informe os dados do contrato... ");
		System.out.print("Número: ");
		int numeroContrato = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		Date dataContrato = sdf.parse(sc.next());
		System.out.print("Valor do contrato: ");
		double valorContrato = sc.nextDouble();
		
		Contrato contrato = new Contrato(numeroContrato, dataContrato, valorContrato);
		
		System.out.print("Informe o número de parcelas: ");
		int parcelas = sc.nextInt();
		
		ContratoService contratoService = new ContratoService(new PaypalService());
		
		contratoService.processaContrato(contrato, parcelas);
		
		System.out.println("Parcelas: ");
		for (ParcelasContrato x : contrato.getParcelas()) {
			System.out.println(x);
		}
		sc.close();
	}
}
