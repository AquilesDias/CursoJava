package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

    public static void main(String[] args) {

	Consumer<String> print = System.out::print;
	Consumer<Object> println = System.out::println;

	Stream<String> ling = Stream.of("Java ", "JS ", "Python\n");
	ling.forEach(print);

	// a partir de um array
	String[] ling1 = { "C++ ", "Go ", "Angular\n" };
	Stream.of(ling1).forEach(print);

	// Utilizando o proprio array
	Arrays.stream(ling1).forEach(print);
	Arrays.stream(ling1, 1, 2).forEach(print); // Vai do 1 ao 2. nao inclui indice 2

	// A partir Collection
	List<String> ling2 = Arrays.asList("PHP ", "Kotlin ", "C\n");
	ling2.stream().forEach(print);
	ling2.parallelStream().forEach(print);

	// Stream Infinita
	// Stream.generate(() -> "a").forEach(print);// imprime a infinito
	Stream.iterate(0, n -> n + 1).forEach(println);

    }
}
