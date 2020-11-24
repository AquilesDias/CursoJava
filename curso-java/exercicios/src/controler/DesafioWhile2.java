package controler;

import java.util.Scanner;

public class DesafioWhile2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
        double totalNota = 0;
        double testeNota = 0;     
        int quantidade = 0;
        
		System.out.println("ATENÇÃO : Digite (-1) caso queira sair do programa");	
		System.out.println("==================================================");
		
		while(testeNota != -1) {
			
			System.out.println("Qual a nota?");
			testeNota = sc.nextDouble();
			
			if(testeNota >= 0 && testeNota <= 10) {
		        totalNota+=testeNota;
		        quantidade++;	
			}
			else if(testeNota != -1) {	
				System.out.println("Nota invalida ;x");
			}							
		}
		double media  = totalNota/quantidade;
		System.out.println("Media:"+ media);
		sc.close();
	}
}
