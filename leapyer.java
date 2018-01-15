package positive.negative;
import java.util.*;
/**
 *
 * @author akil
 */
public class PositiveNegative {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int a= scan.nextInt();
       
            int x=a-2016;
            if(x%4==0)
            {
                System.out.println("LEAP YEAR");
            }
            else
            {
                System.out.println("NO");
            }
        
    }
    
}
