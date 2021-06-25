import java.util.Scanner;

public class TesteBitABit {
	public static void main(String[] args) {
//Fazendo verificação bit a bit
		Scanner sc = new Scanner(System.in);
		
		int mask = 32;
		int n = sc.nextInt();
		
		if ((n & mask) != 0) {
			System.out.println("O sexto bit é verdadeiro");
		}else {
			System.out.println("O sexto bit é falso");
		}
	}
}
