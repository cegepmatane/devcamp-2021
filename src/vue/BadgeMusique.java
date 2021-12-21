package vue;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class BadgeMusique extends AnchorPane {
	
	public BadgeMusique()
	{
		this.setPrefHeight(100);
		
		ImageView masqueEcusson = new ImageView();
		masqueEcusson.setImage(new Image("vue/badge/badgemusique.png"));
		masqueEcusson.setFitHeight(100);
		masqueEcusson.setPreserveRatio(true);
		//badge.getChildren().add(masqueEcusson);
		this.getChildren().add(masqueEcusson);
		
		//Affichage de la couleur
		this.setStyle("-fx-background-color:blue;");
		
		//Affichage du symbole sur l'image
		ImageView dessinSymbole = new ImageView();
		dessinSymbole.setImage(new Image("vue/badge/pianokey.png"));
		dessinSymbole.setFitHeight(40);
		dessinSymbole.setLayoutX(20);
		dessinSymbole.setLayoutY(60);
		dessinSymbole.setPreserveRatio(true);
		this.getChildren().add(dessinSymbole);
		
		//Affichage du texte sur l'image
		Label slogan = new Label("Love Music");
		slogan.setStyle("-fx-font-weight:bold");
		slogan.setLayoutX(30);
		slogan.setLayoutY(3);
		this.getChildren().add(slogan);
	}

}
