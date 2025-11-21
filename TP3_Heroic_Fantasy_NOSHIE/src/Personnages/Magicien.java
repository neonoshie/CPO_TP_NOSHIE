
package Personnages;

import Armes.Arme;

public class Magicien extends Personnage{
    
   boolean confirme;

    public Magicien(String Nom, int HP,boolean confirme ) {
        super(Nom, HP);
        this.confirme = confirme;
    }
    
   @Override
    public int getNbArmesPredilection(){
        int compteur = 0;
        
        for (Arme a : inventaire){
            if (a.getType() == 2){
                compteur++;
            }
        }
        return compteur;
    }

    public boolean isConfirme() {
        return confirme;
    }

    public void setConfirmation(boolean confirme) {
        this.confirme = confirme;
    }

    
    @Override
    public String toString() {
        return "Magicien : " + getNom() +"  Vie : " + getNivVie() +" Confirmé : " + confirme;
               }
}