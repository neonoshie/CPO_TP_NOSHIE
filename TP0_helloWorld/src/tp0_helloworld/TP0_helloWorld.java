/*helloWorld, Afficher un message, 20/10/2025*/
package tp0_helloworld;

import java.util.Scanner;

/**
 *
 * @author neono
 */
public class TP0_helloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println( " Bonjour ") ;
        System.out.println( " Au revoir ") ;
        String prenom;
        Scanner sc ;
        sc = new Scanner (System.in) ;
        System.out.println("Quel est votre prenom ?");
        prenom = sc.nextLine();  
    }
    
}
