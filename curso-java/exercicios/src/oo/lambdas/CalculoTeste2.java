package oo.lambdas;

public class CalculoTeste2 {
	public static void main(String[] args) {


		Calculo cal = (x, y) -> {
			return x + y;
		};
		System.out.println(cal.executar(2, 8));

		cal = (x, y) -> x * y;
		System.out.println(cal.executar(5, 8));


//		System.out.println(cal.legal());
//		System.out.println(Calculo.muitoLegal());
	}
}
