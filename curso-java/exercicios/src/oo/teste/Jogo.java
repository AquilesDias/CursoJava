package oo.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {
	public static void main(String[] args) {

		Heroi j1 = new Heroi(10, 11);

		Monstro j2 = new Monstro();// aceita parametros e atribuição
		// Atribuindo vida
		j2.x = 10;
		j2.y = 11;

		// Verificando a quantidade de vida.
		System.out.println("Heroi = quantidade de vida: " + j1.vida);
		System.out.println("Monstro = quantidade de vida: " + j2.vida);

		// Atacando
		j1.atacar(j2);
		j2.atacar(j1);

		j1.atacar(j2);
		j2.atacar(j1);

		j1.andar(Direcao.NORTE);
		j1.atacar(j2);
		j2.atacar(j1);

		System.out.println("");
		System.out.println("========APOS ATAQUE==============");
		System.out.println("Heroi = quantidade de vida: " + j1.vida);
		System.out.println("Monstro = quantidade de vida: " + j2.vida);

	}
}
