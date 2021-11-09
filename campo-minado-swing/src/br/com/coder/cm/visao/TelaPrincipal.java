package br.com.coder.cm.visao;

import javax.swing.JFrame;

import br.com.coder.cm.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame {
	//setar um construtor dessa classe para intanciá-la no main
	public TelaPrincipal() {
		Tabuleiro tabuleiro = new Tabuleiro(16, 30, 5);
		PainelTabuleiro painelTabuleiro = new PainelTabuleiro(tabuleiro);
		//para adicionar na telaprincipal
		add(painelTabuleiro);
		
		setTitle("Campo Minado");
		setSize(690, 438);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TelaPrincipal();
	}
}
