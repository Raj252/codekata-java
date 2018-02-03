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
        int p= scan.nextInt();
      int mul=1;
      for(int i=1;i<=p;i++)
      {
          mul=mul*i;
      }
      System.out.println(mul);
    }
}

