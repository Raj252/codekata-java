package sieves;
import java.util.*;
/**
 *
 * @author akil
 */
public class Sieves {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int po= scan.nextInt();
       int jo =scan.nextInt();
       for(int p=po;p<jo;p++)
       {
       int n=p;
        
            int hu=0;
        int o=n;
        int sum=0;
        int h;
        int mul=1;
        int temp=n;
        int cnt=0;
        while(o!=0)
        {
            
            o=o/10;
            
            cnt++;
            
        }
        if(p==1)
        {
            System.out.println(p);
        }
        else if(cnt>1)
        {
        
        while(hu<cnt)
        {
            
            int cn=cnt;
             h= temp%10;
             
            int k=h;
            mul=1;
            for(int i=1;i<=cnt;i++)
            {
                mul=mul*k;
                
            }
            sum=sum+mul;
            temp=temp/10;
            hu++;
        }
     
      //System.out.println(o);
        
        if(p==sum)
        {
            System.out.println(p);
        }
       
       // System.out.println(cnt);
            
    }
       }
     
    }
}

