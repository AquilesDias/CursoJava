package fundamentos;

public class DesafioLogico {
	
	public static void main(String[] args) {
		
	Boolean trabalhoTerca = false;
	Boolean trabalhoQuinta = false;
	Boolean comprouTv = !trabalhoTerca && !trabalhoQuinta;
	
	//System.out.println("Comprou tv 50 polegas e tomou sorvete? " +comprouTv);
	//System.out.println("Comprou tv 32 polegas e tomou sorvete? " +comprouTv);
	System.out.println("Todos ficaram em casa? " +comprouTv);
	}

	
	
}
