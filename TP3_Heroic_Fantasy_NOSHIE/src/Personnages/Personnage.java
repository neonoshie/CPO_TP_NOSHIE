/**/
package Personnages;

import Armes.Arme;
import java.util.ArrayList;


public class Personnage {
    String nom;
    int nivVie;
    
      public Personnage(String Nom, int HP) {
        this.nom = Nom;
        this.nivVie = HP;
    }

    ArrayList<Arme> inventaire = new ArrayList<>();
    Arme Arme_en_Main = null;
    
   
    public Arme getArme_en_Main() {
        return Arme_en_Main;
    }
    public Arme getArmeEnMain() { 
        return Arme_en_Main;
    }
    public int getNivVie() {
        return nivVie;
    }

    public String getNom() {
        return nom;
    }
    
    public void Ajouter_Arme(Arme a){
        if ( inventaire.size()<5){
            inventaire.add(a);
            System.out.println(a.getNom() + " ajoutée à l'inventaire de " + nom);
        }
        else { System.out.println("Inventaire plein, impossible d'ajouter l'arme !");
        }
    }
    
    public void equipeArme(int i){
        if( i >= 0 && i < inventaire.size()){
            Arme_en_Main = inventaire.get(i);
            System.out.println("Arme equipee : "+ Arme_en_Main.getNom());
        }
        else{
            System.out.println("Index invalide, impossible d'equiper une arme. ");
        }
    }

    @Override
    public String toString() {
        if (Arme_en_Main != null){
        return "Personnage{" + "nom=" + nom + ", nivVie=" + nivVie + ", inventaire=" + inventaire + ", Arme_en_Main=" + Arme_en_Main + '}';
    }


   
    
    
}
