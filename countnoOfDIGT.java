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
        int n=scan.nextInt();
        int count=0;
        while(n!=0)
        {
            n=n/10;
            count++;
        }
        System.out.println(count);
}
}
