package controle.exercicios;

import java.util.Scanner;

public class exercicio3 {
	
//	3. Criar um programa que receba duas notas parciais, calcular a média final. 
//	Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado", 
//	se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação", 
//	caso contrário imprime no console "Reprovado".
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		double nota1 = entrada.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if (media >= 7.0) {
			System.out.println("Aprovado");
		} else if (media < 7.0 &&  media > 4.0) {
			System.out.println("Recuperação");
		} else {
			System.out.println("Reprovado");
		}
		
		System.out.println(media);
		
		entrada.close();
		
	}

}
