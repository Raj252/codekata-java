package sieves;
import java.util.*;
/**
 *
 * @author akil
 */
public class Sieves {

    
   
    public static void main(String a[]){
       
       Scanner scan= new Scanner(System.in);
       int n=scan.nextInt();
       
       if(n%2==0)
       {
          System.out.println(n);
    
       }
       else
       {
         n=n-1;
         System.out.println(n);
    }
       }
       
}
