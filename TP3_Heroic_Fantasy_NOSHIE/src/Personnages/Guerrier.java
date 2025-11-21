
package Personnages;

import Armes.Arme;

public class Guerrier extends Personnage {
    
    boolean Cheval;

    public Guerrier(String Nom, int HP,boolean Cheval ) {
        super(Nom, HP);
        this.Cheval = Cheval;
    }
    @Override
    public int getNbArmesPredilection(){
        int compteur = 0;
        
        for(Arme a : inventaire){
            if(a.getType() ==1){
                compteur++;
            }
        }
        return compteur;
    } 
    public boolean isCheval() {
        return Cheval;
    }

    public void setCheval(boolean Cheval) {
        this.Cheval = Cheval;
    }

      @Override
    public String toString() {
        return "Guerrier : " + getNom() +" Vie : " + getNivVie() +" À cheval : " + Cheval;
    }
    
    
    
}
