package Classe;

public class ProdutoTeste {

	public static void main(String[] args) {				

		Produto p1 = new Produto("Hamburguer", 12.90 );			
		Produto.desconto = 0.25;
				
		var p2 = new Produto("Almofada", 30.00);
			
		System.out.println( "Nome Produto: " + p1.nome + "\n Pre�o: " + p1.preco + "\n Desconto: " + Produto.desconto);
		System.out.println("=================================");
		System.out.printf("Nome: %s  \n Pre�o: %.2f \n Desconto: %.2f \n",p2.nome, p2.preco, Produto.desconto);
		System.out.println("=================================");
		
		double precoFinal1 = p1.precoComDesconto();
	    double precoFinal2 = p2.precoComDescontoEspecial();
	   	    
	    System.out.printf("Pre�o total : %.2f " , (precoFinal1 + precoFinal2)/2);
	    
	}	
}