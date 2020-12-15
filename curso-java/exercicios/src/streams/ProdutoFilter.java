package streams;

public class ProdutoFilter {

    final String nome;
    final double desconto;
    final double preco;
    final double freteGratis;

    ProdutoFilter(String nome, double preco, double desconto, double freteGratis) {
	this.nome = nome;
	this.preco = preco;
	this.desconto = desconto;
	this.freteGratis = freteGratis;
    }
}
