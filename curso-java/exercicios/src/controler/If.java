package controler;

import java.util.Scanner;

public class If {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("O daylan � gay? S=sim  N=n�o " );
		
		String resposta = sc.next().equals("S") ? "� gay" : "� sim, xiu" ;
		
		System.out.println(resposta);
		
//		if(resposta.equals("S")) {
//			System.out.println("� gay");
//		}
//		else {
//			System.out.println("� sim, vc ta errado");
//		}
		sc.close();
	}

}
