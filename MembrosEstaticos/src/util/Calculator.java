package util;

public class Calculator {
/*A palavra final diz que o valor atribuibo não poderá ser alterado uma constante deve ser em letras maiúsculas */
	
	public static final double PI = 3.141159;
	
	//Método responsável por calcular a circunferência
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	//Método responsável por calcular o volume
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3;
	}
}
