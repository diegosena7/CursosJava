package exercicios;
/*
 * Dada a lista de números abaixo:
Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
... Itere por essa lista e imprima todos os números que são divisíveis por 3.
 */
public class IterandoNumerosComEstruturaFor {
	public static void main(String[] args) {

		Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		System.out.println("Iniciou...");
		int i = 0;
		while (i < numeros.length) {
			if (numeros[i] % 3 == 0) {
				System.out.println("Números divisiveis por 3 = " + numeros[i]);
			}
			i++;
		}
	}
}
