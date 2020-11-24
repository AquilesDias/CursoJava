package Arrays;

import java.util.Arrays;

public class Exercicio {
	public static void main(String[] args) {
		
		double notasAluno [] = new double[4];
		//System.out.println(Arrays.toString(notasAluno));//
		
		notasAluno[0] = 7.9;
		notasAluno[1] = 8;
		notasAluno[2] = 6.7;
		notasAluno[3] = 6.7;
		
		System.out.println(Arrays.toString(notasAluno));
		
		double total = 0;
		for(int a = 0; a < notasAluno.length; a++) {
		     total += notasAluno[a];
		}	 
		System.out.println(total / notasAluno.length);
		
		System.out.println("===============================");
		
		double notasAlunoB []= {43.5, 31.5,13.5};		
		for (int i = 0; i < notasAlunoB.length; i++) {
			System.out.println(notasAlunoB[i]);
		}
	}
}
