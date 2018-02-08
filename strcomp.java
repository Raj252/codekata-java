/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        int cnt1=0,cnt2=0;
        String name=scan.next();
        int n = name.length();
        String name2= scan.next();
        int n2=name2.length();
       char[] ch= new char[n];
       char[] ch2= new char[n2];
       if(n==n2)
       {
        int v= name.compareTo(name2);
        if(v>0)
        {
            System.out.println(name);
        }
        else if(v<0)
        {
            System.out.println(name2);
        }
        else
        {
            System.out.println("equal");
        }
       }
       else if(n>n2)
       {
           System.out.println(name);
       }
       else
       {
           System.out.println(name2);
       }
                
}
}
