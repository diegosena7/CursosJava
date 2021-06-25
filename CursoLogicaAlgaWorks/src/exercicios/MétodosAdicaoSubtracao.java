package exercicios;
import java.util.Scanner;

public class MétodosAdicaoSubtracao {

	public static void main(String[] args) {

		Scanner entradaTeclado = new Scanner(System.in);
		String[] menu = new String[] { "+ Soma", "- Subtração", "* Multiplicação", "/ Divisão" };

		mostraOperacoes(menu);

		Integer operacao = metodoOperacao("Digite o numero da operação: ", entradaTeclado);
		Boolean operacaoValida = metodoVerificarOperacao(operacao, menu);

		Double a = metodoRecebeNumeros("Digite o Primeiro numero: ", entradaTeclado);
		Double b = metodoRecebeNumeros("Digite o Segundo numero: ", entradaTeclado);

		if (!operacaoValida) {
			encerrarErro();
		}

		Double resultado = 0.0;

		if (operacao == 0) {
			resultado = metodoSomar(a, b);
		} else if (operacao == 1) {
			resultado = metodoSubtrair(a, b);
		} else if (operacao == 2) {
			resultado = metodoMultiplicar(a, b);
		} else {
			resultado = metodoDividir(a, b);
		}

		imprimiTexto("Resultado: " + resultado);
	}

	static Double metodoSomar(Double a, Double b) {
		return a + b;
	}

	static Double metodoSubtrair(Double a, Double b) {
		return a - b;
	}

	static Double metodoMultiplicar(Double a, Double b) {
		return a * b;
	}

	static Double metodoDividir(Double a, Double b) {
		return a / b;
	}

	static void imprimiTexto(String texto) {
		System.out.println(texto);
	}

	static Double metodoRecebeNumeros(String texto, Scanner entradaTeclado) {
		Double numeroDigitado = 0.0;
		imprimiTexto(texto);
		numeroDigitado = entradaTeclado.nextDouble();
		return numeroDigitado;
	}

	static Integer metodoOperacao(String texto, Scanner entradaTeclado) {
		imprimiTexto(texto);
		Integer escolhaOperacao = entradaTeclado.nextInt();
		return escolhaOperacao;
	}

	static void mostraOperacoes(String[] menu) {
		for (int i = 0; i < menu.length; i++) {
			imprimiTexto("[" + i + "]" + menu[i]);
		}
	}

	static Boolean metodoVerificarOperacao(Integer operacao, String menu[]) {
		Boolean validacao = operacao >= 0 && operacao < menu.length;
		return validacao;
	}

	static void encerrarErro() {
		System.err.println("Operação inválida!");
		System.exit(1);
	}
}
