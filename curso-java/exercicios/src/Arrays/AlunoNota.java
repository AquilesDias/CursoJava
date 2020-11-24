package Arrays;

import java.util.Locale;
import java.util.Scanner;

public class AlunoNota {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Olá, quantas notas deseja informar?");
		int a = sc.nextInt();
		
		System.out.println("Digite as notas!");
		
		double notas[] = new double[a];

		double total = 0;
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Informe a nota" +(i+1) + ":");
			notas[i] = sc.nextDouble();
		}

		for (double nota : notas) {
			total += nota;
		}

		System.out.println("o total de nota foi de : " + total);
		System.out.printf("Media %.2f", total / 2);
		sc.close();
	}

}