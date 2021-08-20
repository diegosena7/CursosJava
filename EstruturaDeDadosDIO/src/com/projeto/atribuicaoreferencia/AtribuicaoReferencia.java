package com.projeto.atribuicaoreferencia;

/*
 * Ao usarmos um tipo primitivo o Java usa como referência o valor em memória, por isso o valor de intB não é alterado
 * quando o valor de intA passa a ser 5.
 * 
 * Ao usarmos um objeto o Java usa como referência o endereço em memória, por isso o valor de objB recebe o mesmo valor
 * do objA após esse mesmo ter sido alterado.
 */
public class AtribuicaoReferencia {

	public static void main(String[] args) {

		int intA = 1;
		int intB = intA;

		System.out.println("intA = " + intA);
		System.out.println("intB = " + intB);

		System.out.println("--------------------------------");

		intA = 5;

		System.out.println("intA = " + intA);
		System.out.println("intB = " + intB);

		System.out.println("--------------------------------");

		AtribuicaoRefObj objA = new AtribuicaoRefObj(1);
		AtribuicaoRefObj objB = objA;

		System.out.println("objA = " + objA);
		System.out.println("objB = " + objB);

		System.out.println("--------------------------------");

		objA.setNum(5);

		System.out.println("objA = " + objA);
		System.out.println("objB = " + objB);
	}
}
