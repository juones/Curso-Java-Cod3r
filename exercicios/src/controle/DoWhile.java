package controle;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o comando: ");
		String comando = entrada.nextLine();
		
		
		do {System.out.print("Comando incorreto! \n Digite novamente: ");
			comando = entrada.nextLine();
			} while(!"Sair".equalsIgnoreCase(comando));
		
		
		entrada.close();
	}

}
