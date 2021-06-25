import java.util.Scanner;

public class RetornaDivisoresEstruturaFor {

	public static void main(String[] args) {
		// Ler um número inteiro N e calcular todos os seus divisores.
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for(int i = 1; i <= x; i ++) {
			if(x % i == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}
