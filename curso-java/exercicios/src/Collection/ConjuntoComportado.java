package Collection;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	
	public static void main(String[] args){
		
		//Set<String> listaAprovados = new HashSet<String>();
		Set<String> listaAprovados = new TreeSet<String>();
		listaAprovados.add("John");
		listaAprovados.add("Cinthia");
		listaAprovados.add("Lucas");
		listaAprovados.add("Aquiles");
		listaAprovados.add("Ana");
             
        for(String candidato : listaAprovados) {
        	System.out.println(candidato);
        }
        
        System.out.println("========================");
        
        SortedSet<Integer>nums = new TreeSet<>();
        nums.add(543);
        nums.add(123);
        nums.add(123);
        nums.add(13234);
        nums.add(732);
        nums.add(452);
        
        //nums.get(2); Não é possivel acessar pelo indice
        
        for(int n : nums) {
        	System.out.println(n);
        }
	}
}
