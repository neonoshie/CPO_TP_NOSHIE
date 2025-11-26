/*12/11/25, Heritage*/
package tp3_heroic_fantasy_noshie;

import Personnages.Personnage;
import Personnages.Guerrier;
import Personnages.Magicien;
import Armes.Arme;
import Armes.Baton;
import Armes.Epee;
import java.util.ArrayList;

public class TP3_Heroic_Fantasy_NOSHIE {

    public static void main(String[] args) {
        
      Magicien m1 = new Magicien("Gandalf",65,true);
      Guerrier g1 = new Guerrier("Conan", 78, false);

      Baton b1 = new Baton ("Chêne", 4, 5);
      Baton b2 = new Baton ("Charme", 5, 6);
      Baton b3 = new Baton ("Bois Sacre", 8, 7);
      
      Epee e1 = new Epee("Excalibur",7,5);
      Epee e2 = new Epee("Durandal",4,7);
      Epee e3 = new Epee("Blood Hound Fang", 9, 9);
      
      
      ArrayList<Personnage> ListPerso = new ArrayList<>();
             ListPerso.add(m1);
             ListPerso.add(g1);
             
      for (Personnage personnage : ListPerso) {
    System.out.println(personnage);
    }
      ArrayList<Arme> ListArme = new ArrayList<>();
             ListArme.add(e1);
             ListArme.add(e2);
             ListArme.add(e3);
             ListArme.add(b1);
             ListArme.add(b2);
             ListArme.add(b3);
             
      for (Arme arme : ListArme) {
    System.out.println(arme);
    }
      g1.Ajouter_Arme(b1);
      g1.Ajouter_Arme(e1);
      g1.Ajouter_Arme(e2);
      g1.equipeArme(1);
      
      m1.Ajouter_Arme(b2);
      m1.Ajouter_Arme(b3);
      m1.Ajouter_Arme(e3);
      
      System.out.println("Nombre d'armes preferees de "+m1.getNom()+" : "+m1.getNbArmesPredilection());
      
      System.out.println("Personnages : ");
      System.out.println(g1);
      System.out.println(m1);
      
      System.out.println("Armes preferees du magicien : " + m1.getNbArmesPredilection());
      System.out.println("Armes preferees du guerrier : " + g1.getNbArmesPredilection());
      
      System.out.println("Nombre total de personnages : " + Personnage.nbPersonnages);
      System.out.println("Nombre de guerriers : " + Guerrier.nbGuerriers);
      System.out.println("Nombre de magiciens : " + Magicien.nbMagiciens);
      
      Guerrier g = new Guerrier ("Conan",80,true);
      Magicien m = new Magicien ("Merlin",60,true);
      
      
      
      g.seFatiguer();
      
      if (g.estVivant()){
          System.out.println(g.getNom()+" est toujours vivant.");
      }
      else{
          System.out.println(g.getNom()+" est mort.");
      }
      
      g.attaquer(m);
      
      System.out.println(m);
      System.out.println(g);
      
      
      
      
      
    }
}
