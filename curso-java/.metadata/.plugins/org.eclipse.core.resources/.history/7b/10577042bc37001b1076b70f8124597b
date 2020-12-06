package oo.encapsulamento;

public class Pessoa {

	private int idade;
	private String nome;

	Pessoa(String nome, int idade) {
		setNome(nome);
		setIdade(idade);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int novaIdade) {
		if (novaIdade >= 0) {
			this.idade = novaIdade;
		}
	}

	@Override
	public String toString() {
		return "Olá " + nome + ", tenho " + idade + " anos!";
	}
}
