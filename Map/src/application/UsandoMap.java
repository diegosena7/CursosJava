package application;
import java.util.Map;
import java.util.TreeMap;
/*
 * � Map � uma cole��o de pares chave / valor
� N�o admite repeti��es do objeto chave
� Os elementos s�o indexados pelo objeto chave (n�o possuem posi��o)
� Acesso, inser��o e remo��o de elementos s�o r�pidos
� Uso comum: cookies, local storage, qualquer modelo chave-valor
� Principais implementa��es:
� HashMap - mais r�pido (opera��es O(1) em tabela hash) e n�o ordenado
� TreeMap - mais lento (opera��es O(log(n)) em �rvore rubro-negra) e ordenado pelo
compareTo do objeto (ou Comparator)
� LinkedHashMap - velocidade intermedi�ria e elementos na ordem em que s�o adicionados
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
		System.out.println("Cont�m 'telefone' como chave? " + cookies.containsKey("telefone"));
		System.out.println("N�mero do telefone: " + cookies.get("telefone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Tamanho: " + cookies.size());
		System.out.println("ALL COOKIES:");
		
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
	}
}
