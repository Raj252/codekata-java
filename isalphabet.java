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
       
        
        if(Character.isLetter(ch))
        {
            System.out.println("ALPHABET");
        }
        else
        {
            System.out.println("No");
        }
    }
    
}
