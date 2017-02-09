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
        nbPlacesVides--;

    }

    private Emplacement choisirPlaceVide() {
        Random rnd = new Random();
        int a = rnd.nextInt(16);
        Emplacement retour;
        if (placesVides[a] == null) {
            return null;
        } else {
            retour = placesVides[a];
            retirerPlaceVide(a);
            return retour;
        }
    }
    /*
    * Author : Paolo
    */
    private Emplacement choisirPlaceVide(int x, int y) {
        Emplacement retour;
        for (int i = 0; i <= nbPlacesVides; i++) {
            if (placesVides[i] == cartes[x][y]) {
                retour = cartes[x][y];
                retirerPlaceVide(i);
                return retour;
            }
        }
        return null;

    }

    /*
    * Author : Pierre
    */
    private boolean poserCarte(int carte, Emplacement pos) {

        if (pos == null) {
            return false;
        } else {
            nbCartes[carte] = carte;
            retirerPlaceVide(carte);
            cartes[pos.getX()][pos.getY()] = pos;
            return true;
        }


    }

    private boolean poserCarte(int carte, int x, int y) {
        if (cartes[x][y] != null || nbCartes[carte] == carte) {
            return false;
        }
        else {

            return true;
        }

    }

    /*
    * Author : Gilles
    */
    public void distribuer() {
        for (int i = 0; i < 8; i++) {
            if (cartes[i] == null) {
                cartes[i][0] = choisirPlaceVide();
                poserCarte(i, cartes[i][0]);
                cartes[i][1] = choisirPlaceVide();
                poserCarte(i, cartes[i][1]);
            }
        }

    }

    /*
    * Méthode donnée avec l'énnoncé
    */

    public void affiche() {
        char[][] plateau = new char[4][4];
        for (int carte = 0; carte < 8; carte++) {
            for (int i = 0; i < nbCartes[carte]; i++) {
                Emplacement pos = cartes[carte][i];
                plateau[pos.getX()][pos.getY()] = (char)('0'+carte);
            }
        }
        for (int i = 0; i < nbPlacesVides; i++) {
            Emplacement pos = placesVides[i];
            plateau[pos.getX()][pos.getY()] = '.';
        }
        for (int y = 0; y < 4; y++) {
            for (int x = 0; x < 4; x++) {
                System.out.println();
            }
        }
    }

    public static void main (String[] args) {
        Plateau p = new Plateau();

        p.poserCarte(1,2,3);
        p.poserCarte(3,0,1);
        p.distribuer();
        p.affiche();
    }
}
