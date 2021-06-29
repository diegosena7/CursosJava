package exercicios;

import java.util.Scanner;

/*
 * Nesta classe estamos calculando o fatorial de um n�mero informadopelo usu�rio usando recursividade
 * Fatorial:Soma dos valores positivos menores que o n�mero informado como par�mtro
 * Recursividade: Fun��o que chama ela mesma 
 */ 
public class FatorialRecursivo {

	public static void main(String[] args) {
		System.out.println("Informe o n�mero para calcularmos o fatorial: ");
		Scanner sc = new Scanner(System.in);
		Integer num = sc.nextInt();
		
		System.out.println(calculaFatorialRecursivo(num));
		
		sc.close();
	}
	
	public static Integer calculaFatorialRecursivo(Integer num) {
		if (num == 0 || num < 0) {
			System.out.println("Informe um n�mero maior que 0.");
			return 1;
		}else {
			return num * calculaFatorialRecursivo(num - 1); 
		}
	}
}
