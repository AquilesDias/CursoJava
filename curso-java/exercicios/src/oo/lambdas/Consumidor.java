package oo.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {

		Consumer<Produto> imprimirNome = p -> System.out.println(p.nome);

		Produto produto = new Produto("Notebook", 2523.43, 0.15);

		imprimirNome.accept(produto);

		Produto produto1 = new Produto("Notebook", 2523.43, 0.15);
		Produto produto2 = new Produto("Caderno", 25.00, 0.02);
		Produto produto3 = new Produto("Borracha", 2.34, 0.01);
		Produto produto4 = new Produto("Lapis", 1.43, 0.01);

		List<Produto> produtos = Arrays.asList(produto1, produto2, produto3, produto4);

		produtos.forEach(imprimirNome);
		produtos.forEach(p -> System.out.println(p.nome));
		produtos.forEach(System.out::println);
	}
}
