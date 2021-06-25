import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LendoArquivosComFile {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\dssena\\Desktop\\SALVA-VIDAS\\Queries\\queryResumoPorLoja_UF.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}
