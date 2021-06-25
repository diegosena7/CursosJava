package aplication;

import java.util.Scanner;

public class Teste {

	/*
	 * Lê 2 números inteiros M e N, depois lê uma matri de M linhas por N colunas, lê um inteiro X que pertence a matriz.
	 * Para cada X mostra os valores em cima, a direita, esquerda e embaixo.
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número de linhas da matriz: ");
		int n = sc.nextInt();
		System.out.println("Digite o número de colunas da matriz: ");
		int m = sc.nextInt();
		
		int [][] matriz = new int [n][m];//Instanciando a matriz
		
		System.out.println("Digite os valores a serem inseridos na matriz");
		
		for (int i = 0; i < matriz.length; i++) {//Linhas da matriz
			for (int j = 0; j < matriz[i].length; j++) {//Coluas da matriz
				matriz[i][j] = sc.nextInt();
			}
		}
		
		int x = sc.nextInt();
		
		for (int i = 0; i < matriz.length; i++) {//Linhas da matriz
			for (int j = 0; j < matriz[i].length; j++) {//Colunas da matriz
				if (matriz[i][j] == x) {
					System.out.println("Posição: " + i + ", " + j + ": ");
					if (j > 0) {
						System.out.println("Esquerda: " + matriz[i] [j - 1]);
					}
					if (i > 0) {
						System.out.println("Cima: " + matriz[i - 1] [j]);
					}
					if (j < matriz[i].length - 1) {
						System.out.println("Direita: " );
					}
					if (i < matriz.length - 1) {
						System.out.println("Baixo: " + matriz[i + 1] [j]);
					}
				}
			}
		}
		sc.close();
	}
}
