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
        int n= scan.nextInt();
        int y=1;
        int tep=0,n2=0;
        
      for(int i=0;i<n;i++)
      {
          
          tep=n2+y;
          y=n2;
          n2=tep;
          
          System.out.printf("%d ",tep);
          
      }
    
}
}
