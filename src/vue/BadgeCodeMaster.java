package vue;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class BadgeCodeMaster extends AnchorPane{
	
	protected Label slogan = new Label("Code Master");
	protected ImageView masqueEcuisson = new ImageView();
	protected ImageView dessinSymbole = new ImageView();
	
	public BadgeCodeMaster()
	{
		this.setPrefHeight(100);
		this.setStyle("-fx-background-image: url('https://d11wkw82a69pyn.cloudfront.net/siteassets/images/r20/r20_21_05_2019_1440x450_low.jpg')");
	}
	
	private void ajouterTitre(String titre)
	{
		slogan.setText(titre);
		slogan.setStyle("-fx-text-fill : white; -fx-font-weight: bold");
		slogan.setLayoutX(7);
		slogan.setLayoutY(30);
		this.getChildren().add(slogan);
	}
	
	private void ajouterEcuisson(String ecuisson)
	{
		if(ecuisson.compareTo("ecuisson") == 0)
		{
			masqueEcuisson.setImage(new Image("vue/badge/badge.png"));
		}
		else 
		{
			masqueEcuisson.setImage(new Image("vue/badge/badge.png"));
		}
		
		masqueEcuisson.setFitHeight(100);
		masqueEcuisson.setPreserveRatio(true);
		this.getChildren().add(masqueEcuisson);
	}
	
	private void ajouterSymbole(String symbole)
	{
		if(symbole.compareTo("logo") == 0)
		{
			dessinSymbole.setImage(new Image("vue/badge/logo.png")); 
		}
		else if (symbole.compareTo("logo2") == 0)
		{
			dessinSymbole.setImage(new Image("vue/badge/logo2.png")); 
		}
		else 
		{
			dessinSymbole.setImage(new Image("vue/badge/logo.png")); 
		}
		
		dessinSymbole.setFitHeight(40);
		dessinSymbole.setLayoutX(20);
		dessinSymbole.setLayoutY(60);
		dessinSymbole.setPreserveRatio(true);
		this.getChildren().add(dessinSymbole);
	}
	
	public BadgeCodeMaster avecEcuisson(String ecuisson)
	{
		this.ajouterEcuisson(ecuisson);
		return this;
	}
	
	public BadgeCodeMaster avecSymbole(String symbole)
	{
		this.ajouterSymbole(symbole);
		return this;
	}
	
	public BadgeCodeMaster avecTitre(String titre)
	{
		this.ajouterTitre(titre);
		return this;
	}
	
	public BadgeCodeMaster couleur(String couleur)
	{
		this.setStyle("-fx-background-color :" +couleur+ ";");
		return this;
	}
	

}
