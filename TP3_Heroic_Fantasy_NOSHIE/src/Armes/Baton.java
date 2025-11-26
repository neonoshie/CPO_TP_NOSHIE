/**/
package Armes;

public class Baton extends Arme{
    int age;
    int type;

public Baton(String nomArme, int nivAttaque, int Age) {
        super(nomArme, nivAttaque);
        
        this.type = 2;
        
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

    public int getType() {
        return type;
    }

    public int getAge() {
        return age;
    }
    

}
