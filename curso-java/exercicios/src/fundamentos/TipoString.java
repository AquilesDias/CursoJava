package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		
		String time = "Flamengo";
		
		System.out.println(time.charAt(3));//mostra o char localizado na posi��o 3
		
		System.out.println(time.length());//mostra o tamanho da variavel
		
		System.out.println(time.equals("Flamengo"));//Faz compara��o
		
	    System.out.println(time.equalsIgnoreCase("FLAMengo")); //Ignora letras maiuscula e deixa tudo minusculo
		
		System.out.println(time.startsWith("f")); //ToLowerCase diminui 
		
		System.out.println(time.indexOf("engo")); //a partir do e em diante
		
	}

}
