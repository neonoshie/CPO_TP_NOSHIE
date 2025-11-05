/*05/11/25, manipulation des objets*/
package tp2_manip_noshie;



public class TP2_manip_NOSHIE {

    
    public static void main(String[] args) {
    Tartiflette assiette1 = new Tartiflette(500);
    Tartiflette assiette2 = new Tartiflette(600);
    Tartiflette assiette3 = assiette2;
    assiette2 = assiette1;
    Moussaka[] tabMoussaka = new Moussaka[10];
     for (int i = 0; i<= 10; i++){
         tabMoussaka[i] = new Moussaka(500 + i * 10);
     }
    System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
    System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);
    }
    
}
