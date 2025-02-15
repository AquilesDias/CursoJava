package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

    public static void main(String[] args) {
	
	/* 
	 * 1. Número para string binária... 6 -> "110".
	 * 2. Inverter a string ... "110" -> "011".
	 * 3. Converter de volta para inteiro -> "011" -> 3
	 */
	Consumer<String> print = System.out::print;
	List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        
	
        UnaryOperator<String> inverter = 
		n -> new StringBuilder(n).reverse().toString();

	Function<String, Integer> binarioParaInteger = 
		b -> Integer.parseInt(b, 2);
		
	nums.stream()
	        .map(Integer::toBinaryString)
		.map(inverter)
		.map(binarioParaInteger)
		.forEach(System.out::println);
		
    }
}
