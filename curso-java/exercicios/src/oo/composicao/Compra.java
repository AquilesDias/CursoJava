package oo.composicao;

import java.util.ArrayList;

public class Compra {
	
	String cliente;
	ArrayList <Item> itens = new ArrayList<>();
	
	void adicionarItem(Item item) {
		itens.add(item);
		item.compra = this;
	}
	
	void adicionarItem(String nome, int quantidade, double preco) {
		this.adicionarItem(new Item(nome, quantidade, preco));
	}

	double valorTotal() {
		double valorCompra = 0;
		
		for(Item item : itens) {
			valorCompra += item.quantidade * item.preco;
		}
		return valorCompra;
	}
}
