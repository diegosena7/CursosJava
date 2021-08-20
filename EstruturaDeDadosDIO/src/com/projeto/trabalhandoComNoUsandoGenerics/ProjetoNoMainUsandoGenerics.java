package com.projeto.trabalhandoComNoUsandoGenerics;

/*
 * Estamos usando nesta classe encadeamento de nós, onde no1 aponta pro no2 e assim consecutivamente
 * Estamos usando tipos genéricos em nossos objetos, onde não declaramos na classe ProjetoNoUsandoGenerics
 * informamos que o tipo dos nossos objetos serão "curingas" ao usarmos o ProjetoNoUsandoGenerics<T>
 */
public class ProjetoNoMainUsandoGenerics {

	public static void main(String[] args) {
		
		ProjetoNoUsandoGenerics <String> no1 = new ProjetoNoUsandoGenerics<> ("Conteúdo nó 1");
		ProjetoNoUsandoGenerics <String> no2 = new ProjetoNoUsandoGenerics<> ("Conteúdo nó 2");
		
		no1.setProximoNo(no2);
		
		ProjetoNoUsandoGenerics <String> no3 = new ProjetoNoUsandoGenerics<> ("Conteúdo nó 3");
		no2.setProximoNo(no3);
		
		ProjetoNoUsandoGenerics <String> no4 = new ProjetoNoUsandoGenerics<> ("Conteúdo nó 4");
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
