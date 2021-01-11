package generics;

public class ParesTeste {
    public static void main(String[] args) {

	Pares<Integer, String> resultadoConcurso = new Pares<>();
	resultadoConcurso.adicionar(1, "Maria");
	resultadoConcurso.adicionar(2, "Sthefani");
	resultadoConcurso.adicionar(3, "Barbara");
	resultadoConcurso.adicionar(4, "Marcela");
	resultadoConcurso.adicionar(4, "Nathalia");

	System.out.println(resultadoConcurso.getValor(4));
    }
}
