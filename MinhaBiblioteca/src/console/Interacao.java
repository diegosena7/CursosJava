package console;

import java.util.Scanner;

public class Interacao {

	Scanner sc = new Scanner (System.in);
	
	public Integer lerNumero(String texto) {
		System.out.println(texto);
		return sc.nextInt();
	}
	
	public Integer lerDecimal(String texto) {
		System.out.println(texto);
		return sc.nextInt();
	}
	
	public Integer lerLinha(String texto) {
		System.out.println(texto);
		return sc.nextInt();
	}
	
	public void fechar () {
		sc.close();
	}
	
	public void imprimir (String texto) {
		System.out.println(texto);
	}
	
	public void erro (String texto) {
		System.err.println(texto);
	}
}
