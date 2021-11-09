module exerciciosfx {
	
	requires javafx.controls; //necessário para importar o extends application
	requires javafx.fxml;
	requires org.controlsfx.controls;
	
	//o javaFX precisa fazer uma reflection para acessar as classes do pacote basico
	//sem isso ele não executa
	opens basico;
	
	opens layout;
	opens fxml;
}