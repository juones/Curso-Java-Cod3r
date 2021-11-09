package fundamentos.exercicios;

import java.util.Scanner;

public class Exer1CelsiusFahrenheit {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em Celsius: ");
		double celsius = entrada.nextDouble();
		double formula = 9.0/5.0;
		
		double fahrenheit = (celsius * formula) + 32;
		
		System.out.printf("A empteratura %f em fahrenheit é: %.2f", celsius, fahrenheit);
		
		entrada.close();
		
	}

}
