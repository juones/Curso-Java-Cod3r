package fundamentos.exercicios;

import java.util.Scanner;

public class Exer4 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor a ser calculado: ");
		double valor = entrada.nextDouble();
		
		double valor2 = Math.pow(valor, 2);
		double valor3 = Math.pow(valor, 3);
		
		System.out.printf("O valor %.1f ao quadrado é: %.1f, e ao cubo é %.1f.", valor, valor2, valor3);
		
		entrada.close();
		
	}

}
