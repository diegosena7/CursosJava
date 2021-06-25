package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Funcionario;

/* Fazer um programa para ler um n�mero inteiro N e depois os dados (id, nome e salario) de  N funcion�rios.
N�o deve haver repeti��o de id. Em seguida, efetuar o aumento de X por cento no sal�rio de um determinado  funcion�rio.
Para isso, o programa deve ler um id e o valor X. Se o id informado n�o existir, mostrar uma mensagem e abortar a opera��o.
Ao final, mostrar a listagem atualizada dos funcion�rios.*/
public class FuncionarioLista {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Funcionario> lista = new ArrayList<>();
		
		System.out.println("Quantos funcion�rios ser�o registrados? ");
		int n = sc.nextInt();
		
		//Percorre o n�mero de funcion�rios
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Funcion�rio # " + ( i + 1) + " :");
			
			System.out.print("Digite o id do funcion�rio: ");
			Integer id = sc.nextInt();
			while (posicaoId(lista, id)) {//Enquanto houver id igual ao j� inserido o usu�rio n�o consegue prosseguir
				System.out.println("Esse id j� existe na base de dados, insira um id diferente.");
			}
			
			System.out.println("Digite o nome do colaborador: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.println("Digite o sal�rio do colaborador: ");
			double salario = sc.nextDouble();
			
			//Instancia um objeto do tipo Funcion�rio com os argumentos
			Funcionario funcionario = new Funcionario(id, nome, salario);
			
			//Seta um funcionario na lista
			lista.add(funcionario);
		}
		
		System.out.println();
		System.out.println("Informe qual o id do funcion�rio que ter� aumento de sal�rio");
		int idFuncionario = sc.nextInt();
		//Integer posicao = posicaoId(lista, idFuncionario);//Recebe a posi��o do sal�rio na lista de funcion�rios
		
		//Recebe a posi��o a posi��o do id se for diferente de null
		Funcionario funcionario = lista.stream().filter(x -> x.getId() == idFuncionario).findFirst().orElse(null);
		
		//Se o id fornecido for diferente de null calcula o percentual de aumento, se n�o, manda msg ao usu�rio.
		if (funcionario != null) {
			System.out.println("Entre com a porcentagem: ");
			double porcentagem = sc.nextDouble();
			//lista.get(idFuncionario).increaseSalary(porcentagem);
			funcionario.increaseSalary(porcentagem);
		}else {
			System.out.println("Esse id n�o existe!!!");
		}
		
		System.out.println();
		System.out.println("Lista de funcion�rios: ");
		
		//Pra cada funcion�rio na minha lista de funcion�rios, imprime o funcion�rio.
		for (Funcionario func : lista) {
			System.out.println(func);
		}
		sc.close();
	}
	
	//Percorre a lista e retorna a posi��o do id na lista, se n�o achar retorna null
	public static boolean posicaoId(List<Funcionario> lista, int idFuncionario) {
		Funcionario funcionario = lista.stream().filter(x -> x.getId() == idFuncionario).findFirst().orElse(null);
		return funcionario != null;
	}
}
