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
        char ch = scan.next().charAt(0);
        
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            System.out.println("vowel");
        }
        else
        {
            System.out.println("constant");
        }
    }
    
}
