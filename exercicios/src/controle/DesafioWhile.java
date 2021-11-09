package controle;

import java.util.Scanner;

public class DesafioWhile {
	
	public static void main(String[] args) {
		
		//calcular média de notas de uma turma
		// nova deve ser >= 0 || <= 10
		// armazenar nota na variável total
		// contatorEntrada acumula a quantidade de notas digitadas
		// quando o usuário digitar -1 o sistema encerra
		
		Scanner entrada = new Scanner(System.in);
		
		int contadorEntrada = 0;
		double nota = 0;
		double total = 0;
		
		while (nota != -1) {
			System.out.print("Digite a próxima nota ou -1 para sair: ");
			nota = entrada.nextDouble();
			//bloco if adicionado pois o valor de -1 não deve ser atribuido à média
			if(nota <= 10 && nota >= 0) {
			total += nota;
			contadorEntrada++;
			} else if (nota != -1) {
				System.out.println("Nota inválida!!! Digite a próxima nota: ");
			}
			
		}
		
		System.out.println("A média é: " + total / contadorEntrada);
		
		entrada.close();
		
	}

}