package Arrays;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		 
	  Locale.setDefault(Locale.US);
	  Scanner sc = new Scanner (System.in);
	  
	  System.out.print("Quantos alunos?");
	  int qtAlunos = sc.nextInt();
	  
	  System.out.print("Quantas nota por aluno?");
	  int qtNotas = sc.nextInt();
	  
	  double [][] notaTurma = new double [qtAlunos][qtNotas];
	  
	  double total=0;
	  for(int a=0; a < notaTurma.length; a++) {
		  for(int n=0; n < notaTurma[a].length; n++) {
			  
			  System.out.printf("Informe a nota %d do aluno %d:", n+1, a+1);			
			  notaTurma[a][n] = sc.nextDouble();
			  total += notaTurma[a][n];
		  }
	  }
	  double media = total / (qtAlunos * qtNotas);
	  System.out.println("Media do aluno � : " +media );
	  
	  for(double notasDoAluno[] : notaTurma) {
		  System.out.println(Arrays.toString(notasDoAluno));
	  }
	  
	  sc.close();
	}

}
