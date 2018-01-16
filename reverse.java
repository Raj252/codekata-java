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
       String str = scan.next();
       StringBuilder s = new StringBuilder(str);
       s.reverse();
       System.out.println(s);
    }
    
}
