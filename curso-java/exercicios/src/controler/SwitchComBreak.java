package controler;

import java.util.Scanner;

public class SwitchComBreak {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um dia da semana");
		String diaSemana = sc.nextLine();

		switch (diaSemana.toLowerCase()) {
		case "domingo":
			System.out.println("Domingo � um otimo dia!");
			break;

		case "segunda":
			System.out.println("Segunda n�o � um dia legal!");
			break;

		case "ter�a":
			System.out.println("Dia ter�a me parece n�o t�o ruim");
			break;

		case "quarta":
			System.out.println("Quarta tem jogo, dia bom");
			break;
		case "quinta":
			System.out.println("Quinta � bom, perto de sexta");
			break;

		case "sexta":
			System.out.println("Sexxxxxtou beb�");
			break;
		default:
			System.out.println("Dia n�o conhecido! Tente novamente");
		}

		sc.close();

	}

}
