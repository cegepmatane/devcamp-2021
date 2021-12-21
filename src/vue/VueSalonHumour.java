package vue;

public class VueSalonHumour {
	
	public static void main() {
		
		String CLE = "xoxp-";
		String URL_ENVOYER_MESSAGE = "https://slack.com/api/chat.postMessage";

		
		
		String SALON = "#-cours-";
		
		String message = "";
		
		if message.startwith("/humour"){
			message = DireBlague();
		}
		
		String envoi = "{'channel':'"+SALON+"','text':'"+message+"'}";
		
		try {
			URL urlAjouterMessage = new URL(URL_ENVOYER_MESSAGE);
			HttpURLConnection connexion = (HttpURLConnection) urlAjouterMessage.openConnection();
			
			System.out.println("Envoi du message: "+message);
			
			//"Content-Type" contient "application/json;charset=iso-8859-1"
			connexion.setRequestProperty("Content-Type", "application/json;charset=iso-8859-1");
			
			//"Authorization" contient "Bearer xoxp-lerestedelacle"
			connexion.setRequestProperty("Authorization", "Bearer "+CLE);
		
			connexion.setRequestMethod("POST");
			connexion.setDoOutput(true);
			
			OutputStream fluxEcriture = (OutputStream) connexion.getOutputStream();
			OutputStreamWriter envoyeur = new OutputStreamWriter(fluxEcriture);
			envoyeur.write(envoi);
			envoyeur.close();		
			connexion.disconnect();



		} catch (IOException e) {
			
			
			
			e.printStackTrace();
		}
		
	}
	
	public static String DireBlague(){
		
		int i = 0;
		String Blague = "";
		
		switch (i) {
		    case 1 :
		        Blague = "La plage dit � l�oc�an: dire que tout le monde aime l�eau c�est assez vague.";
		        i = i+1;
		        break;
		        
		    case 2 :
		        Blague = "C'est une fleur qui cours pis elle se plante";
		        i = i+1;
		        break;
		        
		    case 3 :
		        Blague = "Je suis partie faire une marche je suis revenue avec un escalier";
		        i = i+1;
		        break;
		        
		    case 4 :
		        Blague = "J'ai racont� une blague a mon linge il �tait plier en deux";
		        i = i+1;
		        break;
		        
		    case 5 :
		        Blague = "Comment appelle-t-on un alligator qui enqu�te?\r\n" + 
		        		"Un investi-gator.";
		        i = i+1;
		        break;
		        
		    case 6 :
		        Blague = "Pourquoi tant de poissons vivent-ils dans l�eau sal�e?\r\n" + 
		        		"Parce que l�eau poivr�e les ferait �ternuer!";
		        i = i+1;
		        break;
		        
		    case 7 :
		        Blague = "Si une horloge sonne 13 fois, quelle heure est-il?\r\n" + 
		        		"Il est l�heure d�acheter une nouvelle horloge!";
		        i = i+1;
		        break;
		        
		    case 8 :
		        Blague = "Pourquoi un ordinateur voudrait-il se gratter?\r\n" + 
		        		"Parce qu�il a des puces!";
		        i = i+1;
		        break;
		        
		    case 9 :
		        Blague = "Sais-tu ce que la femme � Bill � Gates a dit le lendemain de leurs nuit de noce:\r\n" + 
		        		"Oh yeah je comprends pourquoi tu as appel� ta compagnie �MicroSoft� !";
		        i = i+1;
		        break;
		        
		    case 10 :
		        Blague = "Comment un informaticien tente-t-il de r�parer sa voiture lorsqu�elle a un probl�me?\r\n" + 
		        		"Il sort de la voiture, ferme toutes les fen�tres, retourne dans la voiture, et essaie de red�marrer.";
		        i = i+1;
		        break;
		        
		    case 11 :
		        Blague = "Si je t�l�charge ill�galement depuis la Martinique�\r\n" + 
		        		"\r\n" + 
		        		"Je suis un pirate des Cara�bes ?";
		        i = i+1;
		        break;
		        
		    case 12 :
		        Blague = "Une station de m�tro, c�est l�endroit o� le m�tro s�arr�te. Une station de RER, c�est l�endroit o� le RER s�arr�te. Devant moi, j�ai une Station de Travail�";
		        i = i+1;
		        break;
		        
		    case 13 :
		        Blague = "Quand quelqu'un de triste joue aux jeux vid�o pour oublier, on peut dire qu'il se console.";
		        i = i+1;
		        break;
		        
		    case 14 :
		        Blague = "T'as pris quoi comme r�solution pour cette nouvelle ann�e ? \r\n" + "4K.";
		        i = i+1;
		        break;
	      
	    }
	    return Blague;
	}
	
}
