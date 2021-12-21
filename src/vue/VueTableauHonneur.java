package vue;
import com.sun.media.jfxmedia.logging.Logger;

import architecture.Vue;
import controleur.ControleurMurmure;
import javafx.scene.layout.Pane;

public class VueTableauHonneur extends Vue {

	protected ControleurMurmure controleur;
	protected static VueTableauHonneur instance = null; 
	public static VueTableauHonneur getInstance() {if(null==instance)instance = new VueTableauHonneur();return VueTableauHonneur.instance;}; 
	
	private VueTableauHonneur() 
	{
		super("tableau-honneur.fxml", 1350,744); 
		super.controleur = this.controleur = new ControleurMurmure();
		Logger.logMsg(Logger.INFO, "new VueTableauHonneur()");
	}
		
	public void activerControles()
	{
		super.activerControles();
		
	}
}
