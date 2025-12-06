
import java.util.Random;

/**/

/**/
public class CadenaLogic {
       
    private int[] codeSecret;
    private int tentative;
    private final int Max_tentative = 5;

    public CadenaLogic() {
        codeSecret = new int[4];
        tentative = 0;
        genererCode();
    }
    
    private void genererCode() {
        Random r = new Random();
        for (int i = 0; i < 4; i++){
            codeSecret[i] = r.nextInt(10);
        }
    }

    public int getTentative() {
        return tentative;
    }

    public int getMax_tentative() {
        return Max_tentative;
    }
    
    public void reset(){
        tentative = 0;
        genererCode();
    }
}
