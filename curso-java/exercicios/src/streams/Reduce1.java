package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

    public static void main(String[] args) {

	List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

	BinaryOperator<Integer> soma = (ac, n) -> ac + n;

	Integer total = nums.stream().reduce(soma).get();
	System.out.println(total); // Resultado = 45

	Integer total3 = nums.stream().reduce(100, soma);
	System.out.println(total3); // Resultado = 128

	Integer total2 = nums.parallelStream().reduce(100, soma);
	System.out.println(total2);// Resultado = 728

	// Resultado foi um Optional<Integer>
	// Resultado = 18
        nums.stream()
	.filter(n -> n > 5)
	.reduce(soma)
	.ifPresent(System.out::println);

    }
}
