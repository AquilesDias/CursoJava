package Classe;

public class ConstrutorTesteDesafio {
	public static void main(String[] args) {
		
		ConstrutorDesafio cd = new ConstrutorDesafio();
		ConstrutorDesafio cd2 = new ConstrutorDesafio(23,9,1997);
		
		cd.imprimir();
		cd2.imprimir();
		
//		System.out.println(cd.dataFormatada());
//		System.out.println(cd2.dataFormatada());
	}

}
