package layout;

import javafx.geometry.Pos;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

public class TesteAnchorPane extends AnchorPane {
	
	 public TesteAnchorPane() {
		 
		 Quadrado q1 = new Quadrado(); //por padrão o anchorPane joga tudo para o topo esquerda
		 setTopAnchor(q1, 10.00);
		 setLeftAnchor(q1, 10.0);
		 
		 Quadrado q2 = new Quadrado();
		 setTopAnchor(q2, 10.00);
		 setRightAnchor(q2, 10.0); //quanditdade de pixels deve ser sempre double
		 
		 Quadrado q3 = new Quadrado();
		 setBottomAnchor(q3, 10.00);
		 setLeftAnchor(q3, 10.0);
		 
		 Quadrado q4 = new Quadrado();
		 setBottomAnchor(q4, 10.00);
		 setRightAnchor(q4, 10.0);
		 		 
		 HBox centro = new HBox(); //vai ficar ancorado nas pontas dos outros quadrados
		 centro.setAlignment(Pos.CENTER);
		 setTopAnchor(centro, 110.0);
		 setBottomAnchor(centro, 110.0);
		 setLeftAnchor(centro, 110.0);
		 setRightAnchor(centro, 110.0);
		 
		 Quadrado q5 = new Quadrado();
		 centro.getChildren().add(q5); //adicionando q5 ao centro
		 
		 
		 getChildren().addAll(q1, q2, q3, q4, centro);
	}
}
