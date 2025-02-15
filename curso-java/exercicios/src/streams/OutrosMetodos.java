package streams;

import java.util.Arrays;
import java.util.List;

public class OutrosMetodos {

    public static void main(String[] args) {

	Aluno a1 = new Aluno("Ana", 6.8);
	Aluno a2 = new Aluno("Luu", 4.2);
	Aluno a3 = new Aluno("Loh", 7.1);
	Aluno a4 = new Aluno("Gabi", 9.5);
	Aluno a5 = new Aluno("Ana", 6.8);
	Aluno a6 = new Aluno("Luu", 4.2);
	Aluno a7 = new Aluno("Loh", 7.1);
	Aluno a8 = new Aluno("Gabi", 9.5);

	List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);

	System.out.println("Distinct...");
        alunos.stream()
        .distinct()
        .forEach(System.out::println);

	System.out.println("\nSkip/Limit");
	alunos.stream()
        .distinct()
	.skip(1)
        .limit(2)
        .forEach(System.out::println);

	System.out.println("\nTake While");
	alunos.stream()
	.distinct()
	.skip(2)
	.takeWhile(a -> a.nota >7)
	.forEach(System.out::println);
	
    }
}
