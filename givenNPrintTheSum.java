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
       
       int sum=0;
       int i=0,r=n%10;
       while(r!=0)
       {
       r=n%10;
       n=n/10;
       
       sum+=r;
       i++;
       
       
       }
       System.out.print(sum);
       
       
    }
}
