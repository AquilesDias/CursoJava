package Arrays;

public class Foreach {
	
	public static void main(String[] args) {
		
		int notas [] = {1, 5, 7, 2};
		
//		Jeito tradicional
//	    for (int i = 0; i < notas.length; i++) {			
//	    	System.out.println(notas[i]);
//		}
		
		for(double nota: notas) {
			System.out.println(nota);
		}
	}
}
