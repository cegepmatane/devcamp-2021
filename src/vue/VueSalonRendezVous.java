package vue;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Vue;
import controleur.ControleurMurmure;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class VueSalonRendezVous extends Vue {
	
	protected ControleurMurmure controleur;
	protected static VueSalonRendezVous instance = null; 
	public static VueSalonRendezVous getInstance() {if(null==instance)instance = new VueSalonRendezVous();return VueSalonRendezVous.instance;}; 
	
	private VueSalonRendezVous() 
	{
		super("tableau-honneur.fxml", 1350,744); 
		super.controleur = this.controleur = new ControleurMurmure();
		Logger.logMsg(Logger.INFO, "new VueTableauHonneur()");
	}
		
	public void activerControles()
	{
		super.activerControles();
		
		BadgeRendezVous badge = new BadgeRendezVous("emplacement","date","heure");
		BadgeRendezVous badge2 = new BadgeRendezVous().avecEcusson("emplacement").avecDate("date").avecHeure("heure");
		Pane panneauChat = (Pane) lookup("#chat");

		panneauChat.getChildren().add(badge2);
		
		Text text = new Text();
		Button bouton = new Button();
	}
}
