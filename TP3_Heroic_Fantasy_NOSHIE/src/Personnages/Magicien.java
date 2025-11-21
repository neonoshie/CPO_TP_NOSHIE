
package Personnages;

public class Magicien extends Personnage{
    
   boolean confirme;

    public Magicien(String Nom, int HP,boolean confirme ) {
        super(Nom, HP);
        this.confirme = confirme;
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