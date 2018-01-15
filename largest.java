import java.util.*;
/**
 *
 * @author akil
 */
public class PositiveNegative {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int [] a = new int[3];
        int temp=0;
        for( int i=0;i<3;i++)
        {
            a[i]= scan.nextInt();
            if(a[i]>temp)
            {
                temp=a[i];
            }
        }
        System.out.println(temp);
        
    }
    
}
