package Classe;

public class DesafioJantar {
	public static void main(String[] args) {
		
		DesafioPessoa dp = new DesafioPessoa("Aquiles", 72.00);
		DesafioComida dc = new DesafioComida(0.432);
		
		
		System.out.println("Antes de comer-> " +dp.nomePessoa +", peso:"  + dp.pesoPessoa +".");
		System.out.println("===========================");
		System.out.println("Depois -> " +dp.nomePessoa + ", peso:" + dp.comer(dc));
		
	}

}
