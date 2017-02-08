import java.util.Random;

/**
 * Created by Madjid on 08/02/2017.
 */
public class Plateau {
    // ATTRIBUTS
    Emplacement[][] cartes;
    int[] nbCartes;
    Emplacement[] placesVides;
    int nbPlacesVides;

    // CONSTRUCTEURS
    public Plateau() {
        Emplacement[][] cartes = new Emplacement[8][2];
        int[] nbCartes = new int[8];
        Emplacement[] placesVides = new Emplacement[16];
        int nbPlacesVides = 16;
    }
    
    // METHODES
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
    
    /* Pierre */
    private boolean poserCarte(int carte, Emplacement pos) {
        
        cartes
                nbCartes
        
        if(pos == null){
            return false;
        }
        else{
            return true;
        }
        
        
    }
    
    /* Pierre */
    private boolean poserCarte(int carte, int x, int y) {
        
        
        
        
        return false;
    }

}
