package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Funcionario;

/* Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de  N funcionários.
Não deve haver repetição de id. Em seguida, efetuar o aumento de X por cento no salário de um determinado  funcionário.
Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma mensagem e abortar a operação.
Ao final, mostrar a listagem atualizada dos funcionários.*/
public class FuncionarioLista {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Funcionario> lista = new ArrayList<>();
		
		System.out.println("Quantos funcionários serão registrados? ");
		int n = sc.nextInt();
		
		//Percorre o número de funcionários
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Funcionário # " + ( i + 1) + " :");
			
			System.out.print("Digite o id do funcionário: ");
			Integer id = sc.nextInt();
			while (posicaoId(lista, id)) {//Enquanto houver id igual ao já inserido o usuário não consegue prosseguir
				System.out.println("Esse id já existe na base de dados, insira um id diferente.");
			}
			
			System.out.println("Digite o nome do colaborador: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.println("Digite o salário do colaborador: ");
			double salario = sc.nextDouble();
			
			//Instancia um objeto do tipo Funcionário com os argumentos
			Funcionario funcionario = new Funcionario(id, nome, salario);
			
			//Seta um funcionario na lista
			lista.add(funcionario);
		}
		
		System.out.println();
		System.out.println("Informe qual o id do funcionário que terá aumento de salário");
		int idFuncionario = sc.nextInt();
		//Integer posicao = posicaoId(lista, idFuncionario);//Recebe a posição do salário na lista de funcionários
		
		//Recebe a posição a posição do id se for diferente de null
		Funcionario funcionario = lista.stream().filter(x -> x.getId() == idFuncionario).findFirst().orElse(null);
		
		//Se o id fornecido for diferente de null calcula o percentual de aumento, se não, manda msg ao usuário.
		if (funcionario != null) {
			System.out.println("Entre com a porcentagem: ");
			double porcentagem = sc.nextDouble();
			//lista.get(idFuncionario).increaseSalary(porcentagem);
			funcionario.increaseSalary(porcentagem);
		}else {
			System.out.println("Esse id não existe!!!");
		}
		
		System.out.println();
		System.out.println("Lista de funcionários: ");
		
		//Pra cada funcionário na minha lista de funcionários, imprime o funcionário.
		for (Funcionario func : lista) {
			System.out.println(func);
		}
		sc.close();
	}
	
	//Percorre a lista e retorna a posição do id na lista, se não achar retorna null
	public static boolean posicaoId(List<Funcionario> lista, int idFuncionario) {
		Funcionario funcionario = lista.stream().filter(x -> x.getId() == idFuncionario).findFirst().orElse(null);
		return funcionario != null;
	}
}
