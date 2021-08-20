package com.projeto.trabalhandoComNo;

/*
 * Estamos usando nesta classe encadeamento de nós, onde no1 aponta pro no2 e assim consecutivamente
 */
public class ProjetoNoMain {

	public static void main(String[] args) {
		
		ProjetoNo no1 = new ProjetoNo("Conteúdo nó 1");
		ProjetoNo no2 = new ProjetoNo("Conteúdo nó 2");
		
		no1.setProximoNo(no2);
		
		ProjetoNo no3 = new ProjetoNo("Conteúdo nó 3");
		no2.setProximoNo(no3);
		
		ProjetoNo no4 = new ProjetoNo("Conteúdo nó 4");
		no3.setProximoNo(no4);
		
		System.out.println(no1);
		System.out.println(no2);
		System.out.println(no3);
		System.out.println(no4);
		
		System.out.println("----------------------------------");
		
		System.out.println(no1);
		System.out.println(no1.getProximoNo());
		System.out.println(no1.getProximoNo().getProximoNo());
		System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
		System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
	}
}
