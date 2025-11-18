/**/
package tp3_heroic_fantasy_noshie;

public class Baton extends Arme{
    int age;

public Baton(String nomArme, int nivAttaque, int Age) {
        super(nomArme, nivAttaque);
        
    if (age > 99){
        age = 99;
      }
    else if ( age < 0){
        age = 0;
      }
    else {
        age = age;
        }
    this.age = Age;
    }
}
