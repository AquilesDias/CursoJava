package Collection;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>(); 
		
		Usuario u1 = new Usuario("Lara");
		
		lista.add(u1);
		lista.add(new Usuario("Jorge"));
		lista.add(new Usuario("John"));
		lista.add(new Usuario("Maycon"));
		lista.add(new Usuario("Aquiles"));
		lista.add(new Usuario("Maycon"));
		
		//System.out.println(lista.get(3)); Acessando pelo indice
		//lista.remove(2); //Removendo pelo indice
		lista.remove(new Usuario("John")); //Removendo por objeto
		
		for(Usuario u : lista) {
			System.out.println(u);
		}		
		
	}
}