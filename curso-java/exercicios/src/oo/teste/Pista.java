package oo.teste;

import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.Palio;

public class Pista {

	public static void main(String[] args) {

		Ferrari f1 = new Ferrari();
		Palio p1 = new Palio();

		// Mostrando velocidade Inicial
		System.out.println(f1);
		System.out.println(p1);

		System.out.println("");

		// Acelerando
		f1.acelerar();
		p1.acelerar();

		System.out.println("===ACELERANDO===");
		System.out.println(f1);
		System.out.println(p1);
		System.out.println("");

		// Freando
		f1.frear();
		p1.frear();
		System.out.println("===FREIOU===");
		System.out.println(f1);
		System.out.println(p1);
		System.out.println("");

		// Acelerando
		f1.acelerar();
		p1.acelerar();
		System.out.println("===ACELEROU NOVAMENTE");
		System.out.println(f1);
		System.out.println(p1);

		System.out.println("===ACELEROU COM TURBO");
		f1.ligarTurbo();
		System.out.println(f1);
	}

}
