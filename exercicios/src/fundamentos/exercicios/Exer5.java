package fundamentos.exercicios;

import java.util.Scanner;

public class Exer5 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a base: ");
		double base = entrada.nextDouble();
		
		System.out.print("Digite a altura: ");
		double altura = entrada.nextDouble();
		
		double area = (base * altura) / 2;
		
		System.out.println("A área do triangulo é : " + area);
		
		entrada.close();

	}

}
