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
        int sum=0;
      for(int i=0;i<n;i++)
      {
          a[i]=scan.nextInt();
        sum+=a[i];   
      }
      int avg=sum/n;
      System.out.println(avg);
      
}
}
