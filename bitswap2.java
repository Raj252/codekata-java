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
         // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        int j= scan.nextInt();
        int m=scan.nextInt();;
       
        m=m^j;
        j=m^j;
         m=m^j;
        System.out.println(j);
        
      System.out.println(m);
}
}
