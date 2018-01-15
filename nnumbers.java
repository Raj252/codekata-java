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
        int sum=0;
       
            for(int i=1;i<=a;i++)
            {
                sum+=i;
            }
            System.out.println(sum);
        
    }
    
}
