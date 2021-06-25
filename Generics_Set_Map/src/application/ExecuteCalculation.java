package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;
import services.CalculationService;
/*
 * Nesta classe estamos lendo os dados de um arquivo e armazenando em uma lista de produtos
 * Usamos o método max da classe CalculationService para encontrar e retornar o produto com
 * maior valor na lista.
 */
public class ExecuteCalculation {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		List<Product> list = new ArrayList<>();
		String path = "C:\\Users\\dssena\\Desktop\\Dsena_Cursos\\Cursos\\Curso_DevSuperior_Java\\Java_Completo\\generics.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			Product x = CalculationService.max(list);
			System.out.println("Highest value product: " + x);
		}catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
