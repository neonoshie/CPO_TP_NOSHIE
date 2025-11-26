
package Personnages;

import Armes.Arme;
import Armes.Baton;

public class Magicien extends Personnage{
    
   boolean confirme;

    public Magicien(String Nom, int HP,boolean confirme ) {
        super(Nom, HP);
        this.confirme = confirme;
        nbMagiciens++;
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
    
    public static int nbMagiciens = 0;
    
    @Override
    public void attaquer(Personnage cible){
        if (Arme_en_Main == null){
           System.out.println(nom + " n'a pas d'arme pour attaquer !");
           return;
        }
        
        int degats = Arme_en_Main.nivAtk;
        
        if(Arme_en_Main.getType() == 1){
            Baton b = (Baton) Arme_en_Main;
            degats *= b.getAge();
            this.seFatiguer();
        }
        if (this.confirme){
            degats /= 2;
        }
        System.out.println(nom + " attaque " + cible.nom + " et inflige " + degats + " dégâts !");
        cible.estAttaque(degats);
    }
    
    @Override
    public String toString() {
        return "Magicien : " + getNom() +"  Vie : " + getNivVie() +" Confirme : " + confirme;
               }
    
   @Override
    public void finalize(){
        nbMagiciens--;
        super.finalize();
    }
    
}