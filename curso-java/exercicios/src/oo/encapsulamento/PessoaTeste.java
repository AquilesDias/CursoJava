package oo.encapsulamento;

public class PessoaTeste {
	public static void main(String[] args) {

		Pessoa year = new Pessoa("Mundo", "Terra", 8000);

		year.setIdade(-50);

		System.out.println(year);
		System.out.println(year.getNomeCompleto());
	}

}
