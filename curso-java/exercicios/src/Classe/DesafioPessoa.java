package Classe;

public class DesafioPessoa {
	
	String nomePessoa;
	double pesoPessoa;
		
	DesafioPessoa(String nome, double pesoPessoa){
		this.nomePessoa = nome;
		this.pesoPessoa = pesoPessoa;		
	}
	
	double comer(DesafioComida dc) {
		if(dc != null) {
			pesoPessoa += dc.pesoComida;
		}	  
		return pesoPessoa;
	}


}
