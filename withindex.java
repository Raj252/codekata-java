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
       int [] N=new int[n];
       for(int i=0;i<n;i++)
       {
           N[i]=scan.nextInt();
       }
       for(int i=0;i<n;i++)
       {
          System.out.printf("%d ",N[i]);
          System.out.println(i);
       }
 
    }
}
