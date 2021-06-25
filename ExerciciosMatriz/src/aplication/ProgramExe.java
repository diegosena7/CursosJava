package aplication;

import java.util.Scanner;

public class ProgramExe {

	public static void main(String[] args) {
	
//		Fazer um programa para ler dois números inteiros M e N, e depois ler
//		uma matriz de M linhas por N colunas contendo números inteiros,
//		podendo haver repetições. Em seguida, ler um número inteiro X que
//		pertence à matriz. Para cada ocorrência de X, mostrar os valores à
//		esquerda, acima, à direita e abaixo de X, quando houver, conforme
//		exemplo.

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int y= sc.nextInt();
		int[][] matriz = new int[n][y];// Criando uma matriz
		
		for (int i = 0; i < matriz.length; i++) {// for percorrendo a linha matriz
			for (int j = 0; j < matriz[i].length; j++) {// for percorrendo a coluna matriz
				matriz[i][j] = sc.nextInt();
			}
		}
		
		int x = sc.nextInt();

		for (int i=0; i<matriz.length; i++) {// for percorrendo a linha matriz
			for (int j=0; j<matriz[i].length; j++) {// for percorrendo a coluna matriz
				if (matriz[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + matriz[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + matriz[i-1][j]);
					}
					if (j < matriz[i].length-1) {
						System.out.println("Right: " + matriz[i][j+1]);
					}
					if (i < matriz.length-1) {
						System.out.println("Down: " + matriz[i+1][j]);
					}
				}
			}
		}
		
		sc.close();
	}
}
