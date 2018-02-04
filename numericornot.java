package sieves;
import java.util.*;
/**
 *
 * @author akil
 */
public class Sieves {

    
   
    public static void main(String a[]){
       Scanner scan= new Scanner(System.in);
       String str= scan.nextLine();
       String str2= str.replaceAll("[1-9]", "@");
       int n=str2.length();
       int count=0;
       char[] ch=new char[n];
       ch=str2.toCharArray();
       for(int i=0;i<n;i++)
       {
           if(ch[i]=='@')
           {
               count++;
           }
           
       }
       if(count==n)
       {
           System.out.println("YES");
           
       }
       else
       {
           System.out.println("NO");
       }
        
 
    }
}
