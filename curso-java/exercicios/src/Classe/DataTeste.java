package Classe;

public class DataTeste {
	public static void main(String[] args) {

		Data dt = new Data();

		dt.dia = 23;
		dt.mes = 9;
		dt.ano = 1997;

		System.out.printf(" \n %d/%d/%d", dt.dia, dt.mes, dt.ano);

		// chamada pelo metodos (optar por essa forma.)
		dt.obterDataFormatada();
		dt.imprimirDataFormatada();
	}
}
