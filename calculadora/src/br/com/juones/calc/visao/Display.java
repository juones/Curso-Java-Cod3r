package br.com.juones.calc.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.juones.calc.modelo.Memoria;
import br.com.juones.calc.modelo.MemoriaObservador;

@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObservador {
	
	private JLabel label; //conteúdo que será exibido no display
	
	public Display() {
		
		Memoria.getInstancia().adicionarObservador(this);
		
		setBackground(new Color(46, 49, 50));
		label = new JLabel(Memoria.getInstancia().getTextoAtual());
		label.setForeground(Color.WHITE);
		label.setFont(new Font("courier", Font.PLAIN, 30));
		
		//para alterar a posição em que o conteúdo será apresentado no display
		setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25)); //FlowLayout.posição, gap horizontal, gap vertical
		add(label);
	}
	
	@Override
	public void valorAlterado(String novoValor) {
		//para atualizar o valor no display a cada inserção
		label.setText(novoValor);
	}
}