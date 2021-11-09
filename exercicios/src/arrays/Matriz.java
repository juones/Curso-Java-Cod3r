package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de alunos: ");
		int quantAlunos = entrada.nextInt();
		
		System.out.print("Digite a quantidade de notas: ");
		int quantNotas = entrada.nextInt();
		
		double[][] notasDaTurma = new double [quantAlunos][quantNotas];
		
		
		double total = 0;
		//trabalhando com matriz, é necessário adicionar o indice no for interno.
		for (int a = 0; a < notasDaTurma.length; a++) {
			for (int n = 0; n < notasDaTurma[a].length; n++) {
			System.out.print("Inrira a nota "+ (n + 1) + " para o aluno: " + (a + 1) + ": ");
			notasDaTurma[a][n] = entrada.nextDouble();
			total += notasDaTurma[a][n];
			}
		}	
		
		double media = total / (quantAlunos * quantNotas);
		System.out.println("A média da turma é: " + media);
		
		//para percorrer a matriz e imprimir os resultados
		for(double[] notasDoAluno: notasDaTurma) {
			System.out.println(Arrays.toString(notasDoAluno));
			
		}
		
		entrada.close();
	}

}
