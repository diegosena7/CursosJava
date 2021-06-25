package exercicios;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class NomeSobrenomePessoa {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o seu nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Entre com seu sobrenome: ");
		String sobrenome = sc.nextLine();
		
		System.out.println("O nome e sobrenome digitado é: " + nome + " " + sobrenome);
	}
}
