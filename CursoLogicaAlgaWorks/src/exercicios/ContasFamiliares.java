package exercicios;
import java.util.Scanner;

public class ContasFamiliares {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Double contaMes = 0.0;
		
		System.out.println("Informe o valor da conta de luz para o m�s atual: ");
		Double contaLuz = sc.nextDouble();
		contaMes += contaLuz;
		
		System.out.println("Informe o valor da conta de �gua para o m�s atual: ");
		Double contaAgua = sc.nextDouble();
		contaMes += contaAgua;
		
		System.out.println("Informe o valor da conta de telefone para o m�s atual: ");
		Double contaTelefone = sc.nextDouble();
		contaMes += contaTelefone;
		
		System.out.println("Informe o valor da conta de internet para o m�s atual: ");
		Double contaInternet = sc.nextDouble();
		contaMes += contaInternet;
		System.out.println("Contas do m�s atual R$: " + contaMes);
		
		System.out.println();
		
		System.out.println("Informe o sal�rio do m�s atual: ");
		Double salario = sc.nextDouble();
		
		Double sobraSalario = salario - contaMes;
		System.out.println("Sobrou em conta R$: " + sobraSalario);
		
		sc.close();
	}
}
