package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {
	
	public static void main(String[] args) {
		
		//o valor "Observador" será o título da janela
		JFrame janela = new JFrame("Observador");
		
		//define que a aplicação será encerrada quando a janela for fechada
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		janela.setSize(615, 200);
		//para o botão não ficar aparecendo na janela inteira
		janela.setLayout(new FlowLayout());
		//para centralizar onde a janela será aberta na tela
		janela.setLocationRelativeTo(null); //null centraliza na tela do pc

		
		//crio um botão para a janela
		JButton botao = new JButton("Clicar!");
		janela.add(botao);
		
		
	
		//adicionar um obervador ao botão
		botao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Evento ocorreu!");
			}
		});
		//OOOOOOOOOOU
		botao.addActionListener(e -> {System.out.println("Evento ocorreu 2!!!!");});
		
		//mostra a janela
		janela.setVisible(true);
	}
}