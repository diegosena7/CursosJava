package exercicios;

import java.util.Scanner;

/*
 * Nesta classe estamos calculando o fatorial de um número informadopelo usuário usando recursividade
 * Fatorial:Soma dos valores positivos menores que o número informado como parâmtro
 * Recursividade: Função que chama ela mesma 
 */ 
public class FatorialRecursivo {

	public static void main(String[] args) {
		System.out.println("Informe o número para calcularmos o fatorial: ");
		Scanner sc = new Scanner(System.in);
		Integer num = sc.nextInt();
		
		System.out.println(calculaFatorialRecursivo(num));
		
		sc.close();
	}
	
	public static Integer calculaFatorialRecursivo(Integer num) {
		if (num == 0 || num < 0) {
			System.out.println("Informe um número maior que 0.");
			return 1;
		}else {
			return num * calculaFatorialRecursivo(num - 1); 
		}
	}
}
