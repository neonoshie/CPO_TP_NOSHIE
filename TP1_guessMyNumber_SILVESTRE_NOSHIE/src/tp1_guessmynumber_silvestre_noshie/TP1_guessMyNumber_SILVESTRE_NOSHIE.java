/*24/10/25, guess my number*/
package tp1_guessmynumber_silvestre_noshie;

import java.util.Random;
import java.util.Scanner;

public class TP1_guessMyNumber_SILVESTRE_NOSHIE {


    public static void main(String[] args) {
        // TODO code application logic here
   
    Random generateurAleat = new Random();
    int f = generateurAleat.nextInt(100);
    int m = generateurAleat.nextInt(500);
    int d = generateurAleat.nextInt(1000);
    Scanner sc = new Scanner(System.in);
    
    System.out.println(" Veuillez choisir le niveau de diffculter :\n1) Facile \n2) Moyen \n3) Difficile ");
    int a = sc.nextInt();
    if (a < 1) {
            System.out.println(" Erreur ");
        }
        else if (a >3){
            System.out.println(" Erreur ");
        }
        else if (a == 1){
    System.out.println(" Saisir un nombre entre 0 et 100");
    int Var1 = sc.nextInt();
    int i = 1;
    while (Var1!=f) {
        if (Var1<f){
        System.out.println("Trop petit");
        Var1= sc.nextInt();

    }
    else if (Var1>f){
        System.out.println("trop grand");
        Var1= sc.nextInt();
    }    
    i=i+1;
    }
    if (Var1==f);{
        System.out.println("Gagner!");
        System.out.println("Vous avez effectuer "+i+" tentatives");

    }
  }
    else if (a == 2){
    System.out.println(" Saisir un nombre entre 0 et 500");
    int Var1 = sc.nextInt();
    int i = 1;
    while (Var1!=m) {
        if (Var1<m){
        System.out.println("Trop petit");
        Var1= sc.nextInt();

    }
    else if (Var1>m){
        System.out.println("trop grand");
        Var1= sc.nextInt();
    }    
    i=i+1;
    }
    if (Var1==m);{
        System.out.println("Gagner!");
        System.out.println("Vous avez effectuer "+i+" tentatives");

    }
  }
    else if (a == 3){
    System.out.println(" Saisir un nombre entre 0 et 1000");
    int Var1 = sc.nextInt();
    int i = 1;
    while (Var1!=d) {
        if (Var1<d){
        System.out.println("Trop petit");
        Var1= sc.nextInt();

    }
    else if (Var1>d){
        System.out.println("trop grand");
        Var1= sc.nextInt();
    }    
    i=i+1;
    }
    if (Var1==f);{
        System.out.println("Gagner!");
        System.out.println("Vous avez effectuer "+i+" tentatives");

    }
  }
 }
}
