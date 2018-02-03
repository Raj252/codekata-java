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
        
        int n= scan.nextInt();
        int temp=0;
        
        int[] a=new int[n];
        
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
            
        }
        for(int i=0;i<n;i++)
        {
            for( int j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
            {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.printf("%d ",a[i]);
        }
        
        
      
      
    }
}

