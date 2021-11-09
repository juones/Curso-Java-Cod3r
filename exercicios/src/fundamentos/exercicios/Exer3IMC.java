package fundamentos.exercicios;

import java.util.Scanner;

public class Exer3IMC {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o peso: ");
		String kg = entrada.nextLine();
		
		System.out.print("Digite a altura: ");
		String alt = entrada.nextLine();
		
		double peso = Double.parseDouble(kg);
		double altura = Double.parseDouble(alt);
		
		double imc = peso / (altura * altura);
		
		System.out.printf("Com base no peso de %f kg e altura de %f m o imc é: %.2f", peso, altura, imc);
		
		entrada.close();
	}

}
