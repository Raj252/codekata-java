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
       int[] j=new int[100];
       int i=0,r=n%10,count=0;
       while(r!=0)
       {
       r=n%10;
       n=n/10;
       
       j[i]=r;
       i++;
       count++;
       
       }
       for( i=count-2;i>=0;i--)
       {
           System.out.printf("%d ",j[i]);
       }
       
    }
}

