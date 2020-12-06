package oo.heranca.desafio;

public class Ferrari extends Carro {

	public Ferrari() {
		this(300);
	}

	Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
	}

	@Override
	public void acelerar() {
		velocidadeAtual += 15;
	}

	public String toString() {
		return "Velocidade atual da Ferrari é: " + velocidadeAtual + " Km/h";
	}
}
