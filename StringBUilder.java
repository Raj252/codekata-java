package positive.negative;
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
		Scanner scan =new Scanner(System.in);
                String str1= scan.nextLine();
                StringBuilder sb = new StringBuilder(str1);
                sb.reverse();
                String hr = sb.toString();
                if(str1.equalsIgnoreCase(hr))
                {
                    System.out.println("PALINDROME");
                }
                else
                {
                    System.out.println("NOT A PALINDROME");
                }
                    
                
            
        }
		
		

	    
}
