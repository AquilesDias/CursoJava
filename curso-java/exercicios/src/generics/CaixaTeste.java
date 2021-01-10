package generics;

public class CaixaTeste {
    public static void main(String[] args) {

	Caixa<String> caixaA = new Caixa<>();
	caixaA.guardar("Ola, mundo generics");
	System.out.println(caixaA.abrir());

	Caixa<Double> caixaB = new Caixa<>();
	caixaB.guardar(3.245);
	Double coisaB = caixaB.abrir();
	System.out.println(coisaB);

    }
}
