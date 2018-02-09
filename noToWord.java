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
       String vh[]={"zero","one","two","three","four","five","six","seven","eight","nine","ten"};
       int[] j={0,1,2,3,4,5,6,7,8,9,10};
       for(int i=0;i<11;i++)
       {
           if(j[i]==n)
           {
               System.out.println(vh[i]);
           }
       }
       
    }
}
