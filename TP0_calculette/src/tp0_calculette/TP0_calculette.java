/*helloWorld,  Calculette, 20/10/2025*/
package tp0_calculette;

import java.util.Scanner;

/**
 *
 * @author neono
 */
public class TP0_calculette {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Please enter the operator:\n 1) add\n 2) substract\n 3) multiply\n 4) divide\n 5) modulo ");
        int operateur = sc.nextInt();
        
        System.out.println("Entrer un premier nombre entier ou a decimal: ");
        double operande1 = sc.nextFloat();
        
        System.out.println("Entrer un deuxieme nombre entier ou a decimal: ");
        double operande2 = sc.nextFloat();
        if (operateur < 1) {
            System.out.println(" Erreur ");
        }
        else if (operateur >5){
            System.out.println(" Erreur ");
        }
        else if (operateur == 1){
            System.out.println("Le resultat est: "+ (operande1 + operande2)); 
        }
        else if (operateur == 2 ){
        System.out.println("Le resultat est: "+ (operande1 - operande2));
        }
        else if (operateur == 3 ){
        System.out.println("Le resultat est: "+ (operande1 * operande2));
        }
        if (operateur == 4){
        System.out.println( "Le resultat est: "+ (operande1 / operande2));
        }
        if (operateur == 5){
        System.out.println( "Le resultat est: "+ (operande1 % operande2 ));
        }
        
        
       
        
        
        // TODO code application logic here
    }
    
}
