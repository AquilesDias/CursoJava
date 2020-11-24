package controler;

import java.util.Scanner;

public class SwitchComBreak {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um dia da semana");
		String diaSemana = sc.nextLine();

		switch (diaSemana.toLowerCase()) {
		case "domingo":
			System.out.println("Domingo é um otimo dia!");
			break;

		case "segunda":
			System.out.println("Segunda não é um dia legal!");
			break;

		case "terça":
			System.out.println("Dia terça me parece não tão ruim");
			break;

		case "quarta":
			System.out.println("Quarta tem jogo, dia bom");
			break;
		case "quinta":
			System.out.println("Quinta é bom, perto de sexta");
			break;

		case "sexta":
			System.out.println("Sexxxxxtou bebê");
			break;
		default:
			System.out.println("Dia não conhecido! Tente novamente");
		}

		sc.close();

	}

}
