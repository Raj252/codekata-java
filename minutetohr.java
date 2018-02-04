package sieves;
import java.util.*;
/**
 *
 * @author akil
 */
public class Sieves {

    
   
    public static void main(String a[]){
       Scanner scan= new Scanner(System.in);
       int n= scan.nextInt();
       if(n<60)
       {
           System.out.printf("%d ",0);
           System.out.println(n);
       }
       else
       {
           int m=n/60;
           int r=n%60;
           System.out.printf("%d ",m);
           System.out.println(r);
       }
 
    }
}
