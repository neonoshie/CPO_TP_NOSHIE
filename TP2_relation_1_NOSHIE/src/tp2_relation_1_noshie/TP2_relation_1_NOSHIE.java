/*05/11/25, relaton*/
package tp2_relation_1_noshie;

public class TP2_relation_1_NOSHIE {
    
    public static void main(String[] args) {
       Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ; 
       Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ; 
       Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ; 
       Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ; 
       Personne bob = new Personne("Bobby", "Sixkiller"); 
       bob.liste_voitures[0] = uneClio ;
       bob.liste_voitures[1] = une2008;
       bob.nbVoiture = 2 ; 
       uneClio.proprietaire = bob ;
       une2008.proprietaire = bob ; 
       
       System.out.println("la premiere voiture de Bob est " + bob.liste_voitures[0] );
       System.out.println("la deuxieme voiture de Bob est " + bob.liste_voitures[1] );
       Personne reno = new Personne("Reno", "Raines");
       reno.liste_voitures[0] = uneMicra ;
       reno.liste_voitures[1] = uneAutreClio;
       reno.nbVoiture = 2 ; 
       uneMicra.proprietaire = reno ;
       uneAutreClio.proprietaire = reno ; 
       
    }
    
}
