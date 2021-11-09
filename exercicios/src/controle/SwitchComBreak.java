package controle;

import java.util.Scanner;

public class SwitchComBreak {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a nota: ");
		
		String conceito = "";
		int nota = entrada.nextInt();
		
		switch(nota) {
		case 10, 9:
			conceito = "A";
			break;
		case 7, 8:
			conceito = "B";
			break;
		case 6:
			conceito = "C";
			break;
		case 5, 4:
			conceito = "D";
			break;
		case 3, 2 ,1, 0:
			conceito = "E";
			break;
		default: 
			conceito = "Não informado";
		}
		
		System.out.println("A nota é: "+ conceito);
		
		entrada.close();
		
	}

}
