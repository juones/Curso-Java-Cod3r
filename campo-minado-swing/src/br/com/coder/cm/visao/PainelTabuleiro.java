package br.com.coder.cm.visao;

import java.awt.GridLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import br.com.coder.cm.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class PainelTabuleiro extends JPanel {
	//panel é um componente que agrupa outros componentes dentro dele, nesse caso botões
	public PainelTabuleiro(Tabuleiro tabuleiro) {
		//para definir como os componentes visuais setão dispostos na tela
		//nesse caso será em linhas e colunas, gridLayout
		setLayout(new GridLayout(tabuleiro.getLinhas(), tabuleiro.getColunas()));
		
		//funcao que vai adicionar os campos aos botões
		tabuleiro.paraCadaCampo(c -> add(new BotaoCampo(c)));
		tabuleiro.registrarObservador(e -> {
			//para mostrar a janela depois de mostrar a mina explodida
			SwingUtilities.invokeLater(() ->{
				if(e.isGanhou()) {
					JOptionPane.showMessageDialog(this, "Ganhou :)");
				} else {
					JOptionPane.showMessageDialog(this, "Perdeu :)");				
				}				
				tabuleiro.reiniciar();
			});
		});
	}
}
