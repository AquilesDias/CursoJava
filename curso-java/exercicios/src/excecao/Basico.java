package excecao;

import streams.Aluno;

public class Basico {
    public static void main(String[] args) {

	Aluno a1 = null;

	try {
	    imprimirNomeAluno(a1);
	} catch (Exception excecao) {
	    System.out.println("Ocorreu um erro!");
	}

	try {
	    System.out.println(7 / 0);
	} catch (ArithmeticException e) {
	    System.out.println(e.getMessage()); // by zero
	    e.printStackTrace();
	}

	System.out.println("FIM :)");
    }

    public static void imprimirNomeAluno(Aluno aluno) {
	System.out.println(aluno.nome);
    }

}
