package oo.encapsulamento;

public class Pessoa {

	private int idade;
	private String nome;
	private String sobrenome;

	Pessoa(String nome, String sobrenome, int idade) {
		setNome(nome);
		setSobrenome(sobrenome);
		setIdade(idade);
	}

	public String getNomeCompleto() {
		return getNome() + " " + getSobrenome();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
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
