package Classe;

public class AreaCircTeste {
	public static void main(String[] args) {
 
		AreaCirc ac = new AreaCirc(5.6);
		System.out.println(ac.area());
		
		AreaCirc ac2 = new AreaCirc(5.0);
		System.out.println(ac2.area());
		
		//Forma ideal para acessar ou mudar o valor de pi.
		//AreaCirc.pi = 3.1415;
		
		
	}

}
