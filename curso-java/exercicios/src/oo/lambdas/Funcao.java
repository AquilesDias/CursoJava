package oo.lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {

		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Impar";
		System.out.println(parOuImpar.apply(6));

		Function<String, String> oResultado = valor -> "O resultado é: " + valor;

		Function<String, String> empolgado = valor -> "!!!";

		String resultadoFinal = parOuImpar.andThen(oResultado).andThen(empolgado).apply(6);

		System.out.println(resultadoFinal);
	}
}
