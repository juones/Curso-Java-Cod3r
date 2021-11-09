package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o comando: ");
		String comando = entrada.nextLine();
		
		while (!"Sair".equalsIgnoreCase(comando)) {
			System.out.print("Comando incorreto! \n Digite novamente: ");
			comando = entrada.nextLine();
		}
		
		entrada.close();
	}

}
