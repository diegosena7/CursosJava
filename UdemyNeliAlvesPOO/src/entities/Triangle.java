package entities;

public class Triangle {

	//Atributos
	public double a;
	public double b;
	public double c;
	
	//M�todo respons�vel pelo c�lculo da �rea
	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));		
	}
}
