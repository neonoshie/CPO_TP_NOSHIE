/*classe 1*/
package tp3_heroic_fantasy_noshie;


public abstract class Arme {
    String nom;
    int nivAtk;

    public Arme(String nomArme, int nivAttaque) {
        this.nom = nomArme;
        this.nivAtk = nivAttaque;
    }

    @Override
    public String toString() {
        return "Arme{" + "nom de l'arme = " + nom + ", niveau d'attaque = " + nivAtk + '}';
    }
 
    
}
