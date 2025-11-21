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
     Epee e1 = new Epee("Excalibur",7,5);
     Epee e2 = new Epee("Durandal",4,7);
     
     Baton b1 = new Baton ("Chêne", 4, 5);
     Baton b2 = new Baton ("Charme", 5, 6); 
     
     ArrayList<Arme> ListArme = new ArrayList<>();
             ListArme.add(e1);
             ListArme.add(e2);
             ListArme.add(b1);
             ListArme.add(b2);
             
      for (Arme arme : ListArme) {
    System.out.println(arme);
    }
      Magicien m1 = new Magicien("Gandalf",65,true);
      Magicien m2 = new Magicien("Garcimore",44,false);
      
      Guerrier g1 = new Guerrier("Conan", 78, false);
      Guerrier g2 = new Guerrier( "Lannister", 45, true);
      
      ArrayList<Personnage> ListPerso = new ArrayList<>();
             ListPerso.add(m1);
             ListPerso.add(m2);
             ListPerso.add(g1);
             ListPerso.add(g2);
             
      for (Personnage personnage : ListPerso) {
    System.out.println(personnage);
    }
    }
}
