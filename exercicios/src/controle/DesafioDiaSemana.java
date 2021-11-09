package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	
	public static void main(String[] args) {
		
		//ler o dia da semana como domingo e substituilo por 1, para todos os dias da semana
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o dia da semana: ");
		String diaString = entrada.nextLine();
		int diaNum = 0;
		
		if (diaString.equals("Domingo")) {
			diaNum = 1;
			System.out.println(diaNum);
			//também é possível usar o equals.ignoreCase
		} else if (diaString.equals("Segunda")) {
			diaNum = 2;
			System.out.println(diaNum);
		} else if (diaString.equals("Terça")) {
			diaNum = 3;
			System.out.println(diaNum);
		} else if (diaString.equals("Quarta")) {
			diaNum = 4;
			System.out.println(diaNum);
		} else if (diaString.equals("Quinta")) {
			diaNum = 5;
			System.out.println(diaNum);
		} else if (diaString.equals("Sexta")) {
			diaNum = 6;
			System.out.println(diaNum);
		} else if (diaString.equals("Sábado")) {
			diaNum = 7;
			System.out.println(diaNum);
		} else {
			System.out.println("Valor inválido!");
		}
		
		
		// Resolução do professor
		
		if("domingo".equalsIgnoreCase(diaString)) {
			System.out.println(1);
		} else if("segunda".equalsIgnoreCase(diaString)) {
			System.out.println(2);
		}else if("terça".equalsIgnoreCase(diaString)) {
			System.out.println(3);
		}else if("quarta".equalsIgnoreCase(diaString)) {
			System.out.println(4);
		}else if("quinta".equalsIgnoreCase(diaString)) {
			System.out.println(5);
		}else if("sexta".equalsIgnoreCase(diaString)) {
			System.out.println(6);
		}else if("sábado".equalsIgnoreCase(diaString)) {
			System.out.println(7);
		}else {
			System.out.println("Dia inválido");
		}
		
		entrada.close();
		
	}

}
