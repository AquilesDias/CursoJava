package controler;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite algo: ");

		String userDigitou = sc.nextLine();
		
		while (!userDigitou.equalsIgnoreCase("sair")) {
			System.out.println(userDigitou);
            userDigitou = sc.nextLine();
		}
		
		sc.close();
	}

}
