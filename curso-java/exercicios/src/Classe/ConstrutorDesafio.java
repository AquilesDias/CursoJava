package Classe;

public class ConstrutorDesafio {

    int dia;
	int mes;
	int ano;
	
	ConstrutorDesafio(){
		dia = 1;
		mes = 1;
		ano = 1970;
	}
	
	ConstrutorDesafio(int diaInicial, int mesInicial, int anoInicial){
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
	}

	String dataFormatada() {
		 return String.format("%d/%d/%d", dia, mes, ano);
	}
	
	void imprimir() {
		System.out.println(dataFormatada());
	}

}
