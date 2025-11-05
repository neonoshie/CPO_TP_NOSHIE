/**/
package tp2_relation_1_noshie;


public class Voiture {
    String Modele;
    String Marque;
    int PuissanceCV;
    Personne proprietaire;
    
    public Voiture(String Mod, String Mar, int PCV){
       this.Modele = Mod;
       this.Marque = Mar;
       this.PuissanceCV = PCV;
       this.proprietaire = null;
       
    }

    @Override
    public String toString() {
        
        return "Voiture " + Modele + " de marque " + Marque + " (" + PuissanceCV + "CV)";
    }
    
}
