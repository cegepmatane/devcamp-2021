package vue;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;


public class BadgeRendezVous extends AnchorPane {
	
	protected ImageView dessinCarte = new ImageView();
	protected Label slogan = new Label("OUI");
	
	public BadgeRendezVous()
	{
		this.setPrefHeight(50);
		this.setStyle("-fx-background-color:black;");
		this.ajouterCarte("emplacement");
		this.ajouterDate("10/03/21");
		this.ajouterHeure("Ecurie");
	}
	
	public BadgeRendezVous(String carte)
	{
		this.setPrefHeight(50);
		this.setStyle("-fx-background-color:black;");
		this.ajouterCarte(carte);
		this.ajouterDate("10/03/21");
		this.ajouterHeure("10h30");
	}
	
	public BadgeRendezVous(String carte, String date)
	{
		this.setPrefHeight(50);
		this.setStyle("-fx-background-color:black;");
		this.ajouterCarte(carte);
		this.ajouterDate(date);
		this.ajouterHeure("10h30");
	}
	
	public BadgeRendezVous(String carte, String date, String heure)
	{
		this.setPrefHeight(50);
		this.setStyle("-fx-background-color:black;");
		this.ajouterCarte(carte);
		this.ajouterDate(date);
		this.ajouterHeure(heure);
	}
	
	public BadgeRendezVous(String carte, String date, String heure, String couleurRecue)
	{
		this.setPrefHeight(50);
		this.ajouterCouleur(couleurRecue);
		this.ajouterCarte(carte);
		this.ajouterDate(date);
		this.ajouterHeure(heure);
	}
	
	private void ajouterCarte(String carte)
	{
		if(carte.compareTo("emplacement") == 0) {
			dessinCarte.setImage(new Image("vue/badge/blason.png"));
		}
		
		ImageView dessinCarte = new ImageView();
		dessinCarte.setImage(new Image("vue/badge/blason.png"));
		dessinCarte.setFitHeight(100);
		dessinCarte.setPreserveRatio(true);
		this.getChildren().add(dessinCarte);
	}
	
	private void ajouterDate(String date)
	{
		Label slogan = new Label(date);
		slogan.setStyle("-fx-font-weight: bold; -fx-text-color: white");
		slogan.setLayoutX(58);
		slogan.setLayoutY(35);
		this.getChildren().add(slogan);
	}
	
	private void ajouterHeure(String heure)
	{
		Label slogan = new Label(heure);
		slogan.setStyle("-fx-font-weight: bold; -fx-text-color: white");
		slogan.setLayoutX(58);
		slogan.setLayoutY(35);
		this.getChildren().add(slogan);
	}
	
	private void ajouterCouleur(String couleur) {
		this.setStyle("-fx-background-color:" + couleur + ";");
	}
	
	public BadgeRendezVous avecEcusson(String Carte) {
		this.ajouterCarte(Carte);
		return this;
	}
	
	public BadgeRendezVous avecDate(String date) {
		this.ajouterDate(date);
		return this;
	}
	
	public BadgeRendezVous avecHeure(String heure) {
		this.ajouterHeure(heure);
		return this;
	}
	
	public BadgeRendezVous coloreDe(String couleur) {
		this.ajouterCouleur(couleur);
		return this;
	}
}
