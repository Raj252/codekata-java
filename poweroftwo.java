package special;
import java.util.*;
/**
 *
 * @author akil
 */
public class Special {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int r;
        for(int i=n;i>=0;i--)
        {
            if((n%2)==0)
            {
                n=n/2;
                
            }
            
            
        }
        if(n==1)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
            
      
}
}
