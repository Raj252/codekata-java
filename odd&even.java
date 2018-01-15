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
        int n=scan.nextInt();
        if((n%2)==0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
    }
    
}
