public class FuncoesParaStrings {
	public static void main(String[] args) {
		
		String nome = "Diego SENA";
		String lower = nome.toLowerCase();//Transforma a string em minúscula
		String upper = nome.toUpperCase();//Transforma a string em maiúscula
		String trim = nome.trim();//Elimina espaços em brancos no ínicio e fim de uma string
		String substring = nome.substring(2);//pega uma parte de uma string passado como parâmetro
		String substring2 = nome.substring(2, 7);//pega uma parte de uma string passado como parâmetro
		String replace = nome.replace('D', 'T');//susbtitui caracteres
		String replace2 = nome.replace("Die", "Tchie");//susbtitui caracteres substring
		int indexOf = nome.indexOf("e");//Recebe o índice do array
		int lastIndexOf = nome.lastIndexOf("E");//Recebe o último índice do array
		
		//Separando as strings
		String splitTest = "Diego da Silva Sena";
		String [] vet = splitTest.split(" ");
		
		System.out.println("Nome: " + nome);
		System.out.println("Nome com lower case: " + lower);
		System.out.println("Nome com upper case: " + upper);
		System.out.println("Nome com trim: " + trim);
		System.out.println("Nome com substring: " + substring);
		System.out.println("Nome com substring: " + substring2);
		System.out.println("Nome com replace: " + replace);
		System.out.println("Nome com replace2: " + replace2);
		System.out.println("Nome com indexOf: " + indexOf);
		System.out.println("Nome com lastIndexOf: " + lastIndexOf);
		System.out.println("Usando a função split: " + vet[0]);
		System.out.println("Usando a função split: " + vet[1]);
		System.out.println("Usando a função split: " + vet[2]);
		System.out.println("Usando a função split: " + vet[3]);
	}
}
