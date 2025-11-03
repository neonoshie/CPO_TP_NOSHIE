/*03/11/25, Paradigme Objet*/
package tp2_bieres_noshie;

/**
 *
 * @author neono
 */
public class TP2_Bieres_NOSHIE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvee des trolls", 7.0, "Dubuisson") ;
        uneBiere.lireEtiquette();
        
        BouteilleBiere deuxBiere = new BouteilleBiere("Leffe", 6.6,"Abbaye de Leffe");
        deuxBiere.lireEtiquette();
        
        BouteilleBiere troisBiere = new BouteilleBiere("Despe", 7.2,"Mexico City");
        troisBiere.lireEtiquette();
        
        BouteilleBiere quatreBiere = new BouteilleBiere("1664", 7.6,"Le louvre");
        quatreBiere.lireEtiquette();
        
        BouteilleBiere cinqBiere = new BouteilleBiere("Corona", 6.9,"Voiture");
        cinqBiere.lireEtiquette();
    }
    
}
