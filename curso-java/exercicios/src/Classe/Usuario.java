package Classe;

public class Usuario {
	
	String nome;
	String email;
	
	
		@Override
		public boolean equals(Object objTeste) {
			
			if(objTeste instanceof Usuario) {
				
				Usuario outro = (Usuario)objTeste;
				
				boolean nomeIgual = outro.nome.equals(this.nome);
				boolean emailIgual = outro.email.equals(this.email);
				
				return nomeIgual && emailIgual;
			}
			
			return false;
		}
			

}
