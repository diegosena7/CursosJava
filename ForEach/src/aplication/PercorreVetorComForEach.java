package aplication;

public class PercorreVetorComForEach {

	public static void main(String[] args) {
		// Percorrendo coleções com ForEach
		
		String[] vect = new String[] {"Diego", "Ryan", "Nayara"};
		
		for(String obj : vect) {//Usando o ForEach imprime o valor contido no apelido obj
			System.out.println(obj);
		}
		
		System.out.println("---------------------------------------");
		
		for(int i = 0; i < vect.length; i++) {//Usando o For comum
			System.out.println(vect[i]);
		}
	}
}
