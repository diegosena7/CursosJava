import java.util.Locale;
import java.util.Scanner;

public class UsandoScanner {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);//Lendo dados através do teclado
		
		int x;
		x = sc.nextInt();
		
		double y;
		y = sc.nextDouble();
		
		char z;
		z = sc.next().charAt(0);
				
		System.out.println("Você digitou: " + x);
		System.out.println("Você digitou: " + y);
		System.out.println("Você digitou: " + z);
		
		sc.close();
	}

}
