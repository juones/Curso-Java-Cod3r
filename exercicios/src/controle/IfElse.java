package controle;

import javax.swing.JOptionPane;

public class IfElse {
	
	public static void main(String[] args) {
		
		//JOptionPane.showInputDialog abre um popup para ler como um scanner
		String valor = JOptionPane.showInputDialog("Informe o número: ");
		
		//converte string em inteiro
		int numero = Integer.parseInt(valor);
		
		
		// se é par ou impar
		if (numero % 2 == 0) {
			System.out.println("Número é par!");
		} else {
			System.out.println("Número é impar!");
		}
		
	}

}
