package testes;

import java.util.Scanner;

public class testeConsole {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();

		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Produto que está vendendo: ");
		String prod = entrada.nextLine();
		
		System.out.print("Preencha o que acompanha: ");
		String acompanha = entrada.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.print("Digite o preço: ");
		int preco = entrada.nextInt();
		
		System.out.print("Preencha o desconto: ");
		int desconto = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos e está vendendo seu %s por %d. \nO %s acompanha %s e pagando à vista você recebe %d porcento de desconto", nome, sobrenome, idade, prod, preco, prod, acompanha, desconto);
		
		entrada.close();
		
	}

}