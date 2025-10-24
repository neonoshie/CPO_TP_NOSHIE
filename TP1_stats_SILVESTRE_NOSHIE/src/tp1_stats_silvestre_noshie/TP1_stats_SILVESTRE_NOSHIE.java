/*24/10/25*/
package tp1_stats_silvestre_noshie;

import java.util.Scanner;
import java.util.Random;

public class TP1_stats_SILVESTRE_NOSHIE {

    public static void main(String[] args) {
        Random generateurAleat = new Random();
        int n = generateurAleat.nextInt(6);
        int[] des = new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez un nombre entier : ");       
        int m = sc.nextInt();
        int i = 0;
    for (i = 0;i < m; i++){
        int tirage = generateurAleat.nextInt(6);
        des[tirage]++;
    }
    
    for (i = 0; des.length > i; i++){
        double pourcentage = ((des[i])*100 )/m;
    System.out.println("Face "+(i+1)+ " : "+pourcentage+ " %");
    }
  }
    
}
