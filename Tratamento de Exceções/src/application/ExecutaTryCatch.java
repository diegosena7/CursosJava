package application;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Nesta classe estamos trabalhando com a estrutura try/catch, que são usadas pata tratamento de erros
 * o bloco try contem o código que representa a execução normal no trecho de código e o bloco catch contem
 * o código que será executado caso uma exceção ocorra e deve ser específicado o tipo da exceção a ser
 * tratada.
 * Usamos o método printStackTrace dentro do cacth, este método traás toda a pilha de chamada dos métodos
 * que causaram a exceção no nossa aplicação.
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
			String[] vect = sc.nextLine().split(" - ");// Lê vários dados na mesma linha sepadarados por -
			int position = sc.nextInt();
			System.out.println(vect[position]);// Retorna a posição no vetor
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição do vetor inválida...");
			e.printStackTrace();
			sc.next();
		} catch (InputMismatchException e) {
			System.out.println("Favor digitar um número para dar continuidade ao programa...");
		}
		sc.close();
		System.out.println("#### METHOD2 END ####");
	}
}
