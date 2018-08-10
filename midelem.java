/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class midelem
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1="",str2="";
		if(str.length()%2==0)
		{
			int n=str.length()/2-1;
			for(int i=0;i<n;i++)
			{
				str1 +=str.charAt(i);
			}
			str1 += "**";
			n += 2;
			for(int i=n;i<str.length;i++)
			str1+=str.charAt(i);
		}
		else 
		{
			int n=(str.length()/2);
			for(int i=0;i<n;i++)
			{
				str1 +=str.charAt(i);
			}
			str1 += "*";
			n += 1;
			for(int i=n;i<str.length();i++)
			str1+=str.charAt(i);
		}
		System.out.println(str1);
	}
}
		
