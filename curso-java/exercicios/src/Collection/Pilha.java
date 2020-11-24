package Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {

		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("Harry Potter");
		livros.add("A volta ");
		livros.push("aaaaaaaaa");
		livros.push("bbbbbbbbb");
		livros.push("ccccccccc");
		
		System.out.println(livros.pop());
		System.out.println(livros.pop());
		System.out.println(livros.pop());
		System.out.println(livros.pop());
		System.out.println(livros.pop());
		  
	}

}
