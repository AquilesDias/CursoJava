package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		
		String num1 = JOptionPane.showInputDialog("Digite o primeiro numero: ");
		String num2 = JOptionPane.showInputDialog("Digite o segundo numero: ");
		
		Double soma1 = Double.parseDouble(num1);
		Double soma2 = Double.parseDouble(num2);
		double result = soma1 + soma2;
		
		System.out.printf("o resultado é: %.2f\n", result);
		System.out.printf("a media é: %.2f", result / 2);
		
		
		
	}
}
