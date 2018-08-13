/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class power
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int p=sc.nextInt();
		int n1=n;
		if(p==0)
			n1=1;
		else
		{
		while(p>1)
		{
			n1=n1*n;
			p--;
		}
		}
		System.out.println(n1);
	}
}
