package layout;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Quadrado extends Rectangle {
	
	//dica: o Rectangle não suporta texto e nem altura e largura minimo, somente altura e largura
	
	private static int i = 0;
	
	private String[] cores = {
		"#c33c5e", "#39aac6", "#28d79a", 
		"#fb750e", "#6657a8", "#f9060e" 
	};
	
	public Quadrado() {
		this(100);
	}
	
	//esse construtor é chamado pelo construtor acima
	public Quadrado(int tamanho) {
		
		setWidth(tamanho);
		setHeight(tamanho);
		
		setFill(Color.web(cores[i]));
		
		i++;
		if(i == 6) i = 0;
	}
}
