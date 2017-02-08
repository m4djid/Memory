import java.util.Random;

/**
 * Created by Madjid on 08/02/2017.
 */
public class Plateau {
    Emplacement[][] cartes;
    int[] nbCartes;
    Emplacement[] placesVides;
    int nbPlacesVides;

    public Plateau() {
        Emplacement[][] cartes = new Emplacement[8][2];
        int[] nbCartes = new int[8];
        Emplacement[] placesVides = new Emplacement[16];
        int nbPlacesVides = 16;
    }

    private void retirerPlaceVide(int i) {
        placesVides[i] = null;
        nbPlacesVides --;

    }

    private Emplacement choisirPlaceVide() {
        Random rnd = new Random();
        int a = rnd.nextInt(16);
        Emplacement retour;
        if (placesVides[a] == null) {
            return null;
        }
        else {
            retour = placesVides[a];
            retirerPlaceVide(a);
            return retour;
        }
    }
    
    private Emplacement choisirPlaceVide(int x, int y) {
        Emplacement retour;
        
        if (cartes[x][y] == null) {
            return null;
        }
        else {
            retour = cartes[x][y];
            
            nbPlacesVides --;
            return retour;
        }
    }
}
