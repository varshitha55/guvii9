/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String r="";
        char f=s.charAt(0);
        r=r+Character.toUpperCase(f);
        char c[]=s.toCharArray();
        for(int i=1;i<s.length();i++)
        {
            char cur=c[i];
            char pre=c[i-1];
            if(pre==' ')
            {
                r=r+Character.toUpperCase(cur);
            }
            else
            {
                r=r+Character.toString(cur);
            }
        }
        System.out.println(r);
        
    }
}
