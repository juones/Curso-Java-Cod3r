package br.com.juones.calc.visao;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Calculadora extends JFrame{

	public Calculadora() {
		
		organizarLayout();
		
		setSize(232, 322);
		//EXIT_ON_CLOSE também é possivel além de DISPOSE_ON_CLOSE
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	private void organizarLayout() {
		setLayout(new BorderLayout());
		
		Display display = new Display();
		display.setPreferredSize(new Dimension(233, 60)); //allterando o tamanho padrão do display
		add(display, BorderLayout.NORTH); //esse add é um método recebido por herança do JFrame
		
		Teclado teclado = new Teclado();
		add(teclado, BorderLayout.CENTER);
	}

	// o main chama o construtor acima
	public static void main(String[] args) {
		new Calculadora();
	}
}
