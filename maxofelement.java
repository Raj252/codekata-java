package special;
import java.util.*;
/**
 *
 * @author akil
 */
public class Special {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        int[] a= new int[10];
        int temp=0;
       for(int i=0;i<10;i++)
       {
           a[i]=scan.nextInt();
           
       }
       for(int i=0;i<10;i++)
       {
           if(a[i]>=temp)
           {
               temp=a[i];
           }
       }
       System.out.println(temp);
    }
    
}
