package application;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * Representa um conjunto de elementos (similar ao da �lgebra)
� N�o admite repeti��es
� Elementos n�o possuem posi��o e nem ordena��o
� Acesso, inser��o e remo��o de elementos s�o r�pidos
� Oferece opera��es eficientes de conjunto: interse��o, uni�o, diferen�a.
� Principais implementa��es:
� HashSet - mais r�pido (opera��es O(1) em tabela hash) e n�o ordenado
� TreeSet - mais lento (opera��es O(log(n)) em �rvore rubro-negra) e ordenado pelo
compareTo do objeto (ou Comparator)
� LinkedHashSet - velocidade intermedi�ria e elementos na ordem em que s�o adicionados
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
		linkedHashSet.add("Andr�");
		linkedHashSet.add("Ana Paula");
		linkedHashSet.removeIf(l -> l.charAt(0) == 'M');//remove o elemento que inicia com M
		
		System.out.println("Cont�m Notebook na lista HashSet? " + hashSet.contains("Notebook"));
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