package services;

import java.util.List;

public class CalculationService {

	public static <TypeGenericis extends Comparable<TypeGenericis>> TypeGenericis max(List<TypeGenericis> list) {
		if (list.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
		}
		TypeGenericis max = list.get(0);
		for (TypeGenericis item : list) {//Verifica se um objeto é maior que o outro, no caso se item é maior que max
			if (item.compareTo(max) > 0) {
				max = item;
			}
		}//retorna o maior elemento na lista
		return max;
	}
}
