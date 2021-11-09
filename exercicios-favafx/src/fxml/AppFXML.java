package fxml;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AppFXML extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		//definindo o css
		String arquivoCSS = getClass().getResource("/fxml/Login.css").toExternalForm(); //por ser URL tenho que usar o to externalform
		
		//definindo o caminho de leitura do fxml
		URL arquivoFXML = getClass().getResource("/fxml/Login.fxml");
		GridPane raiz = FXMLLoader.load(arquivoFXML);
		
		Scene cena = new Scene(raiz, 350, 350);
		cena.getStylesheets().add(arquivoCSS);
		
		primaryStage.setResizable(false); // para que o tamanho da tela não possa ser alterado
		primaryStage.setTitle("Tela de login");
		primaryStage.setScene(cena);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}