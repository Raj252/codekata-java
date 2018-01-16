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
        int n = scan.nextInt();
        int mul=1;
        int p=scan.nextInt();
        for(int i =0;i<p;i++)
        {
            mul*=n;
        }
        System.out.println(mul);
    }
    
}
