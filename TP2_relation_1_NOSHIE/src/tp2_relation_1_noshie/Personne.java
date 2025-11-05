/**/
package tp2_relation_1_noshie;

public class Personne {
    String nom;
    String prenom;
    int nbVoiture;
    Voiture[] liste_voitures;
    
    public Personne(String unNom, String unPrenom){
        this.nom = unNom;
        this.prenom = unPrenom;
        liste_voitures = new Voiture[3];
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
