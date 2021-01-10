package generics;

public class CaixaObjetoTeste {

    public static void main(String[] args) {

	CaixaObjeto caixaA = new CaixaObjeto();
	caixaA.guardar(3.2);
	Double coisa = (Double) caixaA.abrir();
	System.out.println(coisa);

	CaixaObjeto caixaB = new CaixaObjeto();
	caixaB.guardar("Olá, mundo!");
	String coisaB = (String) caixaB.abrir();
	System.out.println(coisaB);

    }
}
