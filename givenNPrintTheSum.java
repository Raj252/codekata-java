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
       int n,sum=0;
       char[] ch=str.toCharArray();
       for(int i=0;i<len;i++)
       {
          
           String st=Character.toString(ch[i]);
           n=Integer.parseInt(st);
           sum+=n;
       }
        System.out.println(sum);
        
}
}
