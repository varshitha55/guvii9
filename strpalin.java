/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class strpalin
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1="";
		for(int i=str.length()-1;i>=0;i--)
			str1=str1+str.charAt(i);
		if(str1.equals(str))
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
