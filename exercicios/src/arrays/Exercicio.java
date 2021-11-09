package arrays;

import java.util.Arrays;

public class Exercicio {
	
	public static void main(String[] args) {
		
		//criando um array de quatro valores
		double [] notasAlunoA = new double[4];
		
		System.out.println(Arrays.toString(notasAlunoA));

		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		System.out.println(notasAlunoA[0]);
		//Para imprimir o ultimo valor do array
		System.out.println(notasAlunoA[notasAlunoA.length -1]);
		// para imprimir um array é necessário importar a classe Arrays do java util e usar o .toString
		System.out.println(Arrays.toString(notasAlunoA));
		
		//para percorrer um array é possível criar uma variável fora para receber o resultado e utilizar um for
		double totalAlunoA = 0;
		for(int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
		}
		
		System.out.println(totalAlunoA / notasAlunoA.length);
		
		
		//para declarar um array e atribuir valores de forma literal, é necessário utilizar as {}
		//também é possível adicionar o valor de uma variável ao array
		final double notaArmazenada = 5.9;
		double[] notasAlunoB = { 6.9, 8.9, notaArmazenada, 10 };
		
		//utilizando o command + espaço depois de um array o for já vai se auto completar
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		
		System.out.println(totalAlunoB / notasAlunoB.length);
	}

}
