package oo.heranca.desafio;

public class Carro {

	int velocidadeAtual = 10;
	final int VELOCIDADE_MAXIMA;

	private int delta = 10;

	Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	public void acelerar() {

		if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += getDelta();
		}
	}

	public void frear() {

		if (velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		}
		else {
			velocidadeAtual = 0;
		}

	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}

}
