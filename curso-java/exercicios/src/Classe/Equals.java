package Classe;

public class Equals {
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Aquiles Dias";
		u1.email = "Aquiles@gmail.com";
		
		
		Usuario u2 = new Usuario();
		u2.nome = "Aquiles Dias";
		u2.email = "Aquiles@gmail.com";
		
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
	}

}
