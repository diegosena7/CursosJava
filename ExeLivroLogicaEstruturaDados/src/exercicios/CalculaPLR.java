package exercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class CalculaPLR {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Informe o cargo do colaborador: [1 = Gerente / 2 = Engenheiro/ 3 = Tecnico / 4 = Outros]:");
		Integer cargo = sc.nextInt();
		
		System.out.println("Informe o salário do colaborador: ");
		Double salario = sc.nextDouble();
		
		System.out.println("Informe a quanto anos que o colaborador trabalha na empresa: ");
		Integer anosDeEmpresa = sc.nextInt();
		
		if (cargo.equals(4)) {
			System.out.println("Salário atual: " + salario);
			Double ajuste = salario * 0.7 / 100;
			salario += ajuste;
			System.out.println("Salário pós aumento: " + salario);
		}else if (cargo.equals(1) && anosDeEmpresa >= 5) {
			System.out.println("Salário atual: " + salario);
			Double ajuste = salario * 10.0 / 100;
			salario += ajuste;
			System.out.println("Salário pós aumento: " + salario);
		}else if (cargo.equals(2) && anosDeEmpresa >=5) {
			System.out.println("Salário atual: " + salario);
			Double ajuste = salario * 15.0 / 100;
			salario += ajuste;
			System.out.println("Salário pós aumento: " + salario);
		}else if (cargo.equals(3) && anosDeEmpresa >= 5) {
			System.out.println("Salário atual: " + salario);
			Double ajuste = salario * 20.0 / 100;
			salario += ajuste;
			System.out.println("Salário pós aumento: " + salario);
		}
		sc.close();
	}
}
