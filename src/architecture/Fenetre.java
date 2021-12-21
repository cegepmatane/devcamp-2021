package architecture;

import javafx.application.Platform;
import javafx.stage.Stage;

public class Fenetre extends Navigateur {

	@Override
	public void start(Stage stade) throws Exception {
		this.stade = stade;
		
		Platform.runLater(new Runnable() {
            @Override public void run() {
            	try {
					//Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
            	Controleur.selectionnerVuePrincipale().activerControles();
        		Controleur.selectionnerVuePrincipale().getControleur().initialiser();
            	afficherVue(Controleur.selectionnerVuePrincipale()); // fonction de Navigateur
            }
        });
	}

}
