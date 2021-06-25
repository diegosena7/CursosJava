import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * Nesta classe usamos as classes FileReader e BufferedReader para leitura do arquivo,
 * instanciamos no bloco try a classe BufferedReader e em seu construtor instanciamos
 * a classe FileReader recebendo em seu construtor o caminho do arquivo como parâmetro
 * o BufferedReader é usado para que a leitura do arquivo seja de forma mais rápida
 * e flexível. Usamos o método readLine para ler as linhas do arquivo, caso não tenha
 * linhas a serem lidas, o método retorna nulo. Fazemos um while para percorrer e ler
 * as linhas enquanto tiver linhas a serem lidas no arquivo.
 */
public class UsandoBlocoTryWithResources {

	public static void main(String[] args) {

		String path = "C:\\Users\\dssena\\Desktop\\SALVA-VIDAS\\Queries\\queryResumoPorLoja_UF.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}