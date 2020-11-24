package fundamentos;

import java.util.Scanner;

public class TipoStringEqual {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String a = ler.nextLine();	
		System.out.println("2".equals(a.trim()));
		ler.close();
	}

}
