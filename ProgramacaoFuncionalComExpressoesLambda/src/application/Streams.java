package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Stream é uma sequencia de elementos advinda de uma fonte de dados que oferece suporte a "operações agregadas".
 */
public class Streams {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

		Stream<Integer> stream = list.stream().map(elemento -> elemento * 10);
		System.out.println("Inteiros: " + Arrays.toString(stream.toArray()));

		Stream<String> stream1 = Stream.of("Diego", "Nayara", "Ryan", "Ted");
		System.out.println("Strings: " + Arrays.toString(stream1.toArray()));

		Stream<Integer> stream2 = Stream.iterate(0, s -> s + 2);
		System.out.println("Integers :" + Arrays.toString(stream2.limit(10).toArray()));

		// Fibonacci: dado um valor retorna a soma dos 2 anteriores...
		Stream<Long> stream3 = Stream.iterate(new Long[] { 0L, 1L }, p -> new Long[] { p[1], p[0] + p[1] })
				.map(p -> p[0]);
		System.out.println("Fibonacci = " + Arrays.toString(stream3.limit(20).toArray()));

		int soma = list.stream().reduce(0, (x, y) -> x + y);
		System.out.println("Soma = " + soma);

		int produto = list.stream().reduce(1, (x, y) -> x * y);
		System.out.println("Produto = " + produto);

		// Retorna os númeors pares da lisa multplicado por 10
		List<Integer> list1 = list.stream().filter(x -> x % 2 == 0).map(x -> x * 10).collect(Collectors.toList());
		System.out.println("Lista = " + Arrays.toString(list1.toArray()));
	}
}
