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
        int[]a=new int[n];
        int max=0,min=100000;
      for(int i=0;i<n;i++)
      {
          a[i]=scan.nextInt();
          if(a[i]>=max)
          {
              max=a[i];
          }
          if(a[i]<=min)
          {
              min=a[i];
          }
      }
      System.out.println(min);
      System.out.println(max);
      
}
}
