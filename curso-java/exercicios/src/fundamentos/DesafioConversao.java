package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o primeiro salario: ");
		String num1 = ler.nextLine().replace(",",".");
		
		System.out.println("Digite o primeiro salario: ");
		String num2 = ler.nextLine().replace(",",".");
		
		System.out.println("Digite o primeiro salario: ");
	    String num3 = ler.nextLine().replace(",", ".");
		
		Double salario1 = Double.parseDouble(num1);
		Double salario2 = Double.parseDouble(num2);
		Double salario3 = Double.parseDouble(num3);
		
		Double mediaFinal = (salario1+salario2+salario3)/2;
		
		System.out.printf("A media dos salarios é: %.2f",mediaFinal);
		
		ler.close();
	}
	
	
}
