import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 10.35784;
		String nome = "Diego";
		int idade = 31;
		double renda = 4000.0;
		
		Locale.setDefault(Locale.US);//Insere ponto ao inv�s da v�rgula na separa��o de valores
		System.out.println("Ol�,mundo... Sem maldi��o!!!");
		System.out.println("Bom dia bb!!!");
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x);//Imprime a vari�vel x com 2 casas decimais e arredonda o valor
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);//Usando marcadores de vari�veis
		
		
	}
	
}
