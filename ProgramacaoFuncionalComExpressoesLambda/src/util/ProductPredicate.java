package util;

import java.util.function.Predicate;

import entities.Product;

public class ProductPredicate implements Predicate<Product>{

	@Override
	public boolean test(Product prod) {
		return prod.getPrice() >= 100.0;
	}
}
