package controle.exercicios;

import java.util.Scanner;

public class exercicio9 {
	
	public static void main(String[] args) {
		
		//9. Crie um programa que recebe 10 valores e ao final imprima o maior número.
		
		Scanner entrada = new Scanner(System.in);
		
		int maiorValor = 0;
		int contador = 0;
		
		do {
			
			System.out.print("Digite o valor: ");
			int valor = entrada.nextInt();
			
			if (valor > maiorValor) {
				maiorValor = valor;
			}
			contador++;
		} while (contador != 10);
		
		System.out.println("O maior valor foi " + maiorValor);
		entrada.close();
		
	}

}
