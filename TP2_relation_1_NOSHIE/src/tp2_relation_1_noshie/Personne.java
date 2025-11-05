/**/
package tp2_relation_1_noshie;

public class Personne {
    String nom;
    String prenom;
    int nbVoiture;
    Voiture[] liste_voitures;
    
    public Personne(String unNom, String unPrenom){
        nbVoiture = 0;
        this.nom = unNom;
        this.prenom = unPrenom;
        liste_voitures = new Voiture[3];
    }
public boolean ajouter_voiture( Voiture voiture_a_ajouter) {
    if (voiture_a_ajouter.proprietaire != null) {
        System.out.println("Erreur : la voiture a deja un proprietaire. ");
        return false; 
    }
    if (nbVoiture >= 3){
        System.out.println("Erreur : "+ prenom + "possede deja 3 voitures. ");
       return false; 
    }

    
    liste_voitures[nbVoiture] = voiture_a_ajouter;
    nbVoiture++;
    voiture_a_ajouter.proprietaire = this ; 
    return true;
    
 }
    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
