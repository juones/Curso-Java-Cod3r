package layout;

import javafx.application.Platform;
import javafx.scene.layout.StackPane;

public class TesteStackPane extends StackPane {
	
	public TesteStackPane() {
		
		Caixa c1 = new Caixa().comTexto("1");
		Caixa c2 = new Caixa().comTexto("2");
		Caixa c3 = new Caixa().comTexto("3");
		Caixa c4 = new Caixa().comTexto("4");
		Caixa c5 = new Caixa().comTexto("5");
		Caixa c6 = new Caixa().comTexto("6");
		
		getChildren().addAll(c2, c3, c4, c5, c6, c1);
		
		//Todas as cores se sobrepoem e somente é apresentada a caixa c6
		// agora vamos fazer um métoro que alterna entre as caixa com o mouse
		
		setOnMouseClicked(e -> {
			//se o eixo x da cena for maior do que a metade da cena foi click no lado esquedo da tela
			if(e.getSceneX() > getScene().getWidth() / 2) {
				getChildren().get(0).toFront(); //pega o indice 0 e joga na frente das stacks
			} else {
				getChildren().get(5).toBack();
			}
		});
		
		Thread t = new Thread(() -> {
			while(true) {
				try {
					Thread.sleep(3000); //3000 milisegundos == 3 segundos
					//bloco necessário para executar o comando javafx dentro da thread
					Platform.runLater(() -> {
						getChildren().get(0).toFront();
					});					
				} catch (Exception e) {
					
				}
			}
		});
		
		t.setDaemon(true);
		t.start();
	}
}
