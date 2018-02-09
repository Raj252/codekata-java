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
       int m=scan.nextInt();
       n*=m;
       if(n%2==0)
       {
          System.out.println("EVEN");
    
       }
       else
       {
        
         System.out.println("ODD");
    }
       }
       
}


