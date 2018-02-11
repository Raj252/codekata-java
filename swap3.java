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
        int a= scan.nextInt();
        int b=scan.nextInt();
        int temp=0;
        temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
    }
    
}
