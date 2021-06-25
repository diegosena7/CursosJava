package application;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class ExercicioProducts {

	public static void main(String[] args) throws Exception {
		// Ler N dados de produtos e retornar o preço dos produtos

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> list = new ArrayList<>();

		System.out.println("Enter the number of products: ");
		int numProducts = sc.nextInt();

		// Lista de produtos

		for (int i = 1; i <= numProducts; i++) {
			System.out.println("Product #" + i + "data: ");
			System.out.println("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);

			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.println("Price: ");
			double price = sc.nextDouble();

			if (ch == 'c') {
				list.add(new Product(name, price));
			} else if (ch == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());
				list.add(new UsedProduct(name, price, date));
			} else {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			}
		}
		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product prod : list) {
			System.out.println(prod.priceTag());
		}

		sc.close();
	}
}
