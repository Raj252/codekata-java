package sieves;
import java.util.*;
/**
 *
 * @author akil
 */
public class Sieves {

    
   
    public static void main(String a[]){
       Scanner scan= new Scanner(System.in);
       int h1= scan.nextInt();
        int m1= scan.nextInt();
        int h2= scan.nextInt();
        int m2= scan.nextInt();
        int h3=0,m3=0;
        if(h1>h2)
        {
            if(m1>m2)
            {
                 h3=h1-h2;
                 m3=m1-m2;
                
            }
            else
            {
                 h3=h1-h2;
                 m3=m2-m1;
            }
        }
        if(h2>h1)
        {
            if(m1>m2)
            {
                 h3=h2-h1;
                 m3=m1-m2;
                
            }
            else
            {
                 h3=h2-h1;
                 m3=m2-m1;
            }
        }
        System.out.printf("%d ",h3);
        System.out.println(m3);
        
 
    }
}
