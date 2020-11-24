package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual operação desejada? (+ - * / )");
		String op = sc.next();
		
		System.out.println("Digite o primeiro número:");
		double num1 = sc.nextDouble();
		
		System.out.println("Digite o segundo número:");
		double num2 = sc.nextDouble();
		
		
		//Logic
		Double resultado =  "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 % num2 : resultado;
		
		System.out.println(num2 + op + num2 + "=" +resultado);
		
		
		sc.close();
		
	}

}
