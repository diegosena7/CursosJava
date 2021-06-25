package application;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Nesta classe estamos trabalhando com a estrutura try/catch, que s�o usadas pata tratamento de erros
 * o bloco try contem o c�digo que representa a execu��o normal no trecho de c�digo e o bloco catch contem
 * o c�digo que ser� executado caso uma exce��o ocorra e deve ser espec�ficado o tipo da exce��o a ser
 * tratada.
 * Usamos o m�todo printStackTrace dentro do cacth, este m�todo tra�s toda a pilha de chamada dos m�todos
 * que causaram a exce��o no nossa aplica��o.
 */
public class ExecutaTryCatch {

	public static void main(String[] args) {

		method1();
		System.out.println("Fim do programa...");
	}

	public static void method1() {
		System.out.println("#### METHOD1 START ####");
		
		method2();
		
		System.out.println("#### METHOD1 END ####");
	}
	
	public static void method2() {
		System.out.println("#### METHOD2 START ####");
		Scanner sc = new Scanner(System.in);
		try {
			String[] vect = sc.nextLine().split(" - ");// L� v�rios dados na mesma linha sepadarados por -
			int position = sc.nextInt();
			System.out.println(vect[position]);// Retorna a posi��o no vetor
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posi��o do vetor inv�lida...");
			e.printStackTrace();
			sc.next();
		} catch (InputMismatchException e) {
			System.out.println("Favor digitar um n�mero para dar continuidade ao programa...");
		}
		sc.close();
		System.out.println("#### METHOD2 END ####");
	}
}
