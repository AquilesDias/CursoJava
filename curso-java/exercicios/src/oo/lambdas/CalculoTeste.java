package oo.lambdas;

public class CalculoTeste {

	public static void main(String[] args) {
		Calculo calculo = new Soma();
		System.out.println(calculo.executar(8, 9));

		calculo = new Multiplicar();
		System.out.println(calculo.executar(5, 5));
	}

}
