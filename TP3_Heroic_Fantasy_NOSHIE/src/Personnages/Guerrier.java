
package Personnages;

import Armes.Arme;
import Armes.Epee;

public class Guerrier extends Personnage {
    
    boolean Cheval;

    public Guerrier(String Nom, int HP,boolean Cheval ) {
        super(Nom, HP);
        this.Cheval = Cheval;
        nbGuerriers++;
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
    
    public static int nbGuerriers = 0;
    
    @Override
    public void attaquer(Personnage cible){
         if (Arme_en_Main == null){
           System.out.println(nom + " n'a pas d'arme pour attaquer !");
           return;
        }
        
        int degats = Arme_en_Main.nivAtk;
        
        if(Arme_en_Main.getType() == 2){
            Epee e = (Epee) Arme_en_Main;
            degats *= e.getFiness();
            this.seFatiguer();
        }
        if (this.Cheval){
            degats /= 2;
        }
        System.out.println(nom + " attaque " + cible.nom + " et inflige " + degats + " dégâts !");
        cible.estAttaque(degats);
    }

      @Override
    public String toString() {
        return "Guerrier : " + getNom() +" Vie : " + getNivVie() +" A cheval : " + Cheval;
    }
    @Override
    public void finalize(){
        nbGuerriers--;
        super.finalize();
    }
}
