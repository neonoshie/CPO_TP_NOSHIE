/*05/11/25, relaton*/
package tp2_relation_1_noshie;

public class TP2_relation_1_NOSHIE {
    
    public static void main(String[] args) {
       Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ; 
       Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ; 
       Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ; 
       Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ; 
       Personne bob = new Personne("Bobby", "Sixkiller"); 
       Personne reno = new Personne("Reno", "Raines");
       bob.ajouter_voiture(uneClio);
       bob.ajouter_voiture(uneAutreClio);
       reno.ajouter_voiture(une2008);
       reno.ajouter_voiture(uneMicra);
       
       
      System.out.println("Proprietaire de la Clio : " + uneClio.proprietaire);
        System.out.println("Voiture 1 de Bob : " + bob.liste_voitures[0]);
        System.out.println("Voiture 1 de Reno : " + reno.liste_voitures[0]);
        System.out.println("Voiture 2 de Reno : " + reno.liste_voitures[1]);
    }
    
}
