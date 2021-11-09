package fundamentos.exercicios;

import java.util.Scanner;

public class Exer2FahrenheitCelsius {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em Fahrenheit: ");
		double fahrenheit = entrada.nextDouble();
		double formula = 5.0/9.0;
		
		double celsius = (fahrenheit - 32) * formula;
		
		System.out.printf("A empteratura %f em celsius é: %.2f", fahrenheit, celsius);
		
		entrada.close();
	}

}
