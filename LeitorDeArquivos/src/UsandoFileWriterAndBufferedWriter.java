import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Nesta classe usamos as classes FileWriter e BufferedWriter para escrever um arquivo,
 * instanciamos no bloco try a classe BufferedReader e em seu construtor instanciamos
 * a classe FileReader recebendo em seu construtor o caminho do arquivo como parâmetro
 * o BufferedWriter é usado para que a criação do arquivo seja de forma mais rápida
 * e flexível. Usamos o método write para criar a escrita do arquivo e o método newLine
 * para uma quebra de linha.
 * Usamos o forEach para percorrer as linhas a serem inseridas no arquivo.
 * Cria/recria o arquivo: new FileWriter(path)
 * Acrescenta ao arquivo existente: new FileWriter(path, true)
 */
public class UsandoFileWriterAndBufferedWriter {

	public static void main(String[] args) throws IOException {

		String[] lines = new String[] { "Good morning", "Good afternoon", "Good night", "DSENA7" };
		String path = "C:\\Users\\dssena\\Desktop\\Pessoal\\dsenaTest.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for (String line : lines) {
				bw.write(line);
				bw.newLine();//quebra de linha
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}