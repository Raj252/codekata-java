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
        int k=scan.nextInt();
        int[] n = new int[a];
        int sum=0;
       
            for(int i=0;i<a;i++)
            {
                n[i]=scan.nextInt();
                
            }
            for(int i=0;i<k;i++)
            {
               sum+=n[i];
                
            }
            
            System.out.println(sum);
        
    }
    
}
