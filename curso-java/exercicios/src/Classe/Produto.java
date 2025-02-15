package Classe;

public class Produto {

	//Atributos
	String nome;
	double preco;
	static double desconto=0.25;
	static final double descontoDiaEspecial = 0.35;

	Produto(){}
	
	Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	}

	//Metodo
	double precoComDesconto() {
		return preco * (1 - desconto);
	}

	double precoComDescontoEspecial() {
		return preco * (1 - descontoDiaEspecial);
	}
}
