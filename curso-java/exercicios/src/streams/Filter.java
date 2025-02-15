package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {

	Aluno a1 = new Aluno("Ana", 4.8);
	Aluno a2 = new Aluno("Bia", 8.8);
	Aluno a3 = new Aluno("May", 5.6);
	Aluno a4 = new Aluno("Kil", 5.4);
	Aluno a5 = new Aluno("Ju", 7.8);

	List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);

	Predicate<Aluno> aprovado = a -> a.nota >= 7;
	Function<Aluno, String> fAprovado = 
		a -> "Parabéns, " + a.nome + "! Você foi aprovado";

	alunos.stream()
		.filter(a -> a.nota >= 7)// aprovado
		.map(a -> "Parabéns, " + a.nome + "! Você foi aprovado")// fAprovado
	        .forEach(System.out::println);
	
    }
}
