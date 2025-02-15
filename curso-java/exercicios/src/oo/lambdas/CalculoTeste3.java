package oo.lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
	public static void main(String[] args) {

		BinaryOperator<Double> calc = (x, y) -> {
			return x + y;
		};
		System.out.println(calc.apply(4.0, 6.0));

		BinaryOperator<Integer> calc2 = (x, y) -> y * x;
		System.out.println(calc2.apply(6, 7));
	}
}
