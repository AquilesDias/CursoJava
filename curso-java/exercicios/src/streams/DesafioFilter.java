package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

    public static void main(String[] args) {

	ProdutoFilter p1 = new ProdutoFilter("Notebook", 1566.65, 25, 0);
	ProdutoFilter p2 = new ProdutoFilter("Geladeira", 1200.65, 16, 12);
	ProdutoFilter p3 = new ProdutoFilter("Fogão", 566.65, 5, 0);
	ProdutoFilter p4 = new ProdutoFilter("Armario", 650.65, 10, 12);

	List<ProdutoFilter> produtos = Arrays.asList(p1, p2, p3, p4);

	Predicate<ProdutoFilter> superPromocao = a -> a.desconto >= 0;
	Predicate<ProdutoFilter> frete = a -> a.freteGratis >= 0;
	Predicate<ProdutoFilter> produtoRelevante = a -> a.preco >= 800;

	Function<ProdutoFilter, String> chamadaPromocional = 
		a -> "Aproveite! " + a.nome+ " por RS " +a.preco;
	
	produtos.stream()
	.filter(superPromocao)
	.filter(frete)
	.filter(produtoRelevante)
	.map(chamadaPromocional)
	.forEach(System.out::println);

	System.out.println("fim");
    }
}
