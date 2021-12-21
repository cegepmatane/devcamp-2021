package vue;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;


// TODO changer symbole de String vers Enum
public class BadgePirate extends AnchorPane
{
	
	protected ImageView dessinEcusson = new ImageView();
	protected ImageView dessinSymbole = new ImageView();
	protected Label slogan = new Label("OUI");
	
	public BadgePirate()
	{
		this.setPrefHeight(50);
		//this.setStyle("-fx-background-color:black;");
		//this.ajouterEcusson("badge-parchemin");
		//this.ajouterSymbole("perroquet");
		//this.ajouterTitre("oui");
	}
	
	public BadgePirate(String symbole)
	{
		this.setPrefHeight(50);
		this.setStyle("-fx-background-color: black;");
		this.ajouterEcusson("badge-parchemin");
		this.ajouterSymbole(symbole);
		this.ajouterTitre("perroquet");
	}
	
	public BadgePirate(String symbole, String couleur)
	{
		this.setPrefHeight(50);
		this.setStyle("-fx-background-color:" + couleur + ";");
		this.ajouterEcusson("badge-parchemin");
		this.ajouterSymbole(symbole);
		this.ajouterTitre("perroquet");
	}
	
	public BadgePirate(String symbole, String couleur, String phrase)
	{
		this.setPrefHeight(50);
		this.setStyle("-fx-background-color:" + couleur + ";");
		this.ajouterEcusson("badge-parchemin");
		this.ajouterSymbole(symbole);
		this.ajouterTitre(phrase);
	}
	
	public BadgePirate(String symbole, String couleur, String phrase, String ecusson)
	{
		this.setPrefHeight(50);
		this.setStyle("-fx-background-color:" + couleur + ";");
		this.ajouterEcusson(ecusson);
		this.ajouterSymbole(symbole);
		this.ajouterTitre(phrase);
	}
	
	private void ajouterEcusson(String ecusson)
	{
		ImageView dessinEcusson = new ImageView();
		dessinEcusson.setImage(new Image("vue/badge/" + ecusson + ".png"));
		dessinEcusson.setFitHeight(100);
		dessinEcusson.setPreserveRatio(true);
		this.getChildren().add(dessinEcusson);
	}
	
	private void ajouterSymbole(String symbole)
	{
		ImageView dessinSymbole = new ImageView();
		
		if(symbole.compareTo("perroquet") == 0)
			dessinSymbole.setImage(new Image("vue/badge/perroquet.png"));

		else if(symbole.compareTo("epeescroisees") == 0)
			dessinSymbole.setImage(new Image("vue/badge/epeescroisees.png"));

		else
			dessinSymbole.setImage(new Image("vue/badge/tsunami.png"));
			
		dessinSymbole.setFitHeight(70);
		dessinSymbole.setLayoutX(16);
		dessinSymbole.setLayoutY(22);
		dessinSymbole.setPreserveRatio(true);
		this.getChildren().add(dessinSymbole);
	}
	
	private void ajouterTitre(String phrase)
	{
		Label slogan = new Label(phrase);
		slogan.setStyle("-fx-font-weight: bold");
		slogan.setLayoutX(15);
		slogan.setLayoutY(5);
		this.getChildren().add(slogan);
	}
	
	public BadgePirate avecEcusson(String ecusson)
	{
		this.ajouterEcusson(ecusson);
		return this;
	}
	
	public BadgePirate avecSymbole(String symbole)
	{
		this.ajouterSymbole(symbole);
		return this;
	}
	
	public BadgePirate colorerDe(String couleur)
	{
		this.setStyle("-fx-background-color:" + couleur + ";");
		return this;
	}
	
	public BadgePirate avecTitre(String texte)
	{
		//this.ajouterTitre(titre);
		return this;
	}
}
