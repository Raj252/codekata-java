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
        for(int i=1;i<=10;i++)
        {
            if(n==i)
            {
                System.out.print("Yes");
            }
        }
}
}
