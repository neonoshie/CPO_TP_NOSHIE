/**/
package Armes;

public class Epee extends Arme{
    int finess;

    public Epee(String nomArme, int nivAttaque, int Finess) {
        super(nomArme, nivAttaque);
        if (finess > 99){
            finess = 99;
          }
        else if ( finess < 0){
            finess = 0;
        }
        else {
            finess = finess;
        }
    this.finess = Finess;
    
    }

    @Override
    public String toString() {
        return "Epee{" + "finess=" + finess + '}';
    }
    
    
}
