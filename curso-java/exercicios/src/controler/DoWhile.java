package controler;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String entrou = sc.nextLine();
		
		do {
			System.out.println("Seja educado para sair!");
			entrou = sc.nextLine();
			
		}while(!entrou.equalsIgnoreCase("por favor"));
		
		System.out.println("Parabens, tchau!");
		
		sc.close();
	}

}
