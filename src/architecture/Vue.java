package architecture;

import java.io.IOException;

import com.sun.media.jfxmedia.logging.Logger;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import vue.*;

public class Vue extends Scene{
	
	protected static FXMLLoader parseur = null;
	protected Controleur controleur = null;
	
	public Vue(String fxml)
	{
		super(parser(fxml, null),1000,1000);
		this.controleur = null;		
		this.getRoot().applyCss();
		this.getRoot().layout();
	}
	public Vue(String fxml, int largeur, int hauteur)
	{
		super(parser(fxml, null),largeur,hauteur);
		this.controleur = null;		
		this.getRoot().applyCss();
		this.getRoot().layout();
	}

	public Vue(String fxml, Controleur controleur)
	{
		super(parser(fxml, controleur),1000,1000);
		this.controleur = controleur;
		this.getRoot().applyCss();
		this.getRoot().layout();
	}

	public static Parent parser(String fxml, Controleur controleur)
	{
		parseur = new FXMLLoader();
		parseur.setLocation(VueMurmure.class.getResource(fxml));
		if(null != controleur) parseur.setController(controleur);
		try {
			return parseur.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("fin parser");
		return null;
	}

	public void activerControles()
	{	
		Logger.logMsg(Logger.INFO, "Vue.activerControles()");
	}		
	
	public Controleur getControleur()
	{
		return this.controleur;
	}

}
