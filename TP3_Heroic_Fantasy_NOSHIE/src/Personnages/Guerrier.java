
package Personnages;

public class Guerrier extends Personnage {
    
    boolean Cheval;

    public Guerrier(String Nom, int HP,boolean Cheval ) {
        super(Nom, HP);
        this.Cheval = Cheval;
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
