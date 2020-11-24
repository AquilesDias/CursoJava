package controler;

import java.util.Scanner;

public class If {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("O daylan é gay? S=sim  N=não " );
		
		String resposta = sc.next().equals("S") ? "é gay" : "é sim, xiu" ;
		
		System.out.println(resposta);
		
//		if(resposta.equals("S")) {
//			System.out.println("é gay");
//		}
//		else {
//			System.out.println("é sim, vc ta errado");
//		}
		sc.close();
	}

}
