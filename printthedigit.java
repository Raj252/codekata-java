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
       Scanner scan= new Scanner(System.in);
       String str=scan.next();
       int len= str.length();
       char[] ch=str.toCharArray();
       for(int i=0;i<len;i++)
       {
           System.out.printf("%s ",ch[i]);
       }
       
        
}
}

