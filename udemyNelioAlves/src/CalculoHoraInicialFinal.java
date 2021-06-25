import java.util.Scanner;

public class CalculoHoraInicialFinal {

	public static void main(String[] args) {
//		Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//		começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
		
		Scanner sc = new Scanner(System.in);

		int horaInicial;
		int horaFinal;
		int duracaoJogo;
		
		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		
		if(horaInicial < horaFinal) {
			duracaoJogo = horaFinal - horaInicial;
				
		}
		else {
			duracaoJogo = horaInicial + horaFinal;
		}
		
		System.out.println("A duração do jogo foi de: " + duracaoJogo + " hora(s).");

		sc.close();
	}

}
