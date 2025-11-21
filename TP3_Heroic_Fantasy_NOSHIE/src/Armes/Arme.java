/*classe 1*/
package Armes;

public abstract class Arme {

    String nom;
    int nivAtk;

    public Arme(String nomArme, int nivAttaque) {
        if (nivAtk > 100) {
            nivAtk = 100;
        } else if (nivAtk < 0) {
            nivAtk = 0;
        } else {
            nivAtk = nivAtk;
        }
        this.nom = nomArme;
        this.nivAtk = nivAttaque;

    }

    @Override
    public String toString() {
        return "Arme{" + "nom=" + nom + ", nivAtk=" + nivAtk + '}';
    }

    public String getNom() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getType() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    

}
