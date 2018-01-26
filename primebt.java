package sieves;
import java.util.*;
/**
 *
 * @author akil
 */
public class Sieves {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int k= scan.nextInt();
        
        for(int i=n+1;i<k;i++)
        {
            int count=0;
            for(int j=2;j<i;j++)
            {
                if((i%j)==0)
                        {
                           count++; 
                        }
            }
            if(count<1)
            {
                System.out.printf("%d ", i);
            }
            
        }
    }
}
