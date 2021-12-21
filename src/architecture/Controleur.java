package architecture;

import vue.*;

public class Controleur {

	public static Vue selectionnerVuePrincipale()
	{
		return VueMurmure.getInstance();
	}

	// fonction polymorphique
	public void initialiser()
	{
	}

	public enum ActionNavigation { RETOUR };

	// le controleur decide de l'action selon evenement
	public void notifierEvenement(ActionNavigation action)
	{
		switch(action)
		{
			case RETOUR:
				Navigateur.getInstance().afficherVue(VueMurmure.getInstance());
			break;
		}		
	}

}


