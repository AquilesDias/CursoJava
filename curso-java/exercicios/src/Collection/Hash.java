package Collection;

import java.util.HashSet;

public class Hash {
	public static void main(String[] args) {
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		
		usuarios.add(new Usuario("Flamengo"));
		usuarios.add(new Usuario("Corinthians"));
		usuarios.add(new Usuario("Internacional"));
		usuarios.add(new Usuario("Palmeiras"));
		
		System.out.println(usuarios.contains(new Usuario("Palmeiras")));
		
	}

}
