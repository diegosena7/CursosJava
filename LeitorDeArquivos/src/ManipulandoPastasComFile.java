import java.io.File;
import java.util.Scanner;

/*
 * Nesta classe estamos manipulando pastas com a classe File, usamos reference method para listar
 * os diretórios em um array com o método listFiles e isDirectory.
 * Usamos reference method para listar os arquivos em um vetor através do método  listFiles e isFile.
 * Criamos uma pasta no diretório informado na variável pasta usando o método mkdir da classe File.
 */
public class ManipulandoPastasComFile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com a pasta: ");
		String pasta = sc.nextLine();
		
		File path = new File(pasta);
		
		File[] pastas = path.listFiles(File::isDirectory);
		
		System.out.println("PASTAS: ");
		
		for (File diretorio : pastas) {
			System.out.println(diretorio);
		}
		
		System.out.println("ARQUIVOS: ");
		File[] files = path.listFiles(File::isFile);
		for (File arquivo : files) {
			System.out.println(arquivo);
		}
		
		boolean deuCerto = new File (pasta + "\\subdir").mkdir();//cria pasta
		System.out.println("Diretório criado com sucesso: " + deuCerto);
		
		sc.close();
	}
}
