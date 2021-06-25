package util;

public class Calculator {
/*A palavra final diz que o valor atribuibo n�o poder� ser alterado uma constante deve ser em letras mai�sculas */
	
	public static final double PI = 3.141159;
	
	//M�todo respons�vel por calcular a circunfer�ncia
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	//M�todo respons�vel por calcular o volume
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3;
	}
}
