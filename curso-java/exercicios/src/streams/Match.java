package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

    public static void main(String[] args) {
	Aluno a1 = new Aluno("Ana", 6.8);
	Aluno a2 = new Aluno("Lu", 4.2);
	Aluno a3 = new Aluno("Lorr", 7.1);
	Aluno a4 = new Aluno("Gabi", 7.5);

	List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

	Predicate<Aluno> aprovado = a -> a.nota >= 7;

	Predicate<Aluno> reprovado = aprovado.negate();

	// AllMatch = todos alunos foram aprovados?
	// false
	System.out.println(alunos.stream().allMatch(aprovado));

	// AnyMatch = Alguem bate com o predicado aprovado?
	// true
	System.out.println(alunos.stream().anyMatch(aprovado));

	// NoneMatch = Todos batem com o predicado?
	// false
	System.out.println(alunos.stream().noneMatch(reprovado));

    }

}
