package oo.composicao;

public class CursoTeste {
	public static void main(String[] args) {

		Aluno aluno1 = new Aluno("Lucas");
		Aluno aluno2 = new Aluno("Aquiles");
		Aluno aluno3 = new Aluno("John");
		
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("Web 2023");
		Curso curso3 = new Curso("Angular");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		curso2.adicionarAluno(aluno3);
		curso3.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(curso2);
		//aluno2.adicionarCurso(curso1);
		
		for(Aluno aluno : curso1.alunos) {
			System.out.println("Alunos Matriculados no curso 1: " +aluno.nome);
		}
		
		
		Curso cursoEncontrado = aluno1.obterCursoPorNome("Java Completo");
		
		if(cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}
	}
}
