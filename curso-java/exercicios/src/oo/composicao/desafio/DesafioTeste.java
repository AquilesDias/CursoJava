package oo.composicao.desafio;

public class DesafioTeste {
	public static void main(String[] args) {


		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 9.67, 100);
		compra1.adicionarItem(new Produto("Notebook", 1897.88), 2);

		Compra compra2 = new Compra();
		compra2.adicionarItem("Caderno", 10, 10);
		compra2.adicionarItem(new Produto("Impressora", 998.90), 1);

		Cliente cliente = new Cliente("Aquiles Dias");
		Cliente cliente2 = new Cliente("Thauany Teixeira");
		cliente.adicionarCompra(compra1);
		cliente2.compras.add(compra2);

		double resultadoTotal = cliente.ObterValorTotal() + cliente2.ObterValorTotal();

		System.out.println("Compras Thauany: " + cliente2.ObterValorTotal());
		System.out.println("Compras Aquiles: " + cliente.ObterValorTotal());

		System.out.println("Resultado Total: " + resultadoTotal);

	}
}
