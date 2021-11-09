package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		// a partir do scanner pegar 3 strings que recebem salarios tanto com . ou com , e converter para double e pegar a média
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Dígite o salário de Janeiro : ");
		String sal1 = entrada.nextLine(); //poderia usar o replace aqui também
		
		System.out.print("Dígite o salário de Fevereiro : ");
		String sal2 = entrada.nextLine(); //poderia usar o replace aqui também
		
		System.out.print("Dígite o salário de Março : ");
		String sal3 = entrada.nextLine(); //poderia usar o replace aqui também
		
		System.out.printf("Salário de Janeiro foi R$ %s, o de Fevereiro foi R$ %s e o de Março foi R$ %s \n", sal1, sal2, sal3);
		
		double salario1 = Double.parseDouble(sal1.replace(",", "."));
		double salario2 = Double.parseDouble(sal2.replace(",", "."));
		double salario3 = Double.parseDouble(sal3.replace(",", "."));
		
		double soma = salario1 + salario2 + salario3;
		
		System.out.println("A soma é : R$ " + soma);
		System.out.println("A média é : R$ " + soma / 3);
		
		entrada.close();

	}

}
