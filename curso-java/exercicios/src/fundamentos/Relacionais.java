package fundamentos;

public class Relacionais {
	public static void main(String[] args) {
      
		double nota = 6.0;
		boolean bomComportamento = true;
		boolean passouPorMedia= nota>7.0;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Esta apto a ter desconto? " +temDesconto);
	}
}
