package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	
	public static void main(String[] args) {
		
		//importei o JOp para aparece umas janelinha (pop up) mais visual
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
		String valor2 = JOptionPane.showInputDialog("Digite o primeiro número: ");
		
		
		System.out.println( valor1 + valor2);
		
		
		//o Parse double vai converter uma string para double
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		
		System.out.println("Soma é : " + soma);
		System.out.println("Média é : " + soma / 2);
		
	}

}
