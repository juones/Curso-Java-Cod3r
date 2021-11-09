package controle.exercicios;

import java.util.Scanner;

public class exercicio5 {
	
	public static void main(String[] args) {
		
		//5. Refatorar o exercício 04, utilizando a estrutura switch.
		//gabarito
		int contadorDeDivisores = 0;
		Scanner entrada = new Scanner(System.in);

		System.out.println("\nDigite um numero para verificar se é primo:");
		int numero = entrada.nextInt();

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}

		switch (contadorDeDivisores) {

		case 0:
			System.out.println("O numero " + numero + " é um numero primo.");
			break;

		default:
			System.out.println("O numero " + numero + "  não é um numero primo.");

		}

		entrada.close();
		
	}

}
