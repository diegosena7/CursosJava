import java.io.File;
import java.util.Scanner;

/*
 * Nesta classe usamos os m�todos de busca de informa��es de um arquivo
 * getName retorna o nome do arquivo, getParent retorna o caminho do arquivo
 * e o m�todo getPath tr�s o caminho relativo do arquico.
 * Temos outros m�todos que podem ser utilizados...
 */
public class ObtemInformacoesDoArquivo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o caminho do arquivo: ");
		String arquivoInfos = sc.nextLine();
		
		File path = new File(arquivoInfos);	
		
		System.out.println("Nome: " + path.getName());
		System.out.println("Caminho: " + path.getParent());
		System.out.println("Caminho todo: " + path.getPath());
		System.out.println("Teste: " + path.getUsableSpace());
		
		sc.close();
	}
}
