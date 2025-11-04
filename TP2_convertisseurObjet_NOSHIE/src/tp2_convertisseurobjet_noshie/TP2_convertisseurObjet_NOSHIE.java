/*04/11/25, CONVESRTISSEUR VERSION CLASSES*/
package tp2_convertisseurobjet_noshie;

/**/
public class TP2_convertisseurObjet_NOSHIE {
    
    public static void main(String[] args) {
        Convesrtisseur conv1 = new Convesrtisseur ();
        conv1.CelciusVersFarenheit(5);
        conv1.FarenheitVersKelvin(9);
        conv1.KelvinVersCelcius(6);
        System.out.println(conv1.nbConversions);
    }
    
}
