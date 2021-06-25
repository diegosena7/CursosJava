package application;
import java.util.Map;
import java.util.TreeMap;
/*
 * • Map é uma coleção de pares chave / valor
• Não admite repetições do objeto chave
• Os elementos são indexados pelo objeto chave (não possuem posição)
• Acesso, inserção e remoção de elementos são rápidos
• Uso comum: cookies, local storage, qualquer modelo chave-valor
• Principais implementações:
• HashMap - mais rápido (operações O(1) em tabela hash) e não ordenado
• TreeMap - mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado pelo
compareTo do objeto (ou Comparator)
• LinkedHashMap - velocidade intermediária e elementos na ordem em que são adicionados
 */
public class UsandoMap {

	public static void main(String[] args) {
		
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Diego");//inserindo
		cookies.put("email", "diego@gmail.com");//inserindo
		cookies.put("telefone", "99771122");//inserindo
//		cookies.remove("email");//removendo
		cookies.put("telefone", "99771133");//alterando
		
		cookies.clear();//limpa os valores
		
		cookies.put("username", "DiegoSena");//inserindo
		cookies.put("email", "diegoSena@gmail.com");//inserindo
		cookies.put("telefone", "9090096966");//inserindo
//		cookies.remove("email");//removendo
		cookies.put("telefone", "997768608655");//alterando
		
		System.out.println("Values: " + cookies.values());
		System.out.println("Contém 'telefone' como chave? " + cookies.containsKey("telefone"));
		System.out.println("Número do telefone: " + cookies.get("telefone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Tamanho: " + cookies.size());
		System.out.println("ALL COOKIES:");
		
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
	}
}
