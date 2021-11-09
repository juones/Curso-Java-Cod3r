package controle.exercicios;

import java.util.Scanner;

public class exercicio7 {
	
	public static void main(String[] args) {
		
		//7. Criar um programa que enquanto estiver recebendo números positivos, 
		// imprime no console a soma dos números inseridos, caso receba um número negativo, encerre o programa.
		//Tente utilizar a estrutura do while.
		
		Scanner entrada = new Scanner(System.in);
		int val = 0;
		int resultado= 0;
		
		while (val >= 0) {
			System.out.println("O valor atual é: " + resultado);
			System.out.print("Digite o valor a ser somado ou um valor negativo para sair: ");
			val = entrada.nextInt();
			if (val >= 0) {
				resultado += val;
			} else System.out.println("O valor final é: " + resultado);			
		}	
		entrada.close();
	}
}