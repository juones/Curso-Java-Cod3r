package controle.exercicios;

import java.util.Scanner;

public class exercicio1 {
	
	public static void main(String[] args) {
		
		//1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número de 1 a 10: ");
		int num1 = entrada.nextInt();
		
		if (num1 % 2 == 0 && num1 >= 0 && num1 <= 10) {
			System.out.println("Número é par!");
		} else if (num1 % 2 == 1 && num1 >= 0 && num1 <= 10) {
			System.out.println("Número é impar!");
		} else {
			System.out.println("Valor inválido");
		}
		
		entrada.close();
		
	}

}

	
//	if (numero % 2 == 0) {
//		System.out.println("Número é par!");
//	} else {

// solução do professor

//Scanner scanner = new Scanner(System.in);
//
//System.out.println("Digite um numero: ");
//int numero = scanner.nextInt();
//
//if (numero >= 0 && numero <= 10) {
//	if (numero % 2 == 0) {
//		System.out.println("O numero " + numero + " está entre 0 e 10 e é um par.");
//	} else {
//		System.out.println("O numero " + numero + " está entre 0 e 10 mas não é um par.");
//	}
//} else {
//	System.out.println("O numero " + numero + " não está entre 0 e 10.");
//}
//scanner.close();