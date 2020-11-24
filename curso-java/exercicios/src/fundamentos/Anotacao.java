package fundamentos;

public class Anotacao {

	public static void main(String[] args) {

		String nome = "Eu gosto de X";
		nome = nome.replace("X", "doce");
		nome = nome.concat("!");
		nome = nome.toUpperCase();

		System.out.println(nome);
		System.out.println("Bolo X".replace("X", "de Chocolate").toUpperCase().concat("!"));

	}

}
