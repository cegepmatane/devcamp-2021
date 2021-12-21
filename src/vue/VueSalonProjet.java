package vue;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Vue;
import controleur.ControleurMurmure;
import javafx.scene.layout.Pane;

public class VueSalonProjet extends Vue {
	
	protected ControleurMurmure controleur;
	protected static VueSalonProjet instance = null; 
	public static VueSalonProjet getInstance() {if(null==instance)instance = new VueSalonProjet();return VueSalonProjet.instance;}; 
	
	private VueSalonProjet() 
	{
		super("murmure.fxml", 1350,744); 
		super.controleur = this.controleur = new ControleurMurmure();
		Logger.logMsg(Logger.INFO, "new VueMurmure()");
	}
		
	public void activerControles()
	{
		super.activerControles();
		
		Pane panneauChat = (Pane) lookup("#chat");
		
		BadgeCodeMaster badge = new BadgeCodeMaster().avecEcuisson("").avecSymbole("").avecTitre("Nice code !").couleur("lightblue");
	
		panneauChat.getChildren().add(badge);
	}

}
