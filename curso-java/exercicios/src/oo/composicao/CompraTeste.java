package oo.composicao;

public class CompraTeste {
	
	public static void main(String[] args) {
		
		Compra c1 = new Compra();
		c1.cliente = "Luacs";
		
		c1.adicionarItem("Caderno", 2, 15.99 );
		c1.adicionarItem(new Item("Canetas", 3, 1.59));
		c1.adicionarItem(new Item("Corretivo", 1, 3.50));
		
		System.out.println(c1.itens.size());
		System.out.println(c1.valorTotal());
	}

}

