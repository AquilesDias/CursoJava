package Classe;

public class AreaCirc {
	
     static final double pi = 3.14;
     double raio;
     
     
     AreaCirc(Double raioInicial){
    	 raio = raioInicial;
     }
     
     double area() {     	
    	 return pi * Math.pow(raio,2);
     }

}
