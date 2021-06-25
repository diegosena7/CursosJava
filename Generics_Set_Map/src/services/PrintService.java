package services;

import java.util.ArrayList;
import java.util.List;
/*
 * Generics permitem que classes, interfaces e métodos possam ser parametrizados por tipo. Seus benefícios são:
 * • Reuso
 * • Type safety (Segurança do tipo)
 * • Performance
 */
public class PrintService<TypeParamater> {
	private List<TypeParamater> list = new ArrayList<>();
	
	public void addValue(TypeParamater value) {
		list.add(value);
	}
	
	public TypeParamater firstElement() {
		if (list.isEmpty()) {
			throw new IllegalStateException("Lista is empty"); 
		}else {
			return list.get(0);
		}
	}
	
	public void printElements() {
		System.out.print("[");
		if (!list.isEmpty()) {
			System.out.print(list.get(0));
		}
		for (int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println("]");
		System.out.println("Number of elements in the list: " + list.size());
	}
}
