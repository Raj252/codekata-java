package positive;
import java.util.*;
/**
 *
 * @author akil
 */
public class Positive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int coun=0;
        for(int i=2;i<s;i++)
        {
            if(s%i==0)
            {
                coun++;
            }
            
        }
        if(coun>=1)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
    
}
