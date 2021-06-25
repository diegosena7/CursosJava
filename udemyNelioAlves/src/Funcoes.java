import java.util.Scanner;

public class Funcoes {
//Retorna o maior número entre os 3 informados
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite 3 números...");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maior = max(a, b, c);
		
		resultado(maior);
		
		sc.close();
	}
	
	//Função de cálculo que recebe 3 números inteiros como parâmetro
	public static int max(int num1, int num2, int num3) {
		
		int auxilio;
		
		if (num1 > num2 && num1 > num3) {
			auxilio = num1;
		}else if (num2 > num3) {
			auxilio = num2;
		}else {
			auxilio = num3;
		}
		return auxilio;
	}
	
	//Função de retorno do resultado
	public static void resultado(int result) {
		System.out.println("Maior = " + result);
	}
}
