package aplication;

import java.util.Scanner;

/*Fazer um programa para ler um número inteiro N e uma matriz de ordem N contendo números inteiros.
Em seguida, mostrar a diagonal principal, os números negativos da matriz e a quantidade de valores negativos da matriz.*/

public class ExibeDiagonalComMatriz {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número para linhas e colunas da matriz: ");
		int n = sc.nextInt();
		int[][] matriz = new int[n][n];//Criando uma matriz de N por N

		System.out.println("Digite os números a serem inseridos na matriz: ");
		for(int i = 0; i < matriz.length; i++){//Percorre as linhas da matriz
			
			for (int j = 0; j < matriz[i].length; j++) {//Percorre as colunas da matriz
				matriz[i][j] = sc.nextInt();
			}
		}
		
		//Imprime a diágonal principal
		System.out.println("Diagonal principal: ");
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(matriz[i][i] + " ");
		}
		
		//Imprime os números negativos na matriz, utiliza um contador para somar cada número negativo encontrado
		int contador = 0;
		for(int i = 0; i < matriz.length; i ++) {//Percorre as linhas da matriz
			for (int j = 0; j < matriz[i].length; j++) {//Percorre as colunas da matriz
				if (matriz[i][j] < 0) {
					contador ++;
				}
				if (matriz[i][j] < 0) {
					System.out.println("Números negativos na matriz = " + matriz[i][j]);
				}
			}
		}
		System.out.println("Quantidade de números negativos = " + contador);
		sc.close();
	}
}
