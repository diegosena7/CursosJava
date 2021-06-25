import java.util.Scanner;

public class CalculaValorConta {

	public static void main(String[] args) {
//		Escreva um programa que leia o c�digo de um item e a quantidade deste item. A
//		seguir, calcule e mostre o valor da conta a pagar.

		Scanner sc = new Scanner(System.in);
		
		int codigoItem;
		int qtidadeItem;
		double valorConta = 0;
		
		codigoItem = sc.nextInt();
		qtidadeItem = sc.nextInt();
		
		if(codigoItem > 5) {
			System.out.println("C�digo de item inv�lido, digite um c�digo de 1 a 5 para um produto v�lido");
		}
		else if(codigoItem == 1) {
			valorConta = qtidadeItem * 4.00;
		}
		else if(codigoItem == 2) {
			valorConta = qtidadeItem * 4.50;
		}
		else if(codigoItem == 3) {
			valorConta = qtidadeItem * 5.00;
		}
		else if(codigoItem == 4) {
			valorConta = qtidadeItem * 2.00;
		}
		else if(codigoItem == 5) {
			valorConta = qtidadeItem * 1.50;
		}
		System.out.printf("Total: R$ %.2f%n", valorConta);
		sc.close();
	}
}
