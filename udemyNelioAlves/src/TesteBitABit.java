import java.util.Scanner;

public class TesteBitABit {
	public static void main(String[] args) {
//Fazendo verifica��o bit a bit
		Scanner sc = new Scanner(System.in);
		
		int mask = 32;
		int n = sc.nextInt();
		
		if ((n & mask) != 0) {
			System.out.println("O sexto bit � verdadeiro");
		}else {
			System.out.println("O sexto bit � falso");
		}
	}
}
