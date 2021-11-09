package arrays;

import java.util.Scanner;

public class DesafioArray {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite quantas notas você deseja incluir: ");
		
		final int quantNotas = entrada.nextInt();
		
		double[] notasAluno = new double [quantNotas];
		
		for (int i = 0; i < notasAluno.length; i++) {
			System.out.print("Inrira a nota "+ (i + 1) + ": ");
			notasAluno[i] = entrada.nextDouble();
		}
		
		double soma = 0.0;
		for(double nota: notasAluno) {
			soma += nota;
		}
		
		System.out.println("A média do aluno é: " + soma / notasAluno.length); //Aqui poderia ser (soma / quantNotas)?
				
		entrada.close();
	}

}
