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
        int m=scan.nextInt();;
       
        m=m^n;
        n=m^n;
         m=m^n;
        System.out.println(n);
        
      System.out.println(m);
    
}
}
