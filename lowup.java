/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class lowup
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				char ch=str.charAt(i);
				int temp=(int) ch;
				temp=temp-32;
				ch=(char) temp;
				System.out.print(ch);
			}
			else if(str.charAt(i)>='A' && str.charAt(i)<='Z')
				{
					char ch=str.charAt(i);
					int temp=(int) ch;
					temp=temp+32;
					ch=(char) temp;
					System.out.print(ch);
				}
				else
				{
				System.out.print(str.charAt(i));
			}
		}
	}
}
