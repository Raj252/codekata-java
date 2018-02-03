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
        int a=scan.nextInt();
        int d=scan.nextInt();
      int sum=a+d;
      sum=n*sum;
  
      System.out.println(sum);
      
      
    }
}
