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
      String str1=str.replaceAll("[a-zA-Z]","@");
      // System.out.println(str1);
       str1=str1.replaceAll("[1-9]","*");
       //boolean j=str.matches("{0-9}");
       //System.out.println(str1);
       char[] ch=str1.toCharArray();
       int count=0,cnt=0;
           for(int i=0;i<str1.length();i++)
           {
               if(ch[i]=='@')
               {
                   count++;
               }
               else if(ch[i]=='*')
               {
                   cnt++;
               }
           }
           if(cnt>0&&count>0)
           {
               System.out.println("YES");
           }
           else
           {
               System.out.println("NO");
           }
}
}
