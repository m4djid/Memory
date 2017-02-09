package memory;

/**
 * @author pierre.vuckovic
 */
public class Plateau {
    // ATTRIBUTS
    private Emplacement[][] cartes;
    private int[] nbCartes;
    private Emplacement[] placesVides;
    private int nbPlacesVides;
    
    // CONSTRUCTEURS
    public Plateau (){
        Emplacement[][] cartes = new Emplacement[8][2];
        int[] nbCartes = new int[2];
        Emplacement[] placesVides = new Emplacement[16];
        int nbPlacesvides = 16;  
    }  
    
    // METHODES
    private boolean poserCarte(int carte, Emplacement pos){
        
        if(pos == null){
            
        }
        
    }
    
}
