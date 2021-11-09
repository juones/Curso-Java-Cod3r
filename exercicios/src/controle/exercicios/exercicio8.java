package controle.exercicios;

import java.util.Scanner;

public class exercicio8 {
	
	public static void main(String[] args) {
		
		//gabarito
		// 8. Criar um programa que receba uma palavra e imprime no console letra por letra.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a palavra: ");
		String palavra = entrada.nextLine();

		char letras[] = palavra.toCharArray();

		for (int i = 0; i < letras.length; i++) {
			System.out.println(letras[i]);
		}
		
		entrada.close();
		
	}

}
