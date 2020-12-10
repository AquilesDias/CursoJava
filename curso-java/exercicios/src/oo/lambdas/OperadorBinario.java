package oo.lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
	public static void main(String[] args) {
		 
		BinaryOperator<Double> media = 
				(n1, n2) -> (n1 + n2) / 2;

		System.out.println(media.apply(6.8, 7.9));

		BiFunction<Double, Double, String> resultado = (n1, n2) -> ((n1 + n2) / 2) >= 7 ? "Aprovado" : "Reprovado";

		// Outra forma de fazer...
//		BiFunction<Double, Double, String> resultado1 = (n1, n2) -> {
//			double notaFinal = (n1 + n2) / 2;
//			return notaFinal >= 7 ? "Aprovado" : "Reprovado";
//		};

		System.out.println(resultado.apply(1.7, 1.9));

		Function<Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Reprovado";

		System.out.println(media.andThen(conceito).apply(5.6, 7.8));

	}

}
