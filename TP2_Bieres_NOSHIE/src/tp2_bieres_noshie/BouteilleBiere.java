/**/
package tp2_bieres_noshie;

public class BouteilleBiere {
    
    String nom; 
    double degreAlcool; 
    String brasserie;
    boolean ouverte = false; 
    
    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) { 
        nom = unNom; 
        degreAlcool = unDegre; 
        brasserie = uneBrasserie;
        
    } 
    public boolean Decapsuler(){
        if ( ouverte == false){
            ouverte = true;
        }
        else {
            System.out.println("erreur : biere déjà ouverte ");
        }
        return false;
    }

public void lireEtiquette() {
    System.out.println("Bouteille de "+ nom + " ("+ degreAlcool + " degres) "+ouverte+" \nBrasserie : "+ brasserie);
    
}

    @Override
    public String toString() {
       String chaine_a_retourner; 
       chaine_a_retourner = nom + " (" + degreAlcool + " degrés) Ouverte ? ";   
       if (ouverte == true ) chaine_a_retourner += "oui" ; 
       else chaine_a_retourner += "non" ; 
       return chaine_a_retourner ;
    }

}