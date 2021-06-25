package application;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * Representa um conjunto de elementos (similar ao da Álgebra)
• Não admite repetições
• Elementos não possuem posição e nem ordenação
• Acesso, inserção e remoção de elementos são rápidos
• Oferece operações eficientes de conjunto: interseção, união, diferença.
• Principais implementações:
• HashSet - mais rápido (operações O(1) em tabela hash) e não ordenado
• TreeSet - mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado pelo
compareTo do objeto (ou Comparator)
• LinkedHashSet - velocidade intermediária e elementos na ordem em que são adicionados
 */
public class ExecutaSet {

	public static void main(String[] args) {
		
		Set<String> hashSet = new HashSet<>();
		Set<String> treeSet = new TreeSet<>();
		Set<String> linkedHashSet = new LinkedHashSet<>();
		
		hashSet.add("TV");
		hashSet.add("Notebook");
		hashSet.add("Tablet");
		
		treeSet.add("Diego");
		treeSet.add("Nayara");
		treeSet.add("Ryan");
		treeSet.add("Ted");
		treeSet.remove("Ted");//remove o elemento informado da lista
		
		linkedHashSet.add("Jeff");
		linkedHashSet.add("Maricato");
		linkedHashSet.add("André");
		linkedHashSet.add("Ana Paula");
		linkedHashSet.removeIf(l -> l.charAt(0) == 'M');//remove o elemento que inicia com M
		
		System.out.println("Contém Notebook na lista HashSet? " + hashSet.contains("Notebook"));
		System.out.println();
		System.out.println("Usando o Set... ");
				
		for (String p : hashSet) {
			System.out.println("Set: " +p);
		}
		
		System.out.println();
		System.out.println("Usando o TreeSet... ");
		
		for (String t : treeSet) {
			System.out.println("TreeSet: " + t);
		}
		
			System.out.println();
			System.out.println("Usando o LinkedHashSet... ");
		
		for (String l : linkedHashSet) {
			System.out.println("LinkedHashSet: " + l);
		}
	}
}